package java_base.week_2.day_2;

import java_base.week_2.Methods;

import java.util.Scanner;

/**
 * Created by mac on 5/21/17.
 */
public class MinAndMaxValueInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size");

        int size = scanner.nextInt();

        System.out.println("Enter value from ");

        int from = scanner.nextInt();

        System.out.println("Enter value to");

        int to = scanner.nextInt();

        int[] array = Methods.genArrayRandom(size, from, to);

        int indexOfMaxElement = 0;
        int maxValue = array[0];
        int indexOfMinValue = 0;
        int minValue = array[0];


        for (int i = 1; i < array.length; i++) {

            if (maxValue < array[i]) {

                maxValue = array[i];
                indexOfMaxElement = i;
            }

            if (minValue > array[i]) {

                minValue = array[i];
                indexOfMinValue = i;
            }
        }


        Methods.printArray(array);

        System.out.println("Max value is - " + maxValue + " " + "Index of element is - " + indexOfMaxElement);
        System.out.println("Min value is - " + minValue + " " + "Index of element is - " + indexOfMinValue);


        array[indexOfMaxElement] = minValue;

        array[indexOfMinValue] = maxValue;

        Methods.printArray(array);


    }
}
