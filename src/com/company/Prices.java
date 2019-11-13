package com.company;

import java.util.Scanner;

public class Prices {

    static Scanner input = new Scanner(System.in);

    public static void pricing(){

        System.out.println("Adult ticket: $12.00");
        System.out.println("Senior/Child ticket: $9.00");
        System.out.println("Please enter the amount of Adult tickets needed: ");
        int numAdultTix = input.nextInt();
        System.out.println("Please enter the amount of Senior/Child tickets needed: ");
        int numChildTix = input.nextInt();

        int totalPrice = (12 * numAdultTix) + (9 * numChildTix);

        System.out.println("Adult tickets: " + numAdultTix);
        System.out.println("Senior/Child tickets: " + numChildTix);
        System.out.println("Total: $ " + totalPrice + ".00");



    }
}
