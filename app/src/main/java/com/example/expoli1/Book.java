package com.example.expoli1;

public class Book extends Product {
    private String author;

    public Book(String name, double price, String description, String author) {
        super(name, price, description);
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "This is a book by " + author;
    }
    @Override
    public String getName() {
        return "This book is -  " + name;
    }
    @Override
    public double getPrice() {
        return price;
    }

}
