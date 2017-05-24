package java_base.utils;
/**
 * Created by mac on 5/17/17.
 */
public class ArrayUtils {

    public static void main(String[] args) {


        int mass [] = {1,2,3,4,5,6,7,8,9,10};

        // print array start printing from the first element
        for (int i = 0; i < mass.length; i++) {

            System.out.print(mass[i] +" ");

        }
        System.out.println();

        // print array start printing from the last element
        for (int i = mass.length-1 ; i >= 0; i--) {

            System.out.print(mass[i] +" ");
            
        }


        System.out.println();

        // print half of array - last part
        for (int i = mass.length/2; i >=0 ; i--) {

            System.out.print(mass[i] +" ");

        }

        System.out.println();

        // print half of array - first part
        for (int i = 0; i <= mass.length/2 ; i++) {

            System.out.print(mass[i] +" ");

        }


    }

}
