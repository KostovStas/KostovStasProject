package java_base.week_2.homeTaskWeek_2;

import java.util.Scanner;

/**
 * 3) Find the number of even digits of a given natural number.
 */

public class CountOfEvenDigits_3 {
    public static void main(String[] args) {

        System.out.println("Enter the number");

        Scanner scanner = new Scanner(System.in);

        int value = 0;
        int countOfEvenNumbers = 0;
        int countOfOddNumber = 0;

        for (int enteredNumber = scanner.nextInt(); enteredNumber != 0; enteredNumber /= 10) {

            value = enteredNumber % 10;

            if (value % 2 == 0) {

                countOfEvenNumbers = countOfEvenNumbers + 1;
            } else {
                countOfOddNumber = countOfOddNumber + 1;
            }


        }
        System.out.println("Count of even numbers = " + countOfEvenNumbers
        );
        System.out.println("Count of odd numbers = " + countOfOddNumber);


    }
}
