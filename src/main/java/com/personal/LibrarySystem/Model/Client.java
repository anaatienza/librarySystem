package com.personal.LibrarySystem.Model;

import java.time.LocalDate;

public class Client {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private LocalDate birthDate;


    //Constructor vacío
    public Client() {}

    //Constructor con parámetros
    public Client(int id, LocalDate birthDate, String phoneNumber, String email, String lastName, String firstName) {
        this.id = id;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    //Getters y Setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public LocalDate getBirthDate() {return birthDate;}
    public void setBirthDate(LocalDate birthDate) {this.birthDate = birthDate;}

    public String getPhoneNumber() {return phoneNumber;}
    public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
}
