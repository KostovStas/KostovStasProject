package java_base.week_2.homeTaskWeek_2;

import java.util.Scanner;

/**
 * 8) Create a schedule for the week. The user enters the day of the week and displays what is scheduled for that day.
 */

public class ScheduleForTheWeek_8 {

    public static void main(String[] args) {

        System.out.println("Hello, my darling ");

        whileLoop:
        while (true) {

            System.out.println("Do you want to see you schedule? yes/no");

            Scanner scanner = new Scanner(System.in);

            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("no")) {

                System.out.println("Buy. Have a nice day");
                break;
            }

            if (userChoice.equalsIgnoreCase("yes")) {


                System.out.println("Enters the day of the week ");

                System.out.println("1 - Monday");
                System.out.println("2 - Tuesday");
                System.out.println("3 - Wednesday");
                System.out.println("4 - Thursday");
                System.out.println("5 - Friday");
                System.out.println("6 - Saturday");
                System.out.println("7 - Sunday");

                int dayOfWeek = scanner.nextInt();

                if (!(dayOfWeek == 1 || dayOfWeek == 2
                        || dayOfWeek == 3 || dayOfWeek == 4 || dayOfWeek == 5 || dayOfWeek == 6 || dayOfWeek == 7)) {

                    System.out.println("Wrong input");
                    continue;
                }

                switch (dayOfWeek) {
                    case 1:
                        System.out.println("Your Monday schedule is:");
                        System.out.println("1. Java");
                        System.out.println("2. Done some tasks");
                        break;

                    case 2:
                        System.out.println("Your Tuesday schedule is:");
                        System.out.println("1. Java");
                        System.out.println("2. Done some tasks");
                        break;

                    case 3:
                        System.out.println("Your Wednesday schedule is:");
                        System.out.println("1. Java");
                        System.out.println("2. Done some tasks");
                        break;

                    case 4:
                        System.out.println("Your Thursday schedule is:");
                        System.out.println("1. Java");
                        System.out.println("2. Done some tasks");
                        break;

                    case 5:
                        System.out.println("Your Friday schedule is:");
                        System.out.println("1. Java");
                        System.out.println("2. Done some tasks");
                        break;

                    case 6:
                        System.out.println("Your Saturday schedule is:");
                        System.out.println("1. Java");
                        System.out.println("2. Done some tasks");
                        break;

                    case 7:
                        System.out.println("Your Sunday schedule is:");
                        System.out.println("1. Java");
                        System.out.println("2. Done some tasks");
                        break;


                }

            }else {
                System.out.println("Wrong input, new step...");
            }



        }
    }
}
