package section9;

import java.util.ArrayList;
import java.util.List;

// Class for ParkingLot
public class Parking {

    private List<Car> parkedCars;
    private int capacity;

    public Parking(int capacity) {
        this.capacity = capacity;
        this.parkedCars = new ArrayList<>();
    }

    // Method to park a car
    public boolean parkCar(Car car) {
        if (getParkedCarCount() < capacity) {
            parkedCars.add(car);
            System.out.println(car.getBrandName() + " " + car.getBodyType().getName() + " has been parked.");
            return true;
        } else {
            System.out.println("Parking lot is full. Cannot park " + car.getBrandName() + " " + car.getBodyType().getName() + ".");
            return false;
        }
    }

    // Method to remove a car
    public boolean removeCar(Car car) {
        if (isCarParked(car)) {
            parkedCars.remove(car);
            System.out.println(car.getBrandName() + " " + car.getBodyType().getName() + " has been removed from the parking lot.");
            return true;
        } else {

            System.out.println(car.getBrandName() + " " + car.getBodyType().getName() + " is not in the parking lot.");
            return false;
        }

    }

    public boolean isCarParked(Car car) {
        return parkedCars.contains(car);
    }

    public int getParkedCarCount() {
        return parkedCars.size();
    }

}
