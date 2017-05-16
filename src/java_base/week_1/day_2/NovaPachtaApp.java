package java_base.week_1.day_2;

import java.util.Scanner;

/**
 * Created by mac on 5/14/17.
 */
public class NovaPachtaApp {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        int firstCode = 1111;

        String firstCodeName = "Helmet";

        int secondCode = 2222;

        String secondCodeName = "Car";

        int thirdCode = 3333;

        String thirdCodeName = "Helicopter";

        System.out.println("Please enter your code");

        int userCode = scanner.nextInt();

       /* if (firstCode == userCode || secondCode == userCode || thirdCode == userCode) {

            System.out.println("You can get your goods");
        } else {
            System.out.println("Sorry, no matches found");
        }*/


        /*if (firstCode == userCode) {

            System.out.println("You can get your goods " + firstCodeName);

        } else {

            if (secondCode == userCode) {

                System.out.println("You can get your goods " + secondCodeName);

            } else {
                if (thirdCode == userCode) {

                    System.out.println("You can get your goods " + thirdCodeName);

                }else {

                    System.out.println("Sorry, no matches found");

                }

            }

        }
*/

        if (firstCode == userCode) {

            System.out.println("You can get your goods " + firstCodeName);

        } else if (secondCode == userCode) {

            System.out.println("You can get your goods " + secondCodeName);

        } else if (thirdCode == userCode)
            {

                System.out.println("You can get your goods " + thirdCodeName);
            }
            else{

                System.out.println("Sorry, no matches found");

            }

        }

        public static String getSuccessMessage (String code, String name) {
        String message = "Your code is " + code + "product is " + name;
        return message;
        }

        public static String inputValueFromConsole(String message){
        Scanner scanner = new Scanner(System.in);
            System.out.println(message);
            return message;
        }

    }







