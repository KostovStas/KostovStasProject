package qa_automation.hillel_cuorses.parkingWithArrays;

/**
 * Created by mac on 6/22/17.
 */
public class UseClassParking {

    public static void main(String[] args) {

        Parking parking_1 = new Parking("Parking","Kiev",3);

        Car firstCar = new Car("BMW", 12345678);
        Car secondCar = new Car("Lada", 5384);
        Car thirdCar = new Car("Opel", 234567 );
        Car fourthCar = new Car("UAZ", 7777);
        Car fifthCar = new Car("Honda", 64420);

        parking_1.addNewCar(firstCar);
        parking_1.addNewCar(secondCar);
        parking_1.addNewCar(thirdCar);
        parking_1.addNewCar(fourthCar);
        parking_1.addNewCar(fifthCar);

        parking_1.showAllParkingCars();

        parking_1.deleteTheCar("Honda", 64420);


        System.out.println("----------------");
        parking_1.showAllParkingCars();


        System.out.println("----------------");
        parking_1.deleteTheCar("UAZ", 7779);;
        parking_1.showAllParkingCars();


    }
}
