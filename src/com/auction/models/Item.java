package com.auction.models;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Item {
    private final int lotId;
    private final String itemName;
    private final int quantity;
    private ArrayList<Bid> bids = new ArrayList<>();

    private static int lotIdCounter = 0;

    public Item(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        lotId = lotIdCounter;
        lotIdCounter++;
    }

    public void placeBid(Bid bid) {
        bids.add(bid);
    }

    public Bid getHighestBid() {
        Bid currentHighestBid = bids.getFirst();
        for (Bid bid : bids) {
            if (bid.getAmount() > currentHighestBid.getAmount()) {
                currentHighestBid = bid;
            }
        }
        return currentHighestBid;
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