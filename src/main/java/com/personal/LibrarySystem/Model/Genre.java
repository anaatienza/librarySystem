package com.personal.LibrarySystem.Model;

public class Genre {

    private int id;
    private int name;

    //Constructor vacío
    public Genre() {}


    //Constructor con parámetros
    public Genre(int id, int name) {
        this.id = id;
        this.name = name;
    }

    //Getters y Setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public int getName() {return name;}
    public void setName(int name) {this.name = name;}
}

