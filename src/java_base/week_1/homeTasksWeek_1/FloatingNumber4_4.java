package java_base.week_1.homeTasksWeek_1;

import java.util.Scanner;

/**
 4.4. Enter the floating-point number from the console, and check whether it lies in the range from 0 to 1
 .
 */
public class FloatingNumber4_4 {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter number in the range from 0 to 1");

     float number = scanner.nextFloat();

     if (number <= 0 || number <= 1 )
     {
         System.out.println("Your enter number " + number+ " is in the range from 0 to 1");

     }else{
         System.out.println("Your enter number " + number+ " isn't in the range from 0 to 1");
     }

    }

}
