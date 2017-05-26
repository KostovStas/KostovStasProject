package java_base.week_2.homeTaskWeek_2;

import java_base.week_2.Methods;

import java.util.Scanner;

/**
 * 11) Implement a method that swaps words in a string consisting of two words.
 */

public class SwapsWordsInString_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two words");

        String sentence = scanner.nextLine();

        String[] arrayOfWords = sentence.split(" ");


        System.out.println("Array before");

        Methods.printArray(arrayOfWords);
        System.out.println();

        arrayOfWords = Methods.сhangeTwoWordsInString(2,arrayOfWords);

        System.out.println("Array after");
        Methods.printArray(arrayOfWords);


    }
}
