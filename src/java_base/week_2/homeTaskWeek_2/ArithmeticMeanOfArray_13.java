package java_base.week_2.homeTaskWeek_2;

import java_base.week_2.Methods;

import java.util.Scanner;

/**
 13)Найдите среднее арифметическое массива из 10 элементов типа double.
 13) Find the arithmetic mean of an array of 10 double elements.

 */


public class ArithmeticMeanOfArray_13 {

    public static void main(String[] args) {

        System.out.println("Enter size of array ");

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        System.out.println("Enter the value from ");

        int from = scanner.nextInt();

        System.out.println("Enter the value to");

        int to = scanner.nextInt();

        double [] arrayOfDoubles =Methods.genDoubleArrayRandom(size, from, to);

        double sumOfElements = 0;

        Methods.printArray(arrayOfDoubles);


        for (int i = 0; i <arrayOfDoubles.length ; i++) {
            sumOfElements = sumOfElements + arrayOfDoubles[i];

        }
        System.out.println();
        System.out.println("Arithmetic mean of an array is " + (sumOfElements/size));






    }
}


