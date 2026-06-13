package com.auction.models;

public class Bidder {
    private final int bidderId;
    private final String name;
    private final String emailAddress;

    private static int bidderIdCounter = 0;

    public Bidder(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
        bidderId = bidderIdCounter;
        bidderIdCounter++;
    }

    public String getName() {
        return name;
    }

    public int getBidderId() { return bidderId; }
}