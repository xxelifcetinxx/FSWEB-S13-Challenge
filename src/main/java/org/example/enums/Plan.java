package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 99.99),
    PREMIUM("Premium Plan", 199.99),
    VIP("VIP Plan", 299.99);

    private final String name;
    private final double price;

    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
