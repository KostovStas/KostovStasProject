package qa_automation.hillel_cuorses.parkingWithArrays;

/**
 * Created by mac on 6/22/17.
 */
public class Car {

    private String modelOfCar;
    private int сarLicensePlate;



    public Car (String modelOfCar, int сarLicensePlate){

        this.modelOfCar = modelOfCar;
        this.сarLicensePlate = сarLicensePlate;
    }

    public String getModelOfCar (){

        return modelOfCar;
    }

    public int getСarLicensePlate () {

        return сarLicensePlate;
    }


    @Override
    public String toString (){

        return "Car model is " + modelOfCar + " with license plate - " + сarLicensePlate;
    }

}
