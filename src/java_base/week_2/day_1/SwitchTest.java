package java_base.week_2.day_1;


import java.util.Scanner;

/**
 * About switch
 */
public class SwitchTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter user name");
        String name = scanner.nextLine();

        whileLoop:
        while (true) {
            System.out.println("1. say hello");
            System.out.println("2. say hi");
            System.out.println("3. say hola");
            System.out.println("4. say alloha");
            System.out.println("0. exit");

            String userChoice = scanner.nextLine();
            if (userChoice.equals("0")) {
                break;
            }

            switch (userChoice) {
                case "1":
                    System.out.println("Hello " + name);
                    break;
                case "2":
                    System.out.println("Hi " + name);
                    break;
                case "3":
                    System.out.println("Olla " + name);
                    break;
                case "4":
                    System.out.println("Alloha " + name);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("Maybe you want some more??  (yes/no)");
            userChoice = scanner.nextLine();
            switch (userChoice) {
                case "yes":
                    continue;
                case "no":
                    break whileLoop;
                default:
                    System.out.println("Wrong input, new step...");
            }
        }

        System.out.println("Bye!");
    }

}
