package bmicalc;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
        BMICalc calc = new BMICalcImpl();

        boolean isTerminate = true;
        while (isTerminate) {
            System.out.println("Enter your weight in KG:");
            double weight = sc.nextDouble();
            System.out.println("Enter your height in meter:");
            double height = sc.nextDouble();

            double bmi = calc.bmi(weight, height);
            System.out.println("BMI : " + bmi);
            System.out.println("Status : " + calc.category(bmi));

            System.out.println("Calculate once again ?");
            System.out.println("1-> Yes 0-> No");
            int value = sc.nextInt();
            if (value == 1) {
                //do nothing
            } else if (value == 0) {
                isTerminate = false;
            } else
                isTerminate = false;
        }
        
    }
    
}
