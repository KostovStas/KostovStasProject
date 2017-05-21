package java_base.week_2.homeTaskWeek_2;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.Scanner;

/**
 * Created by mac on 5/21/17.
 */
public class SwitchCalculator {
    public static void main(String[] args) {

        System.out.println("Hello, my dear friend!");
        System.out.println();

        whileLoop:

        while (true) {

            System.out.println("Do you want to calculate something? 0 / 1");

            Scanner scanner = new Scanner(System.in);

            int userChoice = scanner.nextInt();

            if (userChoice == 0) {

                System.out.println("Buy. Have a nice day");
                break;
            }

            if (userChoice != 1) {
                System.out.println("Incorrec input value");
                continue;

            }

            System.out.println("Enter the first number");

            int firstNumber = scanner.nextInt();

            System.out.println("Enter the second number");

            int secondNumber = scanner.nextInt();

            System.out.println("Please choose the operation: ");
            System.out.println("1 - +");
            System.out.println("2 - -");
            System.out.println("3 - *");
            System.out.println("4 - /");

            int selectedOperation = scanner.nextInt();


            if (!(selectedOperation == 1 || selectedOperation == 2
                    || selectedOperation == 3 || selectedOperation == 4)) {

                System.out.println("Wrong input");
                continue;
            }

            switch (selectedOperation) {

                case 1:
                    System.out.println("The sum of two numbers = " + (firstNumber + secondNumber ));
                    break;

                case 2:
                    System.out.println("Difference of two numbers = " + (firstNumber - secondNumber));
                    break;
                case 3:
                    System.out.println("The result of multiplying two numbers is = " + (firstNumber * secondNumber));
                    break;
                case 4:
                    System.out.println("The result of dividing two numbers = " + (firstNumber / secondNumber));
                    break;
            }


        }


    }
}
