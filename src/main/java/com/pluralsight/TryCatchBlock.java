package com.pluralsight;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlock {

    public static void main(String[] args) {

        boolean appRunning = true;
        while (appRunning) {
            try {

                //create a scanner wo we can ask questions
                Scanner input = new Scanner(System.in);

                //create an array of names
                ArrayList<String> names = new ArrayList<>();
                names.add("John");
                names.add("Jane");
                names.add("Julie");
                names.add("Kimball");
                names.add("David");
                names.add("Richard");

                System.out.print("Pick a kid (select #1 - #6 - 0 to exit): ");
                int index = input.nextInt();

                //this way if they pick 1 it really starts at 0
                --index;

                //turn off the loop
                if (index < 0) {
                    appRunning = false;
                }

                System.out.println("You selected " + names.get(index));

            } catch (Exception e) {

                //log the error to some reporting system or email the developer

                //maybe print out a shorter version of the error
                System.out.println(e.getMessage());

                //here's where we diced what to do if all went wrong
                //maybe display a friendly message
                System.out.println("Sorry that number was invalid");

            }
        }


    }
}
