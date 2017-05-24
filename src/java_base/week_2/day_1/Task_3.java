package java_base.week_2.day_1;

import java_base.week_2.Methods;

import java.util.Scanner;

/**
 * Created by mac on 5/20/17.
 */
public class Task_3 {
    public static void main(String[] args) {

        System.out.println("How many words do you want to input? ");

        Scanner scanner = new Scanner(System.in);

        int sizeOfArray = scanner.nextInt();

        scanner.nextLine();

        String[] arrayWithStrings = new String[sizeOfArray];

        for (int i = 0; i < arrayWithStrings.length; i++) {

            System.out.println("Please enter value #" + (i+1));
            arrayWithStrings[i] = scanner.nextLine();

        }


        for (int i = 0; i <arrayWithStrings.length ; i++) {

            if(Methods.checkLetre(arrayWithStrings[i].charAt(0))) {

                arrayWithStrings[i]= arrayWithStrings[i].toUpperCase();
            }

        }

        Methods.printArray(arrayWithStrings);







    }
}
