package com.company;

public class Nuts extends Item {

    public Nuts(String itemName, int itemPrice, int itemNumber) {
        super(itemName, itemPrice, itemNumber);
    }

    public static int getNutsPrice() {
        return NUTS_PRICE;
    }

    public static void setNutsPrice(int nutsPrice) {
        NUTS_PRICE = nutsPrice;
    }

    private static int NUTS_PRICE = 90;

}
