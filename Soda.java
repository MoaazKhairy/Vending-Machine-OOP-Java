package com.company;

public class Soda extends Item {

    public Soda(String itemName, int itemPrice, int itemNumber) {
        super(itemName, itemPrice, itemNumber);
    }

    public static int getSodaPrice() {
        return SODA_PRICE;
    }

    public static void setSodaPrice(int sodaPrice) {
        SODA_PRICE = sodaPrice;
    }

    private static int SODA_PRICE = 45;

    public void setSodaNumber(int sodaNumber) {
        this.sodaNumber = sodaNumber;
    }

    private int sodaNumber;
}
