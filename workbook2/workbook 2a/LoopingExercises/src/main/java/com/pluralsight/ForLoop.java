package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        int num = 10;

        int i;
        for (i=0; i<10; i++) {
            System.out.println(num);
            num -= 1;

            Thread.sleep(1000);

        }
        System.out.println("Launch!");
    }
}
