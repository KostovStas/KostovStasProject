package java_oop.week_4.day_2.circus;

/**
 * Created by mac on 9/28/17.
 */
public class Clown extends Artist {


    public Clown(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("A am a Clown. This is my funny joke");
        this.setActionTimes(this.getActionTimes() + 1);

    }
}
