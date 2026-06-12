package com.auction.models;

public class Bidder {
    private final String name;
    private final String emailAddress;

    public Bidder(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}