package com.hospital.staff;

public class StaffMember {
    protected String name;

    public StaffMember(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is working...");
    }
}


class Person {
    String name;
    int age;

    Person(String n) { //1st constructor
        name = n;
    }
    Person(String n, int a) {//2nd constructor
        name = n;
        age = a;
    }
}
