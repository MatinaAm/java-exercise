package section9;

// Abstract class for Vehicle
public abstract class Vehicle {

    private String brandName;
    private FuelType fuelType;

    public Vehicle(String brandName, FuelType fuelType) {
        this.brandName = brandName;
        this.fuelType = fuelType;
    }
    public String getBrandName() {
        return brandName;
    }

    public abstract void start();

    public abstract void move();
}