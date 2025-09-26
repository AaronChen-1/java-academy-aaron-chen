package com.pluralsight;
import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float num1 = scanner.nextFloat();

        System.out.println("Enter the second number: ");
        float num2 = scanner.nextFloat();

        System.out.println("Possible calculations:");
        System.out.println(" (A)dd");
        System.out.println(" (S)ubtract");
        System.out.println(" (M)ultiply");
        System.out.println(" (D)ivide");
        System.out.println("Please select an option: 'A' 'S' 'M' 'D' ");
        char choice = scanner.next().toUpperCase().charAt(0);

        float result = 0; //placeholder

        //im using switch instead of if/else here to make it more neat. also printf instead of concatenating a bunch
        switch(choice) {
            case 'A':
                result = num1 + num2;
                System.out.printf("Result: %.2f + %.2f = %.2f%n", num1, num2, result);
                break;
            case'S':
                result = num1 - num2;
                System.out.printf("Result: %.2f - %.2f = %.2f%n", num1, num2, result);
                break;
            case 'M':
                result = num1 * num2;
                System.out.printf("Result: %.2f * %.2f = %.2f%n", num1, num2, result);
                break;
            case 'D':
                if (num2 !=0) {
                    result = num1 / num2;
                    System.out.printf("Result: %.2f / %.2f = %.2f%n", num1, num2, result);
                }
                else {
                    System.out.println("cannot divide by 0");
                }
                break;
            default:
                System.out.println("Invalid option. Please select 'A' 'S' 'M' 'D' ");
        }
    }
}
