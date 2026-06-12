package com.auction.models;

public class Bid {
    private Bidder bidder;
    private int amount;

    public Bid(Bidder bidder, int amount) {
        this.bidder = bidder;
        this.amount = amount;
    }


    public Bidder getBidder() {
        return bidder;
    }

    public void setBidder(Bidder bidder) {
        this.bidder = bidder;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}