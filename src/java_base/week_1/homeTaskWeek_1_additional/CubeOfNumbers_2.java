package java_base.week_1.homeTaskWeek_1_additional;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * 2) Enter from the keyboard three numbers, positive cube, and negative-
 * Replace with 0.wer
 */


public class CubeOfNumbers_2 {
    public static void main(String[] args) {

        System.out.println("Enter the first number");

        Scanner scanner = new Scanner(System.in);

        double firstNumber = scanner.nextDouble();

        System.out.println("Enter the second number");

        double secondNumber = scanner.nextDouble();

        System.out.println("Enter the third number");

        double thirdNumber = scanner.nextDouble();

        // first number
        if (firstNumber > 0) {

            System.out.printf("First number is positiv, its value in the cube %.0f \n", Math.pow(firstNumber, 3.0));

        } else if (firstNumber == 0) {

            System.out.println("First number equals 0");

        } else {

            System.out.println("First number is negativ, replace it by zero 0");

            // second number
        }
        if (secondNumber > 0) {

            System.out.printf("Second number is positiv, its value in the cube %.0f \n", Math.pow(secondNumber, 3.0));

        } else if (secondNumber == 0) {

            System.out.println("Second number equals 0");

        } else {

            System.out.println("Second number is negativ, replace it by zero 0");


            //third number
        }
        if (thirdNumber > 0) {

            System.out.printf("Third number is positiv, its value in the cube %.0f \n", Math.pow(thirdNumber, 3.0));

        } else if (thirdNumber == 0) {

            System.out.println("Third number equals 0");

        } else {

            System.out.println("Third number is negativ, replace it by zero 0");
        }


    }
}
