package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Menu.displayMenu();
        Hello.sayHello();
        Hello.sayGoodbye();
        Hello.sayGoodMorning();
        System.out.println(Format.formatName("Aaron", "Chen"));
        System.out.println(CompareNumbers.isEven(5));
    }
}