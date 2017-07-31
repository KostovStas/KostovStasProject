package qa_automation.hillel_cuorses.parkingWithLinkedList;

import java.util.ArrayList;

/**
 * Created by mac on 6/22/17.
 */
public class NewParking {

    private String name;
    private String address;


    ArrayList<NewCar> newCars = new ArrayList<NewCar>();


    public void addNewCarInParking(NewCar car) {

        newCars.add(car);

    }

    public void deleteCarInParking(NewCar car) {

        newCars.remove(car);

    }

    public void showAllNewCarsInParking() {

        for (int i = 0; i < newCars.size(); i++) {

            System.out.println(newCars.get(i));

        }
    }


}
