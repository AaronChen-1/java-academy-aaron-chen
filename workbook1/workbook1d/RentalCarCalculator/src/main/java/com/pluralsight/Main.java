package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter pickup date: ");
        String pickUpDate = input.nextLine();

        System.out.println("Days for rental: ");
        int daysForRental = input.nextInt();
        input.nextLine();

        System.out.println("Do you want a electronic toll tag at $3.95/day (yes/no)");
        String electronicTollTag = input.nextLine();

        System.out.println("Do you want GPS at $2.95/day (yes/no)");
        String gps = input.nextLine();

        System.out.println("Do you want roadside assistance at $3.95/day (yes/no)");
        String roadSideAssistance = input.nextLine();

        System.out.println("What is your age?");
        int age = input.nextInt();

        double carRental = 30.0;
        double basicCarRental = carRental * daysForRental;
        double optionsCost = 0;
        if(electronicTollTag.equalsIgnoreCase("yes")){
            optionsCost += 3.95*daysForRental;
        }
        if (gps.equalsIgnoreCase("yes")){
            optionsCost += 2.95*daysForRental;
        }
        if(roadSideAssistance.equalsIgnoreCase("yes")){
            optionsCost += 3.95*daysForRental;
        }

        double underAgeSurcharge = 0.0;
        if(age < 25){
            underAgeSurcharge = carRental*0.3;
        }

        double totalCost = basicCarRental + optionsCost + underAgeSurcharge;
        System.out.println("your total cost will be: " + totalCost);

    }
}