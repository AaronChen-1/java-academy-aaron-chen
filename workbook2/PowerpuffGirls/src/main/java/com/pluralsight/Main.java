package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Character blossom = new Character("Blossom", "pink");

        System.out.println(blossom.getHealth());
        blossom.setHealth(2044);
        blossom.heal(102);
        }
}