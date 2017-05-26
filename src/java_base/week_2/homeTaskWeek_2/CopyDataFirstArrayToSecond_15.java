package java_base.week_2.homeTaskWeek_2;

import java_base.week_2.Methods;

/**

 5) Заданы два массива одинаковой длинны с любыми значениями, скопировать данные из первого массива во второй

 5) Given two arrays of the same length with any values, copy the data from the first array to the second

 */
public class CopyDataFirstArrayToSecond_15 {
    public static void main(String[] args) {

        String [] firstArray = {"1", "2", "3"} ;
        String [] secondArray = (String [])firstArray.clone();

        Methods.printArray(secondArray);

        //or
        int [] newFirstArray = {1,2,3,4,5};
        int [] newSecondArray = new int[newFirstArray.length];

        for (int i = 0; i <newFirstArray.length ; i++) {

            newSecondArray[i]=newFirstArray[i];

        }
        Methods.printArray(newSecondArray);




    }
}
