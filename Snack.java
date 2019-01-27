package com.company;

public class Snack extends Item {
    public Snack(String itemName, int itemPrice, int itemNumber) {
        super(itemName, itemPrice, itemNumber);
    }

    public static int getSnackPrice() {
        return SNACK_PRICE;
    }

    public static void setSnackPrice(int snackPrice) {
        SNACK_PRICE = snackPrice;
    }

    private static int SNACK_PRICE = 50 ;


}
