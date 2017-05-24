package java_base.week_2.day_2;

import java_base.week_2.Methods;

import java.util.Scanner;

/**
 * Created by mac on 5/21/17.
 */
public class ReplaceNegativeElementsInArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size");

        int size = scanner.nextInt();

        System.out.println("Enter value from ");

        int from = scanner.nextInt();

        System.out.println("Enter value to");

        int to = scanner.nextInt();

        int[] array = Methods.genArrayRandom(size, from, to);

        System.out.println("Array before replacement");

        Methods.printArray(array);


        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                array[i] = Math.abs(array[i]);

            }

        }

        System.out.println("Array after replacement");


        Methods.printArray(array);





    }
}
