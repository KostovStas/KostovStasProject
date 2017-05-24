package java_base.week_1.day_2;


/**
 * Created by mac on 5/14/17.
 */
public class TestMethods {
    public static void main(String[] args) {

        int a =  1;
        int b = 6;
        System.out.println(ArithmeticUtils.sumOfTwoNumbers(a,b));


        int [] mass = new int [100];

        for (int i = 0; i < mass.length ; i++) {

            System.out.println(mass[i-2]);

        }



    }
}
