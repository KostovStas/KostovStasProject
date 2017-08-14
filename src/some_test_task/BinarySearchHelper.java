package some_test_task;


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
            int middle = (first + last) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (arr[middle] < value) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return -1; // element not found


    }

}
