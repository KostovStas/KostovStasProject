package java_base.week_1.homeTaskWeek_1_additional;

import java.util.Scanner;

/**
 5) Three numbers a, b, c are given. Determine whether there is at least one of them
 Pair of equal
 */

public class PairOfequalNumbers_5 {

    public static void main(String[] args) {

        System.out.println("Enter the firs number");

        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");

        int secondNumber = scanner.nextInt();

        System.out.println("Enter the third number");

        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber && firstNumber == thirdNumber){

            System.out.println("All numbers are equals");

        } else if(firstNumber == secondNumber){

            System.out.println("First number - " +firstNumber+ " is equals to the second number - " + secondNumber);

        } else if (secondNumber == thirdNumber) {

            System.out.println("Second number - " + secondNumber + " is equals to the third number - " +  thirdNumber);

        } else if (firstNumber == thirdNumber) {

            System.out.println("First number - " +firstNumber+ " is equals to the third number - " + thirdNumber);

        }else {

            System.out.println("There aren't equal numbers");
        }


    }
}
