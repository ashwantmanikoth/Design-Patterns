package L02_E02;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        HomePage homePage = new HomePage();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 : Weight Loss\n 2 : Build Muscle\n 3 : Strength training");
        int a = scanner.nextInt();
        GoalFactory goalFactory;
        if (a == 1){
            goalFactory = new WeightLossFactory();
        }else if(a ==2){
            goalFactory = new BuildMuscleFactory();
        }else {
            goalFactory = new StrengthTrainingFactory();
        }

        homePage.setGoal(goalFactory);

    }
}
