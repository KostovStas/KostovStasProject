package java_base.week_1.homeTasksWeek_1;

import java.util.Scanner;

/**
 4.2. The user enters three numbers from the console, you need to output to the console the largest, least
 */

public class ThreeNumbersLargestAndLeast4_2 {
    public static void main(String[] args) {

        System.out.println("Enter the first number");

        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");

        int secondNumber = scanner.nextInt();

        System.out.println("Enter the third number");

        int thirdNumber = scanner.nextInt();


        if (firstNumber > secondNumber & firstNumber > thirdNumber) {

            System.out.println("The largest number is " + firstNumber);

            if (secondNumber < thirdNumber) {
                System.out.println("The least number is " + secondNumber);
            }else {
                System.out.println("The least number is " + thirdNumber);
            }
        }


           if (secondNumber > firstNumber & secondNumber > thirdNumber) {

        System.out.println("The largest number is " + secondNumber);

            if (firstNumber < thirdNumber) {
            System.out.println("The least number is " + firstNumber);
            }else {
                System.out.println("The least number is " + thirdNumber);
            }
        }


        if (thirdNumber > firstNumber & thirdNumber > secondNumber) {

        System.out.println("The largest number is " + thirdNumber);

            if (secondNumber < firstNumber ) {
            System.out.println("The least number is " + secondNumber);

            }else {
                System.out.println("The least number is " +firstNumber);
            }

        }

        if (firstNumber == secondNumber & firstNumber == thirdNumber & secondNumber == thirdNumber){
            System.out.println("All numbers are equal");
           }





    }

 }

