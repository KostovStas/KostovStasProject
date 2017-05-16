package java_base.week_1.homeTasksWeek_1;

import java.util.Scanner;

/**
 4.5. We enter 2 numbers. If the first number is greater than the second, then display the difference of numbers. If the second is greater, then we deduce the sum.
 */
public class SumAndDifferenceOfNumbers4_5 {

    public static void main(String[] args) {

        System.out.println("Entr the first number");
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");

        int secondNumber = scanner.nextInt();

        if (firstNumber>secondNumber){
            System.out.println("The first number is greater than the second number, difference of numbers are " + (firstNumber - secondNumber));

        }else {

            if(secondNumber>firstNumber){
                System.out.println("The second number is greater than the first number, sum of numbers are " + (secondNumber + firstNumber));

            }  else{
                System.out.println("The first number " + firstNumber + " and the second number " + secondNumber+ " are equal" );
            }

        }


    }
}
