package some_test_task;


import java.util.Scanner;
import java.util.StringJoiner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your value");
        String value = scanner.nextLine();

        if (value.toCharArray().length < 2) {
            System.out.println("Entered value should have more than one character");

        } else {
            char[] arrayOfChars = value.toCharArray();
            String reversValue = "";
            for (int i = arrayOfChars.length - 1; i >= 0; i--) {
                reversValue = reversValue + arrayOfChars[i];
            }
            if (value.equals(reversValue)) {
                System.out.println("Your ertered value " + value + " is Palindrome");

            } else {
                System.out.println("Your ertered value " + value + " isn't Palindrome");
            }

        }
    }

}
