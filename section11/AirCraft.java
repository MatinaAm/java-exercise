package section11;

class Aircraft {
    String name;
    String model;
    String registrationNumber;

    public Aircraft(String name, String model, String registrationNumber) {
        this.name = name;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Model: " + model + ", Registration Number: " + registrationNumber;
    }
}