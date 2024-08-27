package section11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportScanner {

    static List<Aircraft> aircraftList = new ArrayList<>();
    static List<String> carList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: Add Aircraft");
            System.out.println("2: Add Car");
            System.out.println("3: View Aircrafts");
            System.out.println("4: View Cars");
            System.out.println("5: Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); //  newline

            switch (choice) {
                case 1:
                    addAircraft(scanner);
                    break;
                case 2:
                    addCar(scanner);
                    break;
                case 3:
                    viewAircrafts();
                    break;
                case 4:
                    viewCars();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

        private static void addAircraft(Scanner scanner) {
            System.out.print("Enter aircraft name: ");
            String name = scanner.nextLine();
            System.out.print("Enter aircraft model: ");
            String model = scanner.nextLine();
            System.out.print("Enter aircraft registration number: ");
            String registrationNumber = scanner.nextLine();

            Aircraft aircraft = new Aircraft(name, model, registrationNumber);
            aircraftList.add(aircraft);
            System.out.println("Aircraft added: " + aircraft);
        }


    private static void addCar(Scanner scanner) {
        System.out.print("Enter car name: ");
        String carName = scanner.nextLine();
        carList.add(carName);
        System.out.println("Car added: " + carName);
    }

    private static void viewAircrafts() {
        System.out.println("Aircraft List:");
        for (Aircraft aircraft : aircraftList) {
            System.out.println("- " + aircraft);
        }
    }

    private static void viewCars() {
        System.out.println("Car List:");
        for (String car : carList) {
            System.out.println("- " + car);
        }
    }
}
