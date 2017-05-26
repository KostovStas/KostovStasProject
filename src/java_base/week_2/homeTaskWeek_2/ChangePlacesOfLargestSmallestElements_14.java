package java_base.week_2.homeTaskWeek_2;

import java_base.week_2.Methods;

import java.util.Scanner;

/**
 * 14) Поменять
 * местами наибольший и наименьший элементы в массиве
 * <p>
 * 14) Change
 * In places the largest and smallest elements in the array
 */
public class ChangePlacesOfLargestSmallestElements_14 {
    public static void main(String[] args) {


        int[] array = Methods.genIntArrayRandom(10, 0, 10);


        int indexOfMaxElement = 0;
        int maxValue = array[0];
        int indexOfMinValue = 0;
        int minValue = array[0];

        System.out.println("Array before replace ");
        Methods.printArray(array);

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


        System.out.println("Max value is - " + maxValue + " " + "Index of element is - " + indexOfMaxElement);
        System.out.println("Min value is - " + minValue + " " + "Index of element is - " + indexOfMinValue);


        array[indexOfMaxElement] = minValue;

        array[indexOfMinValue] = maxValue;

        System.out.println("Array after replace ");

        Methods.printArray(array);


    }
}
