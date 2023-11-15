package org.example.school.entities;

import java.time.LocalDate;

public class Book {
    private String author;
    private String bookTittle;
    private int quantity;

    public Book( String author, String bookTittle, int quantity) {

        this.author = author;
        this.bookTittle = bookTittle;
        this.quantity = quantity;

    }





    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTittle() {
        return bookTittle;
    }

    public void setBookTittle(String bookTittle) {
        this.bookTittle = bookTittle;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




}
