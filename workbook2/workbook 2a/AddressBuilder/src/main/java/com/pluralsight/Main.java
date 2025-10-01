package com.pluralsight;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide the following information: ");
        System.out.println("Full name: ");
        String name = scanner.nextLine();

        //Billing info
        System.out.println("Billing Street: ");
        String billingStreet = scanner.nextLine();
        System.out.println("Billing City: ");
        String billingCity = scanner.nextLine();
        System.out.println("Billing State: ");
        String billingState = scanner.nextLine();
        System.out.println("Billing Zip: ");
        String billingZip = scanner.nextLine();

        //Shipping info
        System.out.println("Shipping Street: ");
        String shippingStreet = scanner.nextLine();
        System.out.println("Shipping City: ");
        String shippingCity = scanner.nextLine();
        System.out.println("Shipping State: ");
        String shippingState = scanner.nextLine();
        System.out.println("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        StringBuilder billingAddress = new StringBuilder();
        billingAddress.append("Billing Address: \n");
        billingAddress.append(billingStreet).append("\n");
        billingAddress.append(billingCity + "," + billingState + " " + billingZip).append("\n");

        StringBuilder shippingAddress = new StringBuilder();
        shippingAddress.append("Shipping Address: \n");
        shippingAddress.append(shippingStreet).append("\n");
        shippingAddress.append(shippingCity + "," + shippingState + " " + shippingZip);

        System.out.println(name + "\n\n" + billingAddress + "\n" + shippingAddress);
    }
}