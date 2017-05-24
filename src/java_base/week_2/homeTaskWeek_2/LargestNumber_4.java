package java_base.week_2.homeTaskWeek_2;

import java.util.Scanner;

/**
 * 4) Find the largest number of a given natural number. (109042 -> 9)
 * 4)Найдите наибольшую цифру данного натурального числа.(109042 -> 9)
 */
public class LargestNumber_4 {
    public static void main(String[] args) {

        System.out.println("Enter the number");

        Scanner scanner = new Scanner(System.in);

        int largestNumber = 0;
        int value = 0;

        for (int enteredNumber = scanner.nextInt(); enteredNumber != 0; enteredNumber /= 10) {

            value = enteredNumber % 10;

            if (largestNumber<value) {
                largestNumber = value;
            }

        }
        System.out.println("The largest number is - " + largestNumber);


    }
}
