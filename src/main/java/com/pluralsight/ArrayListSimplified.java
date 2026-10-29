package com.pluralsight;

import java.util.ArrayList;

public class ArrayListSimplified {

    public static void main(String[] args) {

        //create an array list of strings
        ArrayList<String> students = new ArrayList<>();

        //add strings to the list
        students.add("Tevyn");
        students.add("Sam");
        students.add("Neo");
        students.add("Morpheus");
        students.add("Trinity");

        //loop over the students
        for(String student : students){
            System.out.println(student);
        }

        //loop over the students with a longer for loop
        //highlights that we need .size() to know how many items on the lists
        //to get a student off the list we use .get(index)
        for(int i = 0; i < students.size(); i++){

            //not needed but get the current value and put in in a variable so I don't
            //have to keep typing students.get(i) <--icky
            String student = students.get(i);

            //print out stuff about the student
            System.out.println(i + ": " + student + " inside the longer loop");

        }

        //print out neo
        System.out.println( students.get(2) );

        //change neo to ted
        students.set(2, "ted");

        System.out.println( "neo is now " + students.get(2) );

        //how many students on the list?
        System.out.println( students.size() );

        System.out.println(students);
        //remove trinity
        students.remove(4);
        System.out.println(students);


        ArrayList<Person> people = new ArrayList<>();

        people.add( new Person("Mohamed", "Bilal", "Fish") );
        people.add( new Person("Eric", "Schwartz", "Asian") );
        people.add( new Person("Jennifer", "Gomez", "Chicken Bowl") );

        for( Person person : people){

            System.out.printf(
                    "%s %s loves %s $%.2f%n",
                    person.getFirstName(),
                    person.getLastName(),
                    person.getFavoriteFood(),
                    4.99
            );

           // System.out.println(person.getFirstName() + " " + person.getLastName() + " loves " + person.getFavoriteFood());

        }



    }




}
