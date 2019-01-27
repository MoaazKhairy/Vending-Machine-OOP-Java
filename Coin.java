package com.company;

public abstract class Coin {
    public Coin(int coinValue , int coinNumberInMachine) {
        this.coinValue = coinValue;
        this.coinNumberInMachine = coinNumberInMachine;
        this.coinInitialNumberInMachine = coinNumberInMachine;
    }

    private int coinValue;
    private int coinNumberInMachine;
    private int coinInitialNumberInMachine;

    public int getCoinInitialNumberInMachine() {
        return coinInitialNumberInMachine;
    }

    public void setCoinInitialNumberInMachine(int coinInitialNumberInMachine) {
        this.coinInitialNumberInMachine = coinInitialNumberInMachine;
    }


    public int getCoinNumberInMachine() {
        return coinNumberInMachine;
    }

    public void setCoinNumberInMachine(int coinNumberInMachine) {
        this.coinNumberInMachine = coinNumberInMachine;
    }


    public int getCoinValue() {
        return coinValue;
    }

    public void setCoinValue(int coinValue) {
        this.coinValue = coinValue;
    }

}
