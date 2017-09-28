package java_oop.week_4.day_2.circus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 9/28/17.
 */
public class Director implements IDirector {

    private String name;
    private double salary;
    private Circus circus;
    private List<Artist> artists = new ArrayList<>();

    public Director(){

    }

    public Director(String name) {
        this.name = name;
    }


    // TO DO
    @Override
    public void showArticts() {
        for (Artist artict: artists) {
            System.out.printf("%s", artict);
        }

    }

    @Override
    public boolean hireNewArtist(Artist artist) {
        if (artist == null){
            return false;
        }
        this.artists.add(artist);
        System.out.printf("You have hired %s", artist);
        System.out.println();
        return true;
    }

    @Override
    public boolean firedMostDrunkAcrobat() {
        return false;
    }

    @Override
    public boolean sendToAct(Artist artist) {
        return false;
    }

    @Override
    public int actingTimes(Artist artist) {
        return 0;
    }

    @Override
    public boolean paySalary(double salary) {
        return false;
    }

    @Override
    public boolean changeLocation(String city) {
        return false;
    }
}
