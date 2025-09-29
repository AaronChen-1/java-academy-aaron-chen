package com.pluralsight;
import java.util.Scanner;

public class FutureValueCalculator {
    public static double calculateFutureValue(int deposit, double annualRate, int years){
        double futureValue = deposit * Math.pow(1+ (annualRate/365), 365 * years);
        return futureValue;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your deposit: ");
        int deposit = input.nextInt();

        System.out.println("enter your interest rate");
        double annualRate = input.nextDouble();

        System.out.println("how many years?");
        int years = input.nextInt();

        annualRate *= 0.01;
        double futureValue = calculateFutureValue(deposit,annualRate,years);

        System.out.printf("Here is your compound interest for your item: $%.2f", futureValue);
    }
}
