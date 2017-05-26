package java_base.week_2.homeTaskWeek_2;

import java.util.Scanner;

/**
 * 16) Посчитать колличество букв 'a' в строке (искомый символ может быть разным)
 * <p>
 * 16) Count the number of letters 'a' in the string (the character you are looking for may be different)
 */

public class CountLettreAInString_16 {
    public static void main(String[] args) {

        System.out.println("Enter some string");

        Scanner scanner = new Scanner(System.in);

        String enteredString = scanner.nextLine();

        char[] newCharArray = enteredString.toCharArray();

        int totalCounOfA = 0;

        char lettreA = 'a';

        for (int i = 0; i < newCharArray.length; i++) {

            if (newCharArray[i] == lettreA){

                totalCounOfA ++;
            }

        }
        System.out.println("Total count of 'a' = " + totalCounOfA);


    }
}
