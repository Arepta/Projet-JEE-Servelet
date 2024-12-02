
package com.example.edu.model;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    // Attributes
    private int id;
private String name;
private String email;
private String phoneNumber;

    // Constructors
    public Student() {
    }

    public Student(int id, String name, String email, String phoneNumber) {
        this.id = id;
this.name = name;
this.email = email;
this.phoneNumber = phoneNumber;
    }

    // Getters and Setters
    public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getPhoneNumber() {
    return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}
}
