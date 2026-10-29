package com.pluralsight;

public class Person {

    //things that describe a person
    private String firstName;
    private String lastName;
    private String favoriteFood;

    //it helps up create an object
    public Person(String firstName, String lastName, String favoriteFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteFood = favoriteFood;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }
}
