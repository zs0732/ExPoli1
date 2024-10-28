package com.example.expoli1;

public class Clothing extends Product{

    private String size;

    public Clothing(String name, double price, String description, String size) {
        super(name, price, description);
        this.size = size;
    }

    @Override
    public String getDescription() {
        return "This cloth is the size" + size;
    }
    @Override
    public String getName() {
        return "This cloth is - " + name;
    }
    @Override
    public double getPrice() {
        return price;
    }

}
