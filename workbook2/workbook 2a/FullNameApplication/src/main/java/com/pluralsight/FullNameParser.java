package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name (first last) or (first middle last)");
        String fullName = scanner.nextLine().trim();

        String[] parts = fullName.split("\\s+");

        if(parts.length == 2){
            String firstName = parts[0];
            String lastName = parts[1];

            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);

        } else if (parts.length == 3) {
            String firstName = parts[0];
            String middleName = parts[1];
            String lastName = parts[2];

            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);

        } else {
            System.out.println("Invalid format");
        }
        scanner.close();
    }

}
