package some_test_task;


import com.sun.deploy.util.ArrayUtil;
import java_base.week_2.homeTaskWeek_2.ArithmeticMeanOfArray_13;

public class BinarySearchHelper {

    // generate some randome array
    public static int[] randomeArrayGanerator(int from, int to, int size) {

        int[] arrayRandome = new int[size];
        for (int i = 0; i < arrayRandome.length; i++) {
            arrayRandome[i] = (int) (Math.random() * (to - from) + from);
        }
        return arrayRandome;
    }

    // sorting some randome array (bubble sorting)
    public static int[] arraySorting(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    // print some array
    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Binary search in sorted array
    public static int binarySearch(int[] arr, int value) {

        int last = arr.length - 1;
        int first = 0;
        while (first <= last) {
            int middleIndexOfArray = (first + last) / 2;
            if (arr[middleIndexOfArray] == value) {
                return middleIndexOfArray;
            } else if (arr[middleIndexOfArray] < value) {
                first = middleIndexOfArray + 1;
            } else {
                last = middleIndexOfArray - 1;
            }
        }
        return -1; // element not found
    }


    public static int binarySearchByRecurtion(int[] array,int first, int last, int value) {

        //int[] sortedArray = arraySorting(array);
        int middleIndexOfArray = (first + last) / 2;
        if (first >= last){
            return -1; // element not found
        } else if(array[middleIndexOfArray] == value){
            return middleIndexOfArray; // middle element is our value
        } else if(array[middleIndexOfArray] < value){
            return binarySearchByRecurtion(array,middleIndexOfArray+1, last, value); // the requred is bigger than middle value
        }else {
            return binarySearchByRecurtion(array,first,middleIndexOfArray-1, value); // the requred is less than middle value
        }

    }

}
