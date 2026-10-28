package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class BufferedWriterExample {

    public static void main(String[] args) {

        try{

            ArrayList<String> myTodos = new ArrayList<>();
            myTodos.add("Finish Java homework\n");
            myTodos.add("Go to the grocery store\n");
            myTodos.add("Wash the car\n");
            myTodos.add("Clean the kitchen\n");
            myTodos.add("Walk the dog\n");
            myTodos.add("Pay the electric bill\n");
            myTodos.add("Schedule a dentist appointment\n");
            myTodos.add("Go to the gym\n");
            myTodos.add("Take out the trash\n");
            myTodos.add("Call Mom\n");

            //create a buffered writer
            BufferedWriter eWriter = new BufferedWriter(new FileWriter("todos.txt", true));

            for(String todo : myTodos){
                eWriter.write(todo);
            }

            //close the writer so it writes to the file
            eWriter.close();

        }catch(Exception e){

            System.out.println("something went wrong" + e.getMessage());

        }


    }

}
