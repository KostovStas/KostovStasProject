package java_base.week_2.day_2;

import java_base.week_2.Methods;

import java.util.Scanner;

/**
 * Created by mac on 5/21/17.
 */
public class MinimumValueOfModuloInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size");

        int size = scanner.nextInt();

        System.out.println("Enter value from ");

        int from = scanner.nextInt();

        System.out.println("Enter value to");

        int to = scanner.nextInt();

        int[] array = Methods.genIntArrayRandom(size, from, to);

        int minValue = Math.abs(array[0]);

        for (int i = 1; i <array.length ; i++) {


            if (minValue > Math.abs(array[i])) {

                minValue = array[i];
            }

        }
        Methods.printArray(array);

        System.out.println("Min value in modulo is " +  Math.abs(minValue) );
    }
}
