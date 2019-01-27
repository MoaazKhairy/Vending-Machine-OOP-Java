package com.company;

public class Coke extends Item {

    public Coke(String itemName, int itemPrice, int itemNumber) {
        super(itemName, itemPrice, itemNumber);
    }

    public static int getCokePrice() {
        return COKE_PRICE;
    }

    public static void setCokePrice(int cokePrice) {
        COKE_PRICE = cokePrice;
    }

    private static int COKE_PRICE = 25;

}
