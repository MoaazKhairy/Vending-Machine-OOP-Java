package com.company;

public class Pepsi extends Item {

    public Pepsi(String itemName, int itemPrice, int itemNumber) {
        super(itemName, itemPrice, itemNumber);
    }

    public static int getPepsiPrice() {
        return PEPSI_PRICE ;
    }

    public static void setPepsiPrice(int pepsiPrice) {
        PEPSI_PRICE = pepsiPrice;
    }

    private static int PEPSI_PRICE = 35;

}
