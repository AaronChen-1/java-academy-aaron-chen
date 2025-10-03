package com.pluralsight;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate duedate;
    private boolean complete;
    private String urgency; // (A list of default values => ENUM)
    private String NotificationMessage;
    private boolean Reminder;

    public Task(String title){
        this.title = title;
    }

    public void isCompleted() {
        this.complete = true;
    }

    @Override
    public String toString() {
        if (complete) {
            return "[✓] " + title;
        } else {
            return" [ ] " + title;
        }
    }
}
