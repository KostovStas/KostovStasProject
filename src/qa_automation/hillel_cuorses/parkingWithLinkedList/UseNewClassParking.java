package qa_automation.hillel_cuorses.parkingWithLinkedList;

/**
 * Created by mac on 6/22/17.
 */
public class UseNewClassParking {

    public static void main(String[] args) {


        NewParking parking_2 = new NewParking();

        NewCar car_1 = new NewCar("BMW", "123 VM");
        NewCar car_2 = new NewCar("UAS", "456 VM");
        NewCar car_3 = new NewCar("Lada", "678 VM");

        parking_2.addNewCarInParking(car_1);
        parking_2.addNewCarInParking(car_2);
        parking_2.addNewCarInParking(car_3);

        parking_2.showAllNewCarsInParking();


    }
}
