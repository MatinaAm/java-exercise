package section9;

public enum CarType {
    SEDAN("Sedan"),
    COUPE("Coupe"),
    SUV("SUV");

    private final String name;

    CarType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}