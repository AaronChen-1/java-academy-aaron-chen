package com.dealership.ui;

import com.dealership.data.DealershipFileManager;
import com.dealership.models.Dealership;
import com.dealership.models.Vehicle;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;

    public void display() {
        init();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> processGetByPriceRequest();
                case 2 -> processGetByMakeModelRequest();
                case 3 -> processGetByYearRequest();
                case 4 -> processGetByColorRequest();
                case 5 -> processGetByMileageRequest();
                case 6 -> processGetByVehicleTypeRequest();
                case 7 -> processAllVehiclesRequest();
                case 8 -> processAddVehicleRequest();
                case 9 -> processRemoveVehicleRequest();
                case 99 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid option, please try again.");
            }


        } while (choice != 99);
    }

    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        dealership = fileManager.getDealership();
    }

    private void displayMenu() {
        System.out.println("\n==== DEALERSHIP MENU ====");
        System.out.println("1 - Find vehicles by price range");
        System.out.println("2 - Find vehicles by make/model");
        System.out.println("3 - Find vehicles by year range");
        System.out.println("4 - Find vehicles by color");
        System.out.println("5 - Find vehicles by mileage range");
        System.out.println("6 - Find vehicles by type");
        System.out.println("7 - List ALL vehicles");
        System.out.println("8 - Add a vehicle");
        System.out.println("9 - Remove a vehicle");
        System.out.println("99 - Quit");
        System.out.print("Enter your choice: ");
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        if (vehicles == null || vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    private void processAllVehiclesRequest() {
        List<Vehicle> allVehicles = dealership.getAllVehicles();
        displayVehicles(allVehicles);
    }

    private void processAddVehicleRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter VIN: ");
        int vin = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Make: ");
        String make = scanner.nextLine();
        System.out.println("Enter Model: ");
        String model = scanner.nextLine();
        System.out.println("Enter Type (Car, Truck, SUV, etc.): ");
        String type = scanner.nextLine();
        System.out.println("Enter Color: ");
        String color = scanner.nextLine();
        System.out.println("Enter Odometer Reading: ");
        int odometer = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        Vehicle newVehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);
        dealership.addVehicle(newVehicle);

        // Save the updated inventory
        DealershipFileManager fileManager = new DealershipFileManager();
        fileManager.saveDealership(dealership);

        System.out.println("Vehicle added successfully!");
    }

    private void processRemoveVehicleRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter VIN of vehicle to remove: ");
        int vin = Integer.parseInt(scanner.nextLine());

        Vehicle toRemove = null;
        for (Vehicle v : dealership.getAllVehicles()) {
            if (v.getVin() == vin) {
                toRemove = v;
                break;
            }
        }

        if (toRemove != null) {
            dealership.removeVehicle(toRemove);
            DealershipFileManager fileManager = new DealershipFileManager();
            fileManager.saveDealership(dealership);
            System.out.println("Vehicle removed successfully!");
        } else {
            System.out.println("Vehicle with VIN " + vin + " not found.");
        }
    }

    private void processGetByPriceRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimum price: ");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter maximum price: ");
        double max = Double.parseDouble(scanner.nextLine());
        displayVehicles(dealership.getVehiclesByPrice(min, max));
    }

    private void processGetByMakeModelRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter make: ");
        String make = scanner.nextLine();
        System.out.println("Enter model: ");
        String model = scanner.nextLine();
        displayVehicles(dealership.getVehiclesByMakeModel(make, model));
    }

    private void processGetByYearRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimum year: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter maximum year: ");
        int max = Integer.parseInt(scanner.nextLine());
        displayVehicles(dealership.getVehiclesByYear(min, max));
    }

    private void processGetByColorRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter color: ");
        String color = scanner.nextLine();
        displayVehicles(dealership.getVehiclesByColor(color));
    }

    private void processGetByMileageRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minimum mileage: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter maximum mileage: ");
        int max = Integer.parseInt(scanner.nextLine());
        displayVehicles(dealership.getVehiclesByMileage(min, max));
    }

    private void processGetByVehicleTypeRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vehicle type (Car, Truck, SUV, etc.): ");
        String type = scanner.nextLine();
        displayVehicles(dealership.getVehiclesByType(type));
    }

//    private void clearScreen() {
//        for (int i = 0; i < 50; i++) {
//            System.out.println();
//        }
//    }
}
