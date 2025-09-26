package com.pluralsight;
import java.util.Scanner;

public class PayrollCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How many hours have you worked? ");
        float hoursWorked = scanner.nextFloat();

        System.out.println("What is your pay rate?");
        float payRate = scanner.nextFloat();

        float pay = hoursWorked * payRate;
        System.out.printf("%s's gross pay is $%.2f", name, pay);
    }
}
