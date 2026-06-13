package com.auction.models;

import java.util.ArrayList;
import com.auction.exception.*;

public class Item implements Biddable {
    private final String lotId;
    private final String itemName;
    private final int quantity;

    private AuctionStatus status = AuctionStatus.ACTIVE;

    private final ArrayList<Bid> bids = new ArrayList<>();

    public Item(String lotId, String itemName, int quantity) {
        this.lotId = lotId;
        this.itemName = itemName;
        this.quantity = quantity;
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
            if (bid.amount() > currentHighestBid.amount()) {
                currentHighestBid = bid;
            }
        }
        return currentHighestBid;
    }

    public String getLotId() {
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