package com.auction.models;

import com.auction.models.Bid;

public interface Biddable {
    void placeBid(Bid bid);
    Bid getHighestBid();
}