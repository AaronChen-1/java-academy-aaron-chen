package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Task t = new Task("Learn Java");
        System.out.println(t); // [ ] Learn Java
        t.isCompleted();
        System.out.println(t); // [✓] Learn Java

        Task[] tasks = new Task[3];
        tasks[0] = new Task("Learn the basics of Classes and Methods in Java");
        tasks[1] = new Task("Fill out this Year Up online form. It's feedback for Yearup about how you guys think the lessons are going. " +
                "https://www.surveymonkey.com/r/VXQF92Q");
        tasks[2] = new Task("Share your most fun exercise we did in class");

        // Step 3: mark one task as completed
        tasks[1].isCompleted();

        // Step 4: loop through the array and print each task
        for (int i = 0; i < tasks.length; i++) {
            System.out.println(tasks[i]);
        }
    }
}