package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone();
        cellPhone1.setSerialNumber(2597153);
        cellPhone1.setModel("iPhone 15 Pro Max");
        cellPhone1.setCarrier("Verizon");
        cellPhone1.setPhoneNumber("888-555-1234");
        cellPhone1.setOwner("Sandra");

        CellPhone cellPhone2 = new CellPhone();
        cellPhone2.setSerialNumber(1234567);
        cellPhone2.setModel("Galaxy S24 Ultra");
        cellPhone2.setCarrier("AT&T");
        cellPhone2.setPhoneNumber("800-555-5555");
        cellPhone2.setOwner("David");

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial( cellPhone1.getPhoneNumber() );

    }
    public static void display(CellPhone phone) {
        System.out.println("Owner: " + phone.getOwner());
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        }
    }

