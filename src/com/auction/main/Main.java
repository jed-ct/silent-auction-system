package com.auction.main;

import java.util.Scanner;
import com.auction.models.*;
import com.auction.exception.*;

public class Main {
    private static void printMenu() {
        System.out.print("=== SILENT AUCTION MANAGER ===\n" +
                "1. View All Active Lots\n" +
                "2. Register as a Bidder\n" +
                "3. Place a Bid\n" +
                "4. View Bid History for an Item\n" +
                "5. Close Auction & Generate Report\n" +
                "6. Save & Exit\n" +
                "Choose an option (1-6): ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userSelection;
        int currentMode;
        Bidder bidder1 = new Bidder("Jedric", "tuquerojedric@gmail.com");
        Bidder bidder2 = new Bidder("Kenji", "dwdwdwdw");

        Bid bid1ToItem1 = new Bid(bidder1, 200);
        Bid bid2ToItem1 = new Bid(bidder2, 300);
        Bid bid3ToItem1 = new Bid(bidder1, 500);

        TechItem phone = new TechItem("D53S","Iphone 17 Pro Max", 1, "Apple", true);
        BidRequest bidrequest = new BidRequest(bidder1, 300);

        try {
            phone.placeBid(bid1ToItem1);
        }
        catch (ClosedBidException e) {
            System.out.println(e.getMessage());
        }
        phone.placeBid(bid1ToItem1);
        phone.placeBid(bid2ToItem1);
        phone.placeBid(bid3ToItem1);


        System.out.printf("Current Highest Bid on %s (%s)\n%s - %d",phone.getItemName(), phone.getLotId(), phone.getHighestBid().bidder().getName(), phone.getHighestBid().amount());
        System.out.println(bid2ToItem1.toString());



//        while (true) {
//            printMenu();
//            userSelection = scanner.nextInt();
//            currentMode = userSelection;
//            if (currentMode == 6) {
//                break;
//            }
//        }


    }
}