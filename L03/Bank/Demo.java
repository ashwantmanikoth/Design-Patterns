package L03.Bank;

import java.util.Scanner;

public class Demo {
    static BankLogger bankLogger = null;

    public static void main(String args[]) {
            Thread t1= new Thread(new runner());
            Thread t2= new Thread(new runner());
            t2.start();
            t1.start();
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Enter your choice\n1-Withdraw\n2-Deposit\n3-Transfer");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("Enter amount to withdraw!");
                    choice =scanner.nextInt();
                    bankLogger.withdraw(choice);
                } else if (choice == 2) {
                    System.out.println("Enter amount to Deposit!");
                    bankLogger.deposit(scanner.nextInt());

                } else {
                    System.out.println("Enter amount to Transfer!");
                    bankLogger.transfer(scanner.nextInt());
                }
            }catch (Exception exception){

            }
        }
    }
    static class runner implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread value"+Thread.currentThread());
            bankLogger = BankLogger.createInstance("filename");
        }
    }
}
