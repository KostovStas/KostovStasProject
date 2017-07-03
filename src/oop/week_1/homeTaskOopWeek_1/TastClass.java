package oop.week_1.homeTaskOopWeek_1;

/**
 * Created by mac on 6/25/17.
 */
public class TastClass {

    public static void main(String[] args) {


        Array array = new Array(4);
        array.fillWithRandomNumbers(1, 4);
        array.arraySort();
        array.printArray();
        Array array2 = new Array(2);
        array2.arrayExpantion();
        array2.arraySort();
        array2.fillWithRandomNumbers(1, 4);
        array2.printArray();

        System.out.println(array.equals(array2));


    }
}
