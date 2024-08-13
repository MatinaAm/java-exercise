package section9;




    // Concrete class Car extending Vehicle
    public class Car extends Vehicle {

        private CarType bodyType;
        private FuelType FuelType;
        public Car(String brandName, FuelType fuelType, CarType bodyType) {
            super(brandName, fuelType);
            this.bodyType = bodyType;
        }

        // Getter and Setter for bodyType
        public CarType getBodyType() {
            return bodyType;
        }

        public void setBodyType(CarType bodyType) {
            this.bodyType = bodyType;
        }

        @Override
        public void start() {
            System.out.println( " " + bodyType.getName() + " is starting with " +FuelType.getName() + " fuel.");
        }

        @Override
        public void move() {
            System.out.println( " " + bodyType.getName() + " is moving.");
        }
    }


