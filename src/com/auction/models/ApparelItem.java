package com.auction.models;

public class ApparelItem extends Item {
    private final String size;

    public ApparelItem(String name, int quantity, String size) {
        super(name, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}