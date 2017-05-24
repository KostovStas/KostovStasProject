package java_base.week_2;

/**
 * Created by mac on 5/20/17.
 */
public class Methods {

    public static void printArray(int[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public static void printArray(String[] numbers) {
        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


    public static boolean checkLetre(char letre) {

        if (letre == 'a' || letre == 'e' || letre == 'y' || letre == 'u'
                || letre == 'i' || letre == 'o' || letre == 'a') {
            return true;
        } else {
            return false;
        }


    }


    public static int[] genArrayRandom(int size, int from, int to) {

        int[] tempArray = new int[size];
        to++;

        for (int i = 0; i < size; i++) {

            // умножение на 2 увеличивает диапазон на 2, (от 0 до 2) если + число например 3 то диапазон увеличивает
            // первое число и второе на 3, например было от (0 до 2) +3 стало (3 до 5)

            tempArray[i] = (int) (Math.random() * (to - from) + from);

        }
        return tempArray;

    }



}
