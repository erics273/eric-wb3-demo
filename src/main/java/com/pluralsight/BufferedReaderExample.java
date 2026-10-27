package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {

    public static void main(String[] args) {

        //if we are reading a file it must be in a try/catch because it may not be there or accessible
        try {

            //read the file.
            BufferedReader theFile = new BufferedReader( new FileReader("famousquotes.txt") );

            //create a variable that represents each line
            String line;
            //loop over the file and assign each line to the line variable until we run out of lines and get null
            while((line = theFile.readLine()) != null) {
                //print out each line
                System.out.println(line);
            }

            //close the file when we are done
            theFile.close();

        }catch (Exception e){

            System.out.println(e.getMessage());
            System.out.println("we couldn't access the file");

        }


    }

}
