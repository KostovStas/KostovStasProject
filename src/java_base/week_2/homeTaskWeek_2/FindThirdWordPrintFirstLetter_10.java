package java_base.week_2.homeTaskWeek_2;

import java.util.Scanner;

/**
 10) Find the word in the text at number 3 and print its first letter.
 (Example: Hello world and you!
      Text.split () -> return array of words)
 */
public class FindThirdWordPrintFirstLetter_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter more then 3 words");

        String sentence = scanner.nextLine();

        String [] arrayOfWords = sentence.split(" ");

        System.out.println("The first letter of the third word is " + arrayOfWords[2].charAt(0));




    }
}
