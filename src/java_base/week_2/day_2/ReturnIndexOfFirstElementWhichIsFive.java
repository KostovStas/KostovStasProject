package java_base.week_2.day_2;

import java_base.week_2.Methods;

import java.util.Scanner;

/**
 * Created by mac on 5/21/17.
 */
public class ReturnIndexOfFirstElementWhichIsFive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size");

        int size = scanner.nextInt();

        int[] array = Methods.genIntArrayRandom(size, 4, 5);

        int indexOfFiveElement = -1;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 5) {

                indexOfFiveElement = i;
                break;
            }

        }

        Methods.printArray(array);
        System.out.println();

        System.out.println(indexOfFiveElement);

    }

}

