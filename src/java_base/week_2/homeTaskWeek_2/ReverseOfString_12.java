package java_base.week_2.homeTaskWeek_2;

import java_base.week_2.Methods;

import java.util.Scanner;

/**
 12)Реализовать метод, который делает реверс строки (StringBuffer не использовать)
 12) Implement a method that does the reverse of a string (do not use StringBuffer)

 */
public class ReverseOfString_12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sentences please");

        String sentence = scanner.nextLine();

        System.out.println("String before revers - " + sentence );

        Methods.reverseString(sentence);

    }
}
