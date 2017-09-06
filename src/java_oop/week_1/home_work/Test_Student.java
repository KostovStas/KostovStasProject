package java_oop.week_1.home_work;

/**
 * Created by mac on 9/6/17.
 */
public class Test_Student {

    public static void main(String[] args) {

        Student student1 = new Student("Kolya", "Kiev");
        Subject subject1 = new Subject("h1", 100);
        Subject subject2 = new Subject("h2", 50);

        student1.addSubject(subject1);
        student1.addSubject(subject2);
        student1.addSubject(subject1);

        subject1.passExam(student1);
        student1.study(subject1);
        student1.study(subject1);
       student1.study(subject1);








    }
}
