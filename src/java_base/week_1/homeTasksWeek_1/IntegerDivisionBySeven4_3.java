package java_base.week_1.homeTasksWeek_1;

import java.util.Scanner;

/**
 4.3. The user enters a number. Display its double value if the number is divided by 7 whole.
 */

public class IntegerDivisionBySeven4_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any positive number ");

        int number = scanner.nextInt();

        if ( number % 7 == 0){
            System.out.println("Double value of " + number*2);
        }else {
            System.out.println("You entered number isn't divided by 7 whole ");
        }

    }
}
