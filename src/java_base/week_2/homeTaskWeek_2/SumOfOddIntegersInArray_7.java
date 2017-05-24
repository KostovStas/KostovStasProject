package java_base.week_2.homeTaskWeek_2;

import java_base.week_2.Methods;

import java.util.Scanner;

/**
 * 7) It is necessary to sum up all odd integers in the range that the user will enter from the keyboard.
 * 7)Необходимо суммировать все нечётные целые числа в диапазоне, который введёт пользователь с клавиатуры.
 */
public class SumOfOddIntegersInArray_7 {

    public static void main(String[] args) {

        System.out.println("Enter the value from");

        Scanner scanner = new Scanner(System.in);

        int valueFrom = scanner.nextInt();

        System.out.println("Enter the value to");

        int valueTo = scanner.nextInt();

        int sumOfOddIntegersInRange = 0;

        for (int i = valueFrom; i <= valueTo; i++) {

            if (i % 2 !=0 ){
             sumOfOddIntegersInRange = sumOfOddIntegersInRange + i;

            }


        }
        System.out.println(sumOfOddIntegersInRange);

    }
}
