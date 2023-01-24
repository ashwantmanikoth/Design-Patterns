import java.util.Scanner;

public class Demo {
    public static void show() {
        while(true){
            System.out.println("1 - For Gregorian\n" +
                    "2 - For Arabian\n");

            Scanner scanner = new Scanner(System.in);
            int type = scanner.nextInt();

            var scheduler = new Scheduler(type);
            scheduler.schedule(new Event());
        }
    }

    public static void main(String args[]){
        Demo.show();
    }
}
