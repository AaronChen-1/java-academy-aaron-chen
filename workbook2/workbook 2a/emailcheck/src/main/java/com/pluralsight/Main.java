package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        ValidateEmailAddress("remsey.mailjard@rmailjard@yearup.org");
    }

    public static void ValidateEmailAddress(String mail) {

        boolean isValid;
        String lowercased = mail.toLowerCase();
        int AtPosition = lowercased.indexOf("@");//9
        String extraction = lowercased.substring(AtPosition + 1);//cuts the text between 0 and 9
        System.out.println(extraction);

        if (extraction.equals("yearup.org")) {
            isValid = true;
        }
        else
        {
            isValid = false;
        }


    }
}
