package com.example.expoli1;

public class Electronics extends Product
{
    private String color;

    public Electronics(String name, double price, String description, String color) {
        super(name, price, description);
        this.color = color;
    }

    @Override
    public String getDescription() {
        return "This electronic product is colored - " + color;
    }
    @Override
    public String getName() {
        return "This electronic product is - " + name;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
