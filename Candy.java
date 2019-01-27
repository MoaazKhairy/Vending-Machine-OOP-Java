package com.company;

public class Candy extends Item {

    public Candy(String itemName, int itemPrice, int itemNumber) {
        super(itemName, itemPrice, itemNumber);

    }

    public static int getCandyPrice() {
        return CANDY_PRICE;
    }

    public static void setCandyPrice(int candyPrice) {
        CANDY_PRICE = candyPrice;
    }

    private static int CANDY_PRICE = 10;


}

