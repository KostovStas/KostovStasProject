package java_base.week_2.homeTaskWeek_2;

import java_base.week_2.Methods;

import java.util.Scanner;

/**
 6) Find the minimum modulo element of the array (Math.abs (value))
 * 	6)Найдите минимальный по модулю элемент массива (Math.abs(value))
 */

public class MinModuloElementOfArray_6 {
    public static void main(String[] args) {

        System.out.println("Enter size of array ");

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        System.out.println("Enter the value from ");

        int from = scanner.nextInt();

        System.out.println("Enter the value to");

        int to = scanner.nextInt();

        int[] array = Methods.genIntArrayRandom(size, from, to);

        int minModuloElement = Math.abs(array[0]);

        for (int i = 0; i < array.length ; i++) {

            if(minModuloElement > Math.abs(array[i])){
                minModuloElement = array[i];

            }

        }

        Methods.printArray(array);
        System.out.println();
        System.out.println("Min modulo element of the array is - " + minModuloElement);


    }
}
