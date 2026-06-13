package com.auction.models;

public class ApparelItem extends Item {
    private final String size;

    public ApparelItem(String lotId, String name, int quantity, String size) {
        super(lotId, name, quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}