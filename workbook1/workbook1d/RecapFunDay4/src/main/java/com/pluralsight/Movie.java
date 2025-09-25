package com.pluralsight;
import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Movie to watch: ");
        String movie1 = scanner.nextLine();

        System.out.println("number of friends: ");
        int numFriends = scanner.nextInt();

        System.out.println("pizza price per piece: ");
        double pizzaPrice = scanner.nextDouble();

        System.out.println("will we have popcorn? input:(true/false)");
        boolean hasPopcorn = scanner.nextBoolean();

        System.out.println("We will watch " + movie1 + "tonight and get pizza.");
        System.out.println("The price per pizza will be " + pizzaPrice + ".");

        if(hasPopcorn){
            System.out.println("Popcorn time!");
        }
        else{
            System.out.println("No more popcorn.");
        }
    }
}
