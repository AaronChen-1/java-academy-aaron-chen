package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hi("Aaron");
        Hi("Zak");
        Hi("Bilal");
        Hi("Nazik");

        IncreasedPowerLevel(400);

        AgeDouble(10);
        yearsUntilRetirement(20);
    }

    public static void Hi(String name){
        System.out.println("I wish you a warm welcome " + name);
    }

    public static void IncreasedPowerLevel(int powerlevel){
        System.out.println("Your powerlevel has been increased with " + powerlevel);
    }

    public static void AgeDouble(int age){
        age *= 2;
        System.out.println(age);
    }

    public static void yearsUntilRetirement(int age){
        System.out.println("Years until retirement: " + (65 - age));
    }

}