package com.pluralsight;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] scores = {60, 50, 66, 74, 75, 77, 84, 88, 93, 97};

        int sum = 0;
        int high = scores[0];
        int low = scores[0];

        for (int score : scores) {
            sum += score;

            if (score > high) {
                high = score;
            }
            if (score < low) {
                low = score;
            }
        }
        double average = (double) sum / scores.length;

        System.out.println(high);
        System.out.println(low);
        System.out.println(average);
    }

}