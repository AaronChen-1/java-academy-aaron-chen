package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your password:");
        String password = scanner.next();
        if(password.equals("1234")){
            System.out.println("Password is correct");
        }
        else{
            System.out.println("Password is incorrect");
        }
    }
}