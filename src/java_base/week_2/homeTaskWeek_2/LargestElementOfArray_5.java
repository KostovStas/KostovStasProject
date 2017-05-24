package java_base.week_2.homeTaskWeek_2;

import java_base.week_2.Methods;

import java.util.Scanner;

/**
 * 5) Find the largest element of the array.
 */
public class LargestElementOfArray_5 {

    public static void main(String[] args) {


        System.out.println("Enter size of array ");

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        System.out.println("Enter the value from ");

        int from = scanner.nextInt();

        System.out.println("Enter the value to");

        int to = scanner.nextInt();

        int[] array = Methods.genArrayRandom(size, from, to);

        int maxValueOfArray = 0;

        Methods.printArray(array);

        for (int i = 0; i < array.length; i++) {

            if (array[i] > maxValueOfArray) {

                maxValueOfArray = array[i];

            }

        }
        System.out.println();
        System.out.println("Max value of array is  - " + maxValueOfArray);


    }
}
