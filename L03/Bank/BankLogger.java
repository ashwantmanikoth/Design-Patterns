package L03.Bank;

import java.util.HashMap;

public class BankLogger {
    private String fileName;
    private static BankLogger instance = null;
    private static HashMap<String, BankLogger> instanceMap = new HashMap<>();


    private BankLogger(String fileName) {
        this.fileName = fileName;
    }

    public static BankLogger createInstance(String fileName) {
        if (instanceMap.isEmpty() || !instanceMap.containsKey(fileName)) {
            synchronized (BankLogger.class) {
                if (instanceMap.isEmpty() || !instanceMap.containsKey(fileName)) {
                    System.out.println("Creating new BankLogger instance");
                    instance = new BankLogger(fileName);
                    instanceMap.put(fileName, instance);
                }
            }
        } else if (instanceMap.containsKey(fileName)) {
            System.out.println("using existing BankLogger instance");
            instance = instanceMap.get(fileName);
        }
        return instance;
    }

    public void withdraw(int i) {
        System.out.println("Withdraw amount is " + i);
    }

    public void deposit(int i) {
        System.out.println("Deposit amount is " + i);
    }

    public void transfer(int i) {
        System.out.println("Transfer amount is " + i);
    }
}