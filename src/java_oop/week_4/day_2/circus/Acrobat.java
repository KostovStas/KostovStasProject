package java_oop.week_4.day_2.circus;

import java.util.Comparator;
import java.util.Random;

/**
 * Created by mac on 9/27/17.
 */
public class Acrobat extends Artist implements Comparable<Acrobat>, Comparator<Acrobat>{

    // TO DO
    private int drunkLevel;

    public Acrobat(String name, int age) {
        super(name, age);
    }


    @Override
    public void action() {
        System.out.println("A am a Artist. This is my acrobatic trick");
        this.setActionTimes(this.getActionTimes() + 1);

    }




// TO DO
    @Override
    public int compareTo(Acrobat o) {
        return 0;
    }

    // TO DO
    @Override
    public int compare(Acrobat o1, Acrobat o2) {
        return 0;
    }
}
