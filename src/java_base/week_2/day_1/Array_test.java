package java_base.week_2.day_1;

import java_base.week_2.Methods;

import java.util.Scanner;
/**
 * Created by sf on 20.05.17.
 */
public class Array_test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input array size");

        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter value #" + (i + 1));
            numbers[i] = scanner.nextInt();

            numbers[i] = numbers[i] > 0? (int) Math.pow(numbers[i], 3) : 0;
        }

        Methods.printArray(numbers);




    }

}
