package com.dealership.data;

import com.dealership.models.Dealership;
import com.dealership.models.Vehicle;

import java.io.*;
import java.util.*;

public class DealershipFileManager {

    private static final String FILE_NAME = "src/main/resources/inventory.csv";

    public Dealership getDealership() {
        Dealership dealership = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line = reader.readLine(); // Dealership info
            String[] parts = line.split("\\|");
            dealership = new Dealership(parts[0], parts[1], parts[2]);

            while ((line = reader.readLine()) != null) {
                String[] v = line.split("\\|");
                Vehicle vehicle = new Vehicle(
                        Integer.parseInt(v[0]),
                        Integer.parseInt(v[1]),
                        v[2], v[3], v[4], v[5],
                        Integer.parseInt(v[6]),
                        Double.parseDouble(v[7])
                );
                dealership.addVehicle(vehicle);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return dealership;
    }

    public void saveDealership(Dealership dealership) {
        // Implement in Phase 5
    }
}
