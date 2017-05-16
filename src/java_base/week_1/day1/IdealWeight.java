package java_base.week_1.day1;

import java.util.Scanner;

/**
 * Formula of ideal weight
 */

public class IdealWeight {
    public static void main(String[] args) {

        System.out.println("Enter your weight");
        Scanner scanner = new Scanner(System.in);

        int weight = scanner.nextInt();

        System.out.println("Enter your height");

        int height = scanner.nextInt();

        if (height - 100 == weight) {

            System.out.println("You have the ideal weight");
        }

        if (height - 100 < weight) {

            System.out.println("You should lose some weight");
        } else {

            if (height - 100 > weight) {
                System.out.println("You should gain a little weight");
            }

        }

    }
}
