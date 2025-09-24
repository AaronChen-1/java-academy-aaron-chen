package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean imHappy = true;
        boolean hadBreakfast = true;

        if (imHappy && hadBreakfast) {
            System.out.println("Nice job!");
        } else if (imHappy && !hadBreakfast) {
            System.out.println("you could be hungry");
        } else if (!imHappy && !hadBreakfast) {
            System.out.println("Do something about it");
        }
    }
}