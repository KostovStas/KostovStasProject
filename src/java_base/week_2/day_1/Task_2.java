package java_base.week_2.day_1;

import java.util.Scanner;

/**
 * Created by mac on 5/20/17.
 */
public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first value ");
        String firstValue = scanner.nextLine();

        System.out.println("Enter the second value ");
        String secondValue = scanner.nextLine();

        if (firstValue.length() != secondValue.length()) {
            System.out.println("Not equals");
            return;
        }

        for (int i = 0; i < firstValue.length(); i++) {

            if (firstValue.charAt(i) != secondValue.charAt(i)) {
                System.out.println("Not equals");
                return;
            }


        }

        System.out.println("Congratulations values are equal");


    }
}
