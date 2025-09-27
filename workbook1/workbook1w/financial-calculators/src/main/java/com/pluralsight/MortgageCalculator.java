package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {
    public static double calculateMonthlyPayment(double principal, double annualRate, int years) {
        double monthlyRate = annualRate / 100 / 12;   // convert % to decimal, then monthly
        int n = years * 12;                           // total payments

        return principal * (monthlyRate * Math.pow(1 + monthlyRate, n))
                / (Math.pow(1 + monthlyRate, n) - 1);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your principal: ");
        double principal = scanner.nextDouble();

        System.out.println("What is your interest rate? ");
        double annualRate = scanner.nextDouble();

        System.out.println("How many years for loan? ");
        int years = scanner.nextInt();

        //calculating monthly payment
        double monthlyPayment = calculateMonthlyPayment(principal, annualRate, years);
        int totalPayments = years * 12;
        double totalPaid = monthlyPayment * totalPayments;
        double totalInterest = totalPaid - principal;

        System.out.printf("Monthly Payment: $%.2f%n", monthlyPayment);
        System.out.printf("Total Interest Paid: $%.2f%n", totalInterest);

        scanner.close();

    }
}
