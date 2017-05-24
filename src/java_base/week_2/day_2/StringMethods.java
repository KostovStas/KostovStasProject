package java_base.week_2.day_2;

/**
 * Created by mac on 5/21/17.
 */
public class StringMethods {
    public static void main(String[] args) {

        // lenght

        String testString = "Hello world." + "I am java deeloper and I need money";

        System.out.println(testString);

        // lenght

        System.out.println("Lenght is " + testString.length());

        // equalsIgnoreCase()

        String a = "Hello";

        String b = "Hello";

        System.out.println(a.equals(b));

        // replace()

        testString=testString.replace("H", "ZZZZ");

        System.out.println(testString);

        // replaceFirst()

        testString = testString.replaceFirst("H", "REp1");

        // charAt(2) - return lettre in this index - 2

        //concat  - the same like +


        //contains() - If such a word in the sentence?

       //endsWith() - какой буквой заканчивается

        // startsWith() - с какой буквы начинается

        // trim() - delete spases in two sides

        // isEmpty - check than String is empty, return true or fasle

        // split() - разделяет стороку по выбраному элементу, например пробел и делает из строки массив строк

        // substring() - cut the word by chousen index,



    }
}
