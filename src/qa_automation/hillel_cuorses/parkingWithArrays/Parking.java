package qa_automation.hillel_cuorses.parkingWithArrays;


public class Parking {

    private static final int DEFAULT_SIZE = 100;
    private String name;
    private String address;
    private int freePlaces;
    private int totalCountOfFloors;
    private int carPosition;

    Car listOfCars[];

    @Override
    public String toString () {

        return "Parcing info: " + name + address;
    }


    // The first constructor
    public Parking(String name, String address, int totalCountOfFloors) {

        listOfCars = new Car[DEFAULT_SIZE];
        this.name = name;
        this.address = address;
        this.freePlaces = DEFAULT_SIZE;
        this.totalCountOfFloors = totalCountOfFloors;

    }

    public String getName() {
        return name;
    }


    // Add a new car
    public void addNewCar(Car car) {

        if (freePlaces == 0) {

            System.out.println("Can't ann a new car. Not free places");

        } else {

            listOfCars[carPosition] = car;
            freePlaces--;
            carPosition++;
        }
    }

    public void deleteTheCar(String modelOfCar, int сarLicensePlate) {

        for (int i = 0; i < carPosition; i++) {

            if (listOfCars[i].getModelOfCar().equalsIgnoreCase(modelOfCar)
                    && listOfCars[i].getСarLicensePlate() == сarLicensePlate) {

                listOfCars[i] = null;
                freePlaces++;
                carPosition--;
                //deleteFreeCell(i);

            }

        }


    }

   /* private void deleteFreeCell(int i) {

        int nextAfterI = i + 1;
        Car[] tmp = new Car[listOfCars.length];
        System.arraycopy(listOfCars, 0, tmp, 0, i);
        System.arraycopy(listOfCars, i + 1, tmp, i, carPosition - nextAfterI);
        listOfCars = tmp;
    }*/

    public void showAllParkingCars() {

        for (int i = 0; i < carPosition; i++) {

            System.out.println(listOfCars[i]);
        }
    }


}
