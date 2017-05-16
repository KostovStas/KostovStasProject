package java_base.week_1.homeTasksWeek_1;

import java.util.Scanner;

/**

 4.6. Enter two numbers, print their sum, if it is in the range from 11 to 19.

 */
public class SumOfNumbersInRange4_6 {
    public static void main(String[] args) {

        Scanner scnner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int firstNumber = scnner.nextInt();

        System.out.println("Enter the second number");

        int secondNumber = scnner.nextInt();


        int sum = firstNumber + secondNumber;

        if (sum >=11 & sum <=19){

            System.out.println("Sum of the first number " + firstNumber + " and the second number " + secondNumber + " is in the range from 11 to 19.");
        }else {
            System.out.println("Sum of the first number " + firstNumber + " and the second number " + secondNumber + " isn't in the range from 11 to 19.");
        }
    }
}
