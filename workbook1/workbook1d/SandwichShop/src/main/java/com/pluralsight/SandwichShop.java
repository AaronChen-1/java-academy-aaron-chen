package com.pluralsight;
import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which sandwich would you like (1 or 2)");
        System.out.println("1: Regular: base price $5.45");
        System.out.println("2: Large: base price $8.95");
        int option = scanner.nextInt();

        System.out.println("Would you like your sandwich loaded? (yes/no)");
        System.out.println("Regular + $1.00");
        System.out.println("Large + $1.75");

        String loaded = scanner.next().toLowerCase();

        float loadedPrice = 0f;

        if(loaded.equals("yes")) {
            if (option == 1){
                loadedPrice = 1.00f;
            } else if (option == 2){
                loadedPrice = 1.75f;
            }
        }


        System.out.println("How old are you?");
        int age = scanner.nextInt();

        float price = 0f;

        if(option == 1){
            price = 5.45f;
        }
        else if(option ==2){
            price = 8.95f;
        }
        else{
            System.out.println("invalid input: try again (1-2)");
        }


        float discount = 0f;

        if(age <=17){
            discount = .10f;
        }
        else if(age >=65){
            discount = .20f;
        }

        float finalPrice = (price + loadedPrice) * (1-discount);
        System.out.printf("Your sandwich costs $%.2f", finalPrice);
    }
}
