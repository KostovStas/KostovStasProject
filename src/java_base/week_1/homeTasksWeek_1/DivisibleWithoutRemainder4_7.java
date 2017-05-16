package java_base.week_1.homeTasksWeek_1;

import java.util.Scanner;

/**
 * 4.7. Enter two numbers, if one of them is divisible by the other without a remainder, then we derive tru and show the result of division (the integer part of division and the remainder)
 * Otherwise output false and show the result of division (the integer part of the division and the remainder)
 */
public class DivisibleWithoutRemainder4_7 {
    public static void main(String[] args) {

        Scanner scnner = new Scanner(System.in);

        System.out.println("Enter the first number");

        double firstNumber = scnner.nextDouble();

        System.out.println("Enter the second number");

        double secondNumber = scnner.nextDouble();

        //double firstDivision = firstNumber % secondNumber;


        if (firstNumber % secondNumber == 0) {

            System.out.println("The first number " + firstNumber + " is divisible by the "
                                         + secondNumber + " without a remainder = " + "tru " + (firstNumber / secondNumber));

        } else if (secondNumber % firstNumber == 0) {

            System.out.println("The second number " + secondNumber + " is divisible by the "
                                         + firstNumber + " without a remainder = " + "tru " + (secondNumber / firstNumber));

        } else if (firstNumber % secondNumber != 0) {

            System.out.println("False " + (firstNumber / secondNumber));

        } else if (secondNumber % firstNumber != 0) {

            System.out.println("False " + (secondNumber / firstNumber));
        }
    }
}

