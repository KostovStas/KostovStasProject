package java_base.week_2.homeTaskWeek_2;

import java_base.week_2.Methods;

import java.util.Scanner;


 /** 9) Create an array, the size of which is assigned by the user from the console.
 * Fill it randomly from 0 to 10. Find and return the index of the first element which is = 5.
 * If such an element is not found - return -1
*/

public class IndexOfFirstElementWhichIsFive_9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size");

        int arraySize = scanner.nextInt();

        int[] array = Methods.genIntArrayRandom(arraySize, 0, 10);

        int indexOfElement = -1;


        for (int i = 0; i < array.length; i++) {

            if (array[i] == 5) {

                indexOfElement = i;
                break;

            }

        }
        Methods.printArray(array);
        System.out.println();
        System.out.println(indexOfElement);


    }
}
