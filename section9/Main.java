package section9;

public class Main {

    public static void main(String[] args) {
        Parking parkingLot = new Parking(2); // Parking lot with capacity of 2 cars

        Car car1 = new Car("Toyota", FuelType.BENZIN, CarType.SEDAN);
        Car car2 = new Car("Ford", FuelType.DIESEL, CarType.SUV);
        Car car3 = new Car("Honda", FuelType.BENZIN, CarType.COUPE);

        parkingLot.parkCar(car1); // Park car1
        parkingLot.parkCar(car2); // Park car2
        parkingLot.parkCar(car3); // Try to park car3 (should fail because of capacity)

        parkingLot.removeCar(car1); // Remove car1
        parkingLot.parkCar(car3);
    }

}
