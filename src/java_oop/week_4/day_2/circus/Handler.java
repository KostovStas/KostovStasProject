package java_oop.week_4.day_2.circus;


public class Handler extends Artist {

    public Handler(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        System.out.println("A am a Handler. I tame the lion");
        this.setActionTimes(this.getActionTimes() + 1);

    }
}
