package com.pluralsight;
import java.util.Scanner;

public class FutureValueCalculator {
    public static double calculateFutureValue(int deposit, double annualRate, int years){
        double futureValue = deposit * Math.pow(1+ (annualRate/365), 365 * years);
        return futureValue;
    }
}
