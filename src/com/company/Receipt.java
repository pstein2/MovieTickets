package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Receipt {
    static Scanner input = new Scanner(System.in);

    public static void printTime() {
        //Get current date time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");
        String formatDateTime = now.format(formatter);
        System.out.print(formatDateTime + "\n");
    }

    public void customerName() {
        System.out.print("Please enter your first name: ");
        String enteredFirst = input.nextLine();
        String firstName = enteredFirst.substring(0, 1).toUpperCase() + enteredFirst.substring(1).toLowerCase();
        setFirstName(firstName);

        System.out.print("Please enter your last name: ");
        String enteredLast = input.nextLine();
        String lastName = enteredLast.substring(0, 1).toUpperCase() + enteredLast.substring(1).toLowerCase();
        setLastName(lastName);

        int confirmationNum = (int) (Math.random() * 9999 + 1);
        System.out.println(getFirstName() + " " + getLastName() + ", your confirmation# is " + confirmationNum);
        System.out.println("Thank You for your movie purchase, we hope you enjoy the movie!");

    }


    private String firstName;
    private String lastName;

    public void Reciept() {
    }


    public void Reciept(String first, String last) {
        lastName = last;
        firstName = first;
    }

    public void setFirstName(String name) {
        firstName = name;
    }

    public void setLastName(String name) {
        lastName = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}

