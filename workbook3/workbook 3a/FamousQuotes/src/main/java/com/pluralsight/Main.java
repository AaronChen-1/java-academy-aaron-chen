package com.pluralsight;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] quotes = {
                "The best way to predict the future is to invent it. – Alan Kay",
                "In the middle of every difficulty lies opportunity. – Albert Einstein",
                "Do not go where the path may lead, go instead where there is no path and leave a trail. – Ralph Waldo Emerson",
                "Success is not final, failure is not fatal: It is the courage to continue that counts. – Winston Churchill",
                "It always seems impossible until it’s done. – Nelson Mandela",
                "You miss 100% of the shots you don’t take. – Wayne Gretzky",
                "The only limit to our realization of tomorrow is our doubts of today. – Franklin D. Roosevelt",
                "What we think, we become. – Buddha",
                "The secret of getting ahead is getting started. – Mark Twain",
                "Happiness is not something ready made. It comes from your own actions. – Dalai Lama"
        };
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a number between 1-10 to display it's quote: ");
        int selection = scanner.nextInt();

        if (selection >=1 && selection <=10) {
            System.out.println(quotes[selection-1]);
        } else {
            System.out.println("Please select a number from 1-10.");
        }
        scanner.close();
    }
}