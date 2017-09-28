package java_oop.week_4.day_2.circus;


public class TestCircus {
    public static void main(String[] args) {

        Director director = new Director("Sveta");

        Artist acrobat1 = new Acrobat("Serg",20);
        Artist acrobat2 = new Acrobat("Serg",20);
        Artist acrobat3 = new Acrobat("Serg",20);
        Artist acrobat4 = new Acrobat("Serg",20);

        director.showArticts();
        director.hireNewArtist(acrobat1);

        director.showArticts();


    }
}
