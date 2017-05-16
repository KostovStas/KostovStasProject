package java_base.week_1.homeTasksWeek_1;

import java.util.Scanner;

/**
 4.8. Enter two numbers, compare the last digit of these numbers (use the operator%)
 124 4 - true
 1456 567 - false
 1 2 - false
 18 98 - true
 */
public class CompareLastNumbers4_8 {
    public static void main(String[] args) {

        System.out.println("Eter the firs number");

        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number");

        int secondNumber = scanner.nextInt();

        if (firstNumber % 10 == secondNumber % 10){

            System.out.println("true");

        }else {
            System.out.println("false");
        }


    }
}
