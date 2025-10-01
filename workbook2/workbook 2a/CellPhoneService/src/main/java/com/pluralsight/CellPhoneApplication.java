package com.pluralsight;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone1 = new CellPhone();

        System.out.println("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What model is the phone?");
        String model = scanner.nextLine();

        System.out.println("Who is the carrier?");
        String carrier = scanner.nextLine();

        System.out.println("What is the phone number?");
        String phoneNumber = scanner.nextLine();

        System.out.println("Who is the owner of the phone?");
        String owner = scanner.nextLine();

        phone1.setSerialNumber(serialNumber);
        phone1.setModel(model);
        phone1.setCarrier(carrier);
        phone1.setPhoneNumber(phoneNumber);
        phone1.setOwner(owner);

        System.out.println("What is the serial number? " + phone1.getSerialNumber());
        System.out.println("What model is the phone? " + phone1.getModel());
        System.out.println("Who is the carrier? " + phone1.getCarrier());
        System.out.println("What is the phone number? " + phone1.getPhoneNumber());
        System.out.println("Who is the owner of the phone? " + phone1.getOwner());

        scanner.close();
    }
}
