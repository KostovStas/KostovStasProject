package java_base.week_1.homeTaskWeek_1_additional;

import java.util.Scanner;

/**
 3) A three-digit number is given. Determine: a) Is it true that all of its figures
 the same; B) whether among its figures are the same.
 */


public class ThreeDigitNumber_3 {
    public static void main(String[] args) {

        System.out.println("Enter a three-digit number");

        Scanner scanner = new Scanner(System.in);

        int threeDigitNumber = scanner.nextInt();

        int lastNumberOfThreeDigitNumber = threeDigitNumber % 10;

        int secondNumberOfThreeDigitNumber = (threeDigitNumber / 10) % 10;

        int firstNumberOfThreeDigitNumber = (threeDigitNumber / 100);



        if(threeDigitNumber < 100 || threeDigitNumber > 1000 ){

            System.out.println("Your entered number isn't a three-digit number");

        } else {

            if (firstNumberOfThreeDigitNumber == secondNumberOfThreeDigitNumber && firstNumberOfThreeDigitNumber == lastNumberOfThreeDigitNumber
                    && secondNumberOfThreeDigitNumber == lastNumberOfThreeDigitNumber) {

                System.out.println("All numbers in three-digit number are equals ");

            } else if (firstNumberOfThreeDigitNumber == secondNumberOfThreeDigitNumber || firstNumberOfThreeDigitNumber == lastNumberOfThreeDigitNumber
                    || secondNumberOfThreeDigitNumber == lastNumberOfThreeDigitNumber) {

                System.out.println("Two numbers in three-digit number are equals");
            }
        }

    }
}
