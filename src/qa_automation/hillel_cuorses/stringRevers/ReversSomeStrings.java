package qa_automation.hillel_cuorses.stringRevers;

/**
 * Created by mac on 6/23/17.
 */
public class ReversSomeStrings {

    public static void main(String[] args) {

        String someText = new String("First Second Third");

        System.out.println("String before - " + someText);

        String reversSomeText = new StringBuffer(someText).reverse().toString();

        String reversSomeTextAndtoLowerCase = reversSomeText.toLowerCase();

        //System.out.println(reversSomeTextAndtoLowerCase);

        String newString = reversSomeTextAndtoLowerCase.replace('d','D');
        //System.out.println(newString);
        String finaleString = newString.replace('t','T');

        System.out.println(finaleString);

        //String text  = new StringBuffer (finaleString).reverse().toString();
        //System.out.println(text);


    }
}
