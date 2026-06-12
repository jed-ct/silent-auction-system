package com.auction.main;

import java.util.Scanner;
import com.auction.models.*;

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

        TechItem phone = new TechItem("Iphone 17 Pro Max", 1, "Apple", true);
        phone.placeBid(bid1ToItem1);
        phone.placeBid(bid2ToItem1);
        phone.placeBid(bid3ToItem1);


        System.out.printf("Highest Bid\n%s\n%d", phone.getHighestBid().getBidder().getName(), phone.getHighestBid().getAmount());




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