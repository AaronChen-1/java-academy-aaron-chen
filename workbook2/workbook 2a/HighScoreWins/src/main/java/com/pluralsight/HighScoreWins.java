package com.pluralsight;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //prompt user for a game score.
        System.out.println("Please enter a game score: ");
        String input = scanner.nextLine();

        String[] parts = input.split("\\|");
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        String team1 = teams[0];
        String team2 = teams[1];
        int score1 = Integer.parseInt(scores[0].trim());
        int score2 = Integer.parseInt(scores[1].trim());

        if(score1 > score2){
            System.out.println("Winner: " + team1);
        } else if (score2 > score1) {
            System.out.println("Winner: " + team2);
        } else {
            System.out.println("It's a tie!");
        }
        scanner.close();
    }
}
