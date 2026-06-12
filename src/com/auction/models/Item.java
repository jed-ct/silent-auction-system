package com.auction.models;

public class Item {
    private final int lotId;
    private final String itemName;
    private final int quantity;

    private static int lotIdCounter = 0;

    public Item(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        lotId = lotIdCounter;
        lotIdCounter++;
    }

    public int getLotId() {
        return lotId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }
}