package com.company;

public class Bill {

    public Bill(){

    }

    private static int SUM_OF_ITEMS_PRICE;
    private static int CHANGE;
    private static int SUM_OF_INSERTED_CENTS ;

    public static void pay(int sumItemPrice , int sumInsertedCents) throws NotSufficientPaidException {
        if(sumItemPrice > sumInsertedCents){
            throw new NotSufficientPaidException("Your Cents not Sufficient to pay These items please enter added Coins ");
        }
        else {
            Bill.setChange(sumInsertedCents-sumItemPrice);
        }
    }

    public static int getSumOfItemsPrice() {
        return SUM_OF_ITEMS_PRICE;
    }

    public static void setSumOfItemsPrice(int sumOfItemsPrice) {
        SUM_OF_ITEMS_PRICE = sumOfItemsPrice;
    }

    public static int getSumOfInsertedCents() {
        return SUM_OF_INSERTED_CENTS;
    }

    public static void setSumOfInsertedCents(int sumOfInsertedCents) {
        SUM_OF_INSERTED_CENTS = sumOfInsertedCents;
    }

    public static int getChange() {
        return CHANGE;
    }

  //  public  void getMyChangeAfterTransaction ()

    public static void setChange(int change) {
        CHANGE = change;
    }


}
