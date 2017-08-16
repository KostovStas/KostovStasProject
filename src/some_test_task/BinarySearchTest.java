package some_test_task;


public class BinarySearchTest {
    public static void main(String[] args) {


        int val = 1;
        int[] array = {0, 1, 2, 13, 14, 15, 16, 17, 18, 19};


        System.out.println(BinarySearchHelper.binarySearch(array, 2));
        System.out.println("-----");
        System.out.println(BinarySearchHelper.binarySearchByRecurtion(array, 0,19,2));

        


    }

}
