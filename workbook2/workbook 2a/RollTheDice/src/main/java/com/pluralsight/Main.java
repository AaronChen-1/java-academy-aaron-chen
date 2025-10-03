package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Dice dice = new Dice();

    int roll1, roll2;
    int twoCounter = 0, fourCounter = 0, sixCounter =0, sevenCounter=0;

    for (int i=0; i<=100; i++) {
        roll1 = dice.roll();
        roll2 = dice.roll();

        int sum = roll1+roll2;

        System.out.println("roll " + i + ":    " + roll1 + "   " + "--" + "roll " + roll2 + "     Sum: " + sum);

        if(sum == 2) twoCounter++;
        if(sum == 4) fourCounter++;
        if(sum ==6) sixCounter++;
        if(sum == 7) sevenCounter++;
    }

        System.out.println("amount of 2s: " + twoCounter);
        System.out.println("amount of 4s: " + fourCounter);
        System.out.println("amount of 6s: " + sixCounter);
        System.out.println("amount of 7s: " + sevenCounter);
    }
}