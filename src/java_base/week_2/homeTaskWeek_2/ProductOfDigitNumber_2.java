package java_base.week_2.homeTaskWeek_2;

import java.util.Scanner;

/**
 2) Find the product of the digits of a number.
 */

public class ProductOfDigitNumber_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");

        int sum = 1;

        for (int enteredNumber = scanner.nextInt(); enteredNumber != 0; enteredNumber /= 10) {

            sum = sum * (enteredNumber % 10);

        }

        System.out.println(sum + " ");




    }
}
