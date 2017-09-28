package java_oop.week_4.day_2.circus;


public class Magician extends Artist {

    public Magician(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("Making code...");
        this.setActionTimes(this.getActionTimes() + 1);
    }
}
