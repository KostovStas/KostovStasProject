package java_base.week_1.homeTaskWeek_1_additional;

import java.util.Scanner;

/**
 4) Two speeds are known, one in kilometers per hour, the other in meters in a second
 Do. Which is bigger?

 */
public class TwoSpeeds_4 {
    public static void main(String[] args) {


        System.out.println("Enter the first speed in kilometers per hour");

        Scanner scanner = new Scanner(System.in);

        int firstSpeedKilometrsHour = scanner.nextInt();

        System.out.println("Enter the second in meters in a second ");

        int secondSpeedMetersSecond = scanner.nextInt();

        if (firstSpeedKilometrsHour > (secondSpeedMetersSecond *3.6)){

            System.out.println("First speed " +firstSpeedKilometrsHour+ " in kilometers per hour is bigger than the second speed " +secondSpeedMetersSecond+" in meters in a second");
        }else {
            System.out.println("Second speed " +secondSpeedMetersSecond+" in meters in a second is bigger than the first speed " +firstSpeedKilometrsHour+ " kilometers per hour  ");
        }


    }
}
