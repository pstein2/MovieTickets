package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int ageRatedR = 17;
        String show = "";
        int age, movie, showing;

        //display menu
        Menu.printMenu();

        //User input age
        System.out.print("Enter your age: ");
        age = input.nextInt();

        //User input movie, error if wrong input selected
        do {
            System.out.print("Choose a movie (1-4): ");
            movie = input.nextInt();
            if (movie >= 5) {
                System.out.println("INVALID: Input 1-4");
            }
        } while (movie >= 5);

        //test for age requirement
        if (age <= ageRatedR && movie >= 3) {
            System.out.println("Age requirement not met! Goodbye");
        } else {

            //User chooses showing, error if wrong input
            do {
                System.out.print("Choose 1 for first showing or 2 for second showing: ");
                showing = input.nextInt();

                switch (showing) {
                    case 1:
                        show = "1st";
                        break;
                    case 2:
                        show = "2nd";
                        break;
                    default:
                        System.out.println("INVALID: Enter 1 or 2");
                        break;
                }
            } while (showing >= 3);

            System.out.println("You selected the " + show + " showing for movie " + movie);
            Prices.pricing();
            CustomerAccount custAcct = new CustomerAccount();
            custAcct.payment();
            Receipt receipt = new Receipt();
            receipt.customerName();
            Receipt.printTime();
        }

    }


}
