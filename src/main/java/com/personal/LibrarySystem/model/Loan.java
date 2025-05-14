package com.personal.LibrarySystem.model;

import java.time.LocalDate;

public class Loan {

    private int id;
    private LocalDate loanDate;
    private LocalDate dueDate;
    private LocalDate returnDate;
    private int userId;
    private int bookId;

    //Constructor vacío
    public Loan() {}

    //Constructor con parámetros
    public Loan(int id, int bookId, int userId, LocalDate returnDate, LocalDate dueDate, LocalDate loanDate) {
        this.id = id;
        this.bookId = bookId;
        this.userId = userId;
        this.returnDate = returnDate;
        this.dueDate = calculateDueDate();
        this.loanDate = loanDate;
    }

    //Getters y Setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public int getUserId() {return userId;}

    public void setUserId(int userId) {this.userId = userId;}

    public LocalDate getReturnDate() {return returnDate;}
    public void setReturnDate(LocalDate returnDate) {this.returnDate = returnDate;}

    public LocalDate getDueDate() {return dueDate;}
    public void setDueDate(LocalDate dueDate) {this.dueDate = dueDate;}

    public LocalDate getLoanDate() {return loanDate;}
    public void setLoanDate(LocalDate loanDate) {this.loanDate = loanDate;}

    public int getBookId() {return bookId;}
    public void setBookId(int bookId) {this.bookId = bookId;}

    //Método para calcular día de retorno
    private LocalDate calculateDueDate() {
        return loanDate.plusDays(30);
    }

}
