package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1:
        // declare variables here
        // then code solution
        double bobSalary = 12345;
        double garySalary = 12345.1;
        double highestSalary = Math.max(bobSalary,garySalary);

        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        System.out.println("The highest salary is: " + highestSalary);

        //Q2
        double carPrice = 50_000;
        double truckPrice = 55_000;
        double cheapestVehicle = Math.min(carPrice, truckPrice);

        System.out.println(cheapestVehicle);

        //Q3
        double radius = 7.25;
        double circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of a circle with " + radius + " is: " + circleArea);

        //Q4
        double num = 5.0;
        double numSquareRooted = Math.sqrt(num);

        System.out.println(numSquareRooted);

        //Q5
        int x1 = 5, y1 = 10;
        int x2 = 85, y2 = 50;
        //distance = sqrt((x2-x1)^2 + (y2-y1)^2)
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);

        //Q6
        float num1 = -3.8f;
        float num2 = Math.abs(num1);

        System.out.println("the absolute value of -3.8 is " + num2 );

        //Q7
        double randomNum = Math.random();
        System.out.println(randomNum);

        //Q8
        int days = 24;
        int hoursInDay = 24;
        int minsInHour = 60;
        int secondsInMin = 60;
        int millisecondsInSeconds = 1000;

        int totalMinutes = days * hoursInDay * minsInHour;
        System.out.println("Total minutes in 24 days: " + totalMinutes);

        long totalMilliseconds = days * hoursInDay * minsInHour * secondsInMin * millisecondsInSeconds;
        System.out.println("Total milliseconds in 24 days: " + totalMilliseconds);
    }
}
