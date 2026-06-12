package com.auction.models;

public class TechItem extends Item {
    private final String brand;
    private final boolean isWorking;

    public TechItem(String itemName, int quantity, String brand, boolean isWorking) {
        super(itemName, quantity);
        this.brand = brand;
        this.isWorking = isWorking;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isWorking() {
        return isWorking;
    }

}