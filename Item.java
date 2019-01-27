package com.company;

public abstract class Item {
    public Item(String itemName , int itemPrice ,int itemNumber) {
        this.itemNumber = itemNumber;
        this.itemPrice = itemPrice;
        this.itemName = itemName;
        this.initialAmountOfItem = itemNumber ;
    }

    private String itemName;
    private int itemPrice;
    private int itemNumber;

    public int getInitialAmountOfItem() {
        return initialAmountOfItem;
    }

    public void setInitialAmountOfItem(int initialAmountOfItem) {
        this.initialAmountOfItem = initialAmountOfItem;
    }

    private  int initialAmountOfItem;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

}
