package com.company;

import java.util.ArrayList;

public class Inventory {

    public Inventory() {
    }



    private int numberOfItems;
    private Item item;

    public void enterItem(Item item , int numberOfItems){
        item.setItemNumber(numberOfItems) ;
    }

    public void removeItem(Item item , int numberOfItems){
        item.setItemNumber(item.getItemNumber() - numberOfItems);
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getNumberOfItems() {

        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

}
