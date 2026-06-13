package com.auction.exception;

public class ClosedBidException extends RuntimeException {
    public ClosedBidException (String m) {
        super(m);
    }
}
