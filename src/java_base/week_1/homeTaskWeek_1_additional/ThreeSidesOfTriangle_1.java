package java_base.week_1.homeTaskWeek_1_additional;

import java_base.utils.ArrayUtils;

import java.util.Scanner;

/**
 * Enter from the keyboard the values of the three sides of triangle a, b and c and determine whether it is rectangular. Answer output as a message.
 * <p>
 * Correc input value 3,4,5 for giving correct result
 */
public class ThreeSidesOfTriangle_1 {

    public static void main(String[] args) {

        System.out.println("Enter the first side ot the triangle");

        Scanner scanner = new Scanner(System.in);

        int firstSide = scanner.nextInt();

        System.out.println("Enter the second side ot the triangle");

        int secondSide = scanner.nextInt();

        System.out.println("Enter the third side ot the triangle");

        int thirdSide = scanner.nextInt();

        if (firstSide * firstSide == (secondSide * secondSide) + (thirdSide * thirdSide)) {

            System.out.println("By the Pythagorean theorem, the triangle is rectangular");

        } else if (secondSide * secondSide == (firstSide * firstSide) + (thirdSide * thirdSide)) {

            System.out.println("By the Pythagorean theorem, the triangle is rectangular");

        } else if (thirdSide * thirdSide == (firstSide * firstSide) + (secondSide * secondSide)) {

            System.out.println("By the Pythagorean theorem, the triangle is rectangular");

        } else {

            System.out.println("Sorry, the triangle is rectangular");
        }


    }
}
