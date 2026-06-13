package com.auction.models;

import java.util.ArrayList;
import com.auction.exception.*;

public class Item implements Biddable {
    private final int lotId;
    private final String itemName;
    private final int quantity;

    private AuctionStatus status = AuctionStatus.ACTIVE;

    private final ArrayList<Bid> bids = new ArrayList<>();

    private static int lotIdCounter = 0;

    public Item(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
        lotId = lotIdCounter;
        lotIdCounter++;
    }

    @Override
    public void placeBid(Bid bid) {
        if (status == AuctionStatus.ACTIVE) {
            bids.add(bid);
        }
        else {
            throw new ClosedBidException("The bid for the item is closed.");
        }
    }

    @Override
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

    public void setStatus(AuctionStatus status) {
        this.status = status;
    }

    public AuctionStatus getStatus() {
        return status;
    }
}