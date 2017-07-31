package qa_automation.hillel_cuorses.parkingWithLinkedList;

/**
 * Created by mac on 6/22/17.
 */
public class NewCar {


    private String modelOfCar;
    private String сarLicensePlate;


    public NewCar(String modelOfCar, String сarLicensePlate) {

        this.modelOfCar = modelOfCar;
        this.сarLicensePlate = сarLicensePlate;
    }


    @Override
    public String toString() {

        return "Car model " + modelOfCar + " and car license plate " + сarLicensePlate;
    }


}
