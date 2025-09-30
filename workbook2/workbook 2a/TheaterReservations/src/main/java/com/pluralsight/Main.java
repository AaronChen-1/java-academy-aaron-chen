package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine();
        System.out.println("How many tickets would you like? ");
        int tickets = scanner.nextInt();

        String[] nameParts = name.split("\\s+");
        String firstName = nameParts[0];
        String lastName = nameParts[1];
        String fullName = nameParts[1] + ", " + nameParts[0];

        if(tickets>1){
            System.out.println(tickets + "tickets reserved for " + date + " under " + fullName);
        } else {
            System.out.println(tickets + " ticket reserved for " + date + " under " + fullName);
        }

        // output # ticket(s) reserved for (date) under (LastName, FirstName)
    }
}