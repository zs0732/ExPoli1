package com.example.expoli1;

public class ShoppingCart extends Product {
    public ShoppingCart(String name, double price, String description) {
        super(name, price, description);
    }
    Product[] products = new Product[10];

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

}
