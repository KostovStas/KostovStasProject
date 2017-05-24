package java_base.week_2.homeTaskWeek_2;

import java_base.week_2.Methods;

/**
 1) Given the natural numbers from 35 to 87.
 Output to the console those of them that, when divided by 7, give the remainder 1, 2 or 5.
 */

public class NaturalNumbers_1 {
    public static void main(String[] args) {

        int [] array = new int [53];

        for (int i  = 0; i < array.length; i++){

            array [i] = i+35;
        }

        for (int i = 0; i < array.length ; i++) {

            if (array[i] %7 == 1 || array[i] %7 == 2 || array[i] %7 == 5){

                System.out.println(array[i]);
            }



        }





        Methods.printArray(array);

    }
}
