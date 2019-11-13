package com.company;

import java.util.Scanner;

public class Menu {


    public static void printMenu() {

        System.out.println("           **********************************************");
        System.out.println("           * Welcome to the ISSQUAD Movie Ticket System *");
        System.out.println("           **********************************************\n");

        String[][] movieTitles = {{"Movie Title           |", "Movie Rating |", " First Showing |", "Second Showing |"},
                {"1 Bohemian Rhapsody    |", "    PG-13    |", "    4:30pm     |", "   8:00pm      |"},
                {"2 Dr. Seuss' the Grinch|", "     PG      |", "    12:30pm    |", "   3:00pm      |"},
                {"3 Overlord             |", "     R       |", "    7:30pm     |", "  10:00pm      |"},
                {"4 Widows               |", "     R       |", "    2:00pm     |", "   5:00pm      |"}};


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(movieTitles[i][j] + "  ");
            }
            System.out.println("\n__________________________________________________________________________");
        }

    }
}