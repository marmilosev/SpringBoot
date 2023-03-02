package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //specifies how to generate values for the given column
    private Long id;
    private String firstName;
    private String lastName;

    //constructor which exists only for the sake of JPA
    protected  Student(){};

    //constructor use to create instances of Customer to be saved to the database
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //method print outs the customer’s properties
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
        id, firstName, lastName);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
