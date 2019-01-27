package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class machine {
    private JPanel panelMain;
    private JButton pennyButton;
    private JButton nickelButton;
    private JButton dimeButton;
    private JButton quarterButton;
    private JButton halfDollarButton;
    private JButton oneDollarButton;
    private JButton twoDollarsButton;
    private JLabel lblSum;
    private JLabel lblChoose;
    private JCheckBox cbCandy;
    private JLabel lblTotalPrice;
    private JButton ExitButton;
    private JCheckBox cbSnack;
    private JCheckBox cbNuts;
    private JCheckBox cbSoda;
    private JCheckBox cbCoke;
    private JCheckBox cbPepsi;
    private JButton CancelButton;
    private JLabel lblCandyInventory;
    private JLabel lblSnackInventory;
    private JLabel lblNutsInventory;
    private JLabel lblCokeInventory;
    private JLabel lblPepsiInventory;
    private JLabel lblSodaInventory;
    private JLabel lblSumPrice;
    private JTextField tbCandyWant;
    private JTextField tbSnackWant;
    private JTextField tbNutsWant;
    private JTextField tbCokeWant;
    private JTextField tbPepsiWant;
    private JTextField tbSodaWant;
    private JLabel lblSumInsertedCents;
    private JButton payButton;
    private JLabel lblEnteredCentsForBill;
    private JLabel lblItemsPriceForBill;
    private JLabel lblChangeForBill;
    private JButton GetMyChangeButton;
    private JLabel lblNumOfPennyInMachine;
    private JLabel lblNumOfNickelInMachine;
    private JLabel lblNumOfDimeInMachine;
    private JLabel lblNumOfQuarterInMachine;
    private JLabel lblNumOfHalfDollarInMachine;
    private JLabel lblNumOfOneDollarInMachine;
    private JLabel lblNumOfTwoDollarInMachine;

    public int sumPrice = 0;
    public int sumInsertedCents = 0;
    public int flag;

    public int sumCandy = 10;
    public int sumSnack = 50;
    public int sumNuts = 90;
    public int sumCoke = 25;
    public int sumPepsi = 35;
    public int sumSoda = 45;

    Inventory inventory = new Inventory();
    Bill bill = new Bill();
    Coin penny = null;
    Coin nickel = null;
    Coin dime = null;
    Coin quarter = null;
    Coin halfDollar = null;
    Coin oneDollar = null;
    Coin twoDollar = null;

    public int sumCentsInMachine ;


    public machine() {

        GetMyChangeButton.setEnabled(false);
        //insert number of each item in inventory
        Candy candy = new Candy("CANDY",10 , 40);
        inventory.enterItem(candy , 40);
        lblCandyInventory.setText(Integer.toString(candy.getInitialAmountOfItem()));

        Snack snack = new Snack("SNACK",50 , 50);
        inventory.enterItem(snack , 50);
        lblSnackInventory.setText(Integer.toString(snack.getInitialAmountOfItem()));

        Nuts nuts = new Nuts("NUTS",90 , 60);
        inventory.enterItem(nuts , 60);
        lblNutsInventory.setText(Integer.toString(nuts.getInitialAmountOfItem()));

        Coke coke = new Coke("COKE",25 , 70);
        inventory.enterItem(coke , 70);
        lblCokeInventory.setText(Integer.toString(coke.getInitialAmountOfItem()));

        Pepsi pepsi = new Pepsi("PEPSI",35 , 80);
        inventory.enterItem(pepsi , 80);
        lblPepsiInventory.setText(Integer.toString(pepsi.getInitialAmountOfItem()));

        Soda soda = new Soda("SODA",45 , 90);
        inventory.enterItem(soda , 90);
        lblSodaInventory.setText(Integer.toString(soda.getInitialAmountOfItem()));


        //respond when use checkboxes that add total price and reduce number of items in inventory
        cbCandy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbCandy.isSelected()) {
                    tbCandyWant.setText("1");
                    sumPrice += Candy.getCandyPrice();
                    inventory.removeItem(candy , 1);
                    lblCandyInventory.setText(Integer.toString(candy.getItemNumber()));
                } else {
                    sumPrice -= (Candy.getCandyPrice()*Integer.parseInt(tbCandyWant.getText()));
                    inventory.enterItem(candy , candy.getInitialAmountOfItem());
                    lblCandyInventory.setText(Integer.toString(candy.getItemNumber()));
                    tbCandyWant.setText("1");
                }
                lblSumPrice.setText(Integer.toString(sumPrice));
            }
        });


        cbSnack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbSnack.isSelected()) {
                    tbSnackWant.setText("1");
                    sumPrice += Snack.getSnackPrice();
                    inventory.removeItem(snack , 1);
                    lblSnackInventory.setText(Integer.toString(snack.getItemNumber()));
                } else {
                    sumPrice -= (Snack.getSnackPrice()*Integer.parseInt(tbSnackWant.getText()));
                    inventory.enterItem(snack , snack.getInitialAmountOfItem());
                    lblSnackInventory.setText(Integer.toString(snack.getItemNumber()));
                    tbSnackWant.setText("1");
                }
                lblSumPrice.setText(Integer.toString(sumPrice));
            }
        });


        cbNuts.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbNuts.isSelected()) {
                    tbNutsWant.setText("1");
                    sumPrice += Nuts.getNutsPrice();
                    inventory.removeItem(nuts ,1);
                    lblNutsInventory.setText(Integer.toString(nuts.getItemNumber()));
                } else {
                    sumPrice -= (Nuts.getNutsPrice()*Integer.parseInt(tbNutsWant.getText()));
                    inventory.enterItem(nuts , nuts.getInitialAmountOfItem());
                    lblNutsInventory.setText(Integer.toString(nuts.getItemNumber()));
                    tbNutsWant.setText("1");
                }
                lblSumPrice.setText(Integer.toString(sumPrice));
            }
        });


        cbCoke.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbCoke.isSelected()) {
                    tbCokeWant.setText("1");
                    sumPrice += Coke.getCokePrice();
                    inventory.removeItem(coke ,1);
                    lblCokeInventory.setText(Integer.toString(coke.getItemNumber()));
                } else {
                    sumPrice -= (Coke.getCokePrice()*Integer.parseInt(tbCokeWant.getText()));
                    inventory.enterItem(coke , coke.getInitialAmountOfItem());
                    lblCokeInventory.setText(Integer.toString(coke.getItemNumber()));
                    tbCokeWant.setText("1");
                }
                lblSumPrice.setText(Integer.toString(sumPrice));
            }
        });


        cbPepsi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbPepsi.isSelected()) {
                    tbPepsiWant.setText("1");
                    sumPrice += Pepsi.getPepsiPrice();
                    inventory.removeItem(pepsi ,1);
                    lblPepsiInventory.setText(Integer.toString(pepsi.getItemNumber()));
                } else {
                    sumPrice -= (Pepsi.getPepsiPrice()*Integer.parseInt(tbPepsiWant.getText()));
                    inventory.enterItem(pepsi , pepsi.getInitialAmountOfItem());
                    lblPepsiInventory.setText(Integer.toString(pepsi.getItemNumber()));
                    tbPepsiWant.setText("1");
                }
                lblSumPrice.setText(Integer.toString(sumPrice));
            }
        });


        cbSoda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbSoda.isSelected()) {
                    tbSodaWant.setText("1");
                    sumPrice += Soda.getSodaPrice();
                    inventory.removeItem(soda ,1);
                    lblSodaInventory.setText(Integer.toString(soda.getItemNumber()));
                } else {
                    sumPrice -= (Soda.getSodaPrice()*Integer.parseInt(tbSodaWant.getText()));
                    inventory.enterItem(soda , soda.getInitialAmountOfItem());
                    lblSodaInventory.setText(Integer.toString(soda.getItemNumber()));
                    tbSodaWant.setText("1");
                }
                lblSumPrice.setText(Integer.toString(sumPrice));
            }
        });


        //detect number of wanted items from TextBoxes
        tbCandyWant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbCandy.isSelected()) {
                    sumPrice = sumPrice - sumCandy;
                    sumCandy = (Candy.getCandyPrice() * Integer.parseInt(tbCandyWant.getText()));
                    sumPrice += sumCandy;
                    checkAmountInInventory(candy,Integer.parseInt(tbCandyWant.getText()));
                    lblCandyInventory.setText(Integer.toString(candy.getItemNumber()));
                 }
            }
        });


        tbSnackWant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbSnack.isSelected()) {
                    sumPrice = sumPrice - sumSnack;
                    sumSnack = (Snack.getSnackPrice() * Integer.parseInt(tbSnackWant.getText()));
                    sumPrice += sumSnack;
                    checkAmountInInventory(snack,Integer.parseInt(tbSnackWant.getText()));
                    lblSnackInventory.setText(Integer.toString(snack.getItemNumber()));
                }
            }
        });


        tbNutsWant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbNuts.isSelected()) {
                    sumPrice = sumPrice - sumNuts;
                    sumNuts = (Nuts.getNutsPrice() * Integer.parseInt(tbNutsWant.getText()));
                    sumPrice += sumNuts;
                    checkAmountInInventory(nuts,Integer.parseInt(tbNutsWant.getText()));
                    lblNutsInventory.setText(Integer.toString(nuts.getItemNumber()));
                }
            }
        });


        tbCokeWant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbCoke.isSelected()) {
                    sumPrice = sumPrice - sumCoke;
                    sumCoke = (Coke.getCokePrice() * Integer.parseInt(tbCokeWant.getText()));
                    sumPrice += sumCoke;
                    checkAmountInInventory(coke,Integer.parseInt(tbCokeWant.getText()));
                    lblCokeInventory.setText(Integer.toString(coke.getItemNumber()));
                }
            }
        });

        tbPepsiWant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbPepsi.isSelected()) {
                    sumPrice = sumPrice - sumPepsi;
                    sumPepsi = (Pepsi.getPepsiPrice() * Integer.parseInt(tbPepsiWant.getText()));
                    sumPrice += sumPepsi;
                    checkAmountInInventory(pepsi,Integer.parseInt(tbPepsiWant.getText()));
                    lblPepsiInventory.setText(Integer.toString(pepsi.getItemNumber()));
                }
            }
        });
        tbSodaWant.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbSoda.isSelected()) {
                    sumPrice = sumPrice - sumSoda;
                    sumSoda = (Soda.getSodaPrice() * Integer.parseInt(tbSodaWant.getText()));
                    sumPrice += sumSoda;
                    checkAmountInInventory(soda,Integer.parseInt(tbSodaWant.getText()));
                    lblSodaInventory.setText(Integer.toString(soda.getItemNumber()));
                }
            }
        });

        ////////////effects of coins buttons//////////

         penny = new Penny(1 , 2);
         lblNumOfPennyInMachine.setText(Integer.toString(penny.getCoinNumberInMachine()));
         nickel = new Nickel(5 , 3);
         lblNumOfNickelInMachine.setText(Integer.toString(nickel.getCoinNumberInMachine()));
         dime = new Dime(10 , 7);
        lblNumOfDimeInMachine.setText(Integer.toString(dime.getCoinNumberInMachine()));
        quarter = new Quarter(25 , 0);
        lblNumOfQuarterInMachine.setText(Integer.toString(quarter.getCoinNumberInMachine()));
        halfDollar = new HalfDollar(50 , 2 );
        lblNumOfHalfDollarInMachine.setText(Integer.toString(halfDollar.getCoinNumberInMachine()));
        oneDollar = new OneDollar(100 , 10 );
        lblNumOfOneDollarInMachine.setText(Integer.toString(oneDollar.getCoinNumberInMachine()));
        twoDollar = new TwoDollar(200 , 5);
        lblNumOfTwoDollarInMachine.setText(Integer.toString(twoDollar.getCoinNumberInMachine()));

        pennyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumInsertedCents += penny.getCoinValue();
                lblNumOfPennyInMachine.setText(Integer.toString(penny.getCoinNumberInMachine()+1));
                addCoin(penny);
                lblSumInsertedCents.setText(Integer.toString(sumInsertedCents));
            }
        });

        nickelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumInsertedCents += nickel.getCoinValue();
                lblNumOfNickelInMachine.setText(Integer.toString(nickel.getCoinNumberInMachine()+1));
                addCoin(nickel);
                lblSumInsertedCents.setText(Integer.toString(sumInsertedCents));
            }
        });

        dimeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumInsertedCents += dime.getCoinValue();
                lblNumOfDimeInMachine.setText(Integer.toString(dime.getCoinNumberInMachine()+1));
                addCoin(dime);
                lblSumInsertedCents.setText(Integer.toString(sumInsertedCents));
            }
        });

        quarterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumInsertedCents += quarter.getCoinValue();
                lblNumOfQuarterInMachine.setText(Integer.toString(quarter.getCoinNumberInMachine()+1));
                addCoin(quarter);
                lblSumInsertedCents.setText(Integer.toString(sumInsertedCents));
            }
        });

        halfDollarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumInsertedCents += halfDollar.getCoinValue();
                lblNumOfHalfDollarInMachine.setText(Integer.toString(halfDollar.getCoinNumberInMachine()+1));
                addCoin(halfDollar);
                lblSumInsertedCents.setText(Integer.toString(sumInsertedCents));
            }
        });

        oneDollarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumInsertedCents += oneDollar.getCoinValue();
                lblNumOfOneDollarInMachine.setText(Integer.toString(oneDollar.getCoinNumberInMachine()+1));
                addCoin(oneDollar);
                lblSumInsertedCents.setText(Integer.toString(sumInsertedCents));
            }
        });

        twoDollarsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sumInsertedCents += twoDollar.getCoinValue();
                lblNumOfTwoDollarInMachine.setText(Integer.toString(twoDollar.getCoinNumberInMachine()+1));
                addCoin(twoDollar);
                lblSumInsertedCents.setText(Integer.toString(sumInsertedCents));
            }
        });

        //////Effect of Exit Button////
        ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        //Effect of Cancel Button
        CancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int YesOrNo = JOptionPane.showConfirmDialog(null,"Do You Want To Cancel Order ?","Cancel Order", JOptionPane.YES_NO_OPTION);
                if(YesOrNo == 0)
                {
                    reFund();
                    sumInsertedCents = 0;
                    lblNumOfPennyInMachine.setText(Integer.toString(penny.getCoinInitialNumberInMachine()));
                    penny.setCoinNumberInMachine(penny.getCoinInitialNumberInMachine());

                    lblNumOfNickelInMachine.setText(Integer.toString(nickel.getCoinInitialNumberInMachine()));
                    nickel.setCoinNumberInMachine(nickel.getCoinInitialNumberInMachine());

                    lblNumOfDimeInMachine.setText(Integer.toString(dime.getCoinInitialNumberInMachine()));
                    dime.setCoinNumberInMachine(dime.getCoinInitialNumberInMachine());

                    lblNumOfQuarterInMachine.setText(Integer.toString(quarter.getCoinInitialNumberInMachine()));
                    quarter.setCoinNumberInMachine(quarter.getCoinInitialNumberInMachine());

                    lblNumOfHalfDollarInMachine.setText(Integer.toString(halfDollar.getCoinInitialNumberInMachine()));
                    halfDollar.setCoinNumberInMachine(halfDollar.getCoinInitialNumberInMachine());

                    lblNumOfOneDollarInMachine.setText(Integer.toString(oneDollar.getCoinInitialNumberInMachine()));
                    oneDollar.setCoinNumberInMachine(oneDollar.getCoinInitialNumberInMachine());

                    lblNumOfTwoDollarInMachine.setText(Integer.toString(twoDollar.getCoinInitialNumberInMachine()));
                    twoDollar.setCoinNumberInMachine(twoDollar.getCoinInitialNumberInMachine());

                    cbCandy.setSelected(false);
                    inventory.enterItem(candy , candy.getInitialAmountOfItem());
                    lblCandyInventory.setText(Integer.toString(candy.getItemNumber()));
                    tbCandyWant.setText("1");

                    cbSnack.setSelected(false);
                    inventory.enterItem(snack , snack.getInitialAmountOfItem());
                    lblSnackInventory.setText(Integer.toString(snack.getItemNumber()));
                    tbSnackWant.setText("1");

                    cbNuts.setSelected(false);
                    inventory.enterItem(nuts , nuts.getInitialAmountOfItem());
                    lblNutsInventory.setText(Integer.toString(nuts.getItemNumber()));
                    tbNutsWant.setText("1");

                    cbCoke.setSelected(false);
                    inventory.enterItem(coke , coke.getInitialAmountOfItem());
                    lblCokeInventory.setText(Integer.toString(coke.getItemNumber()));
                    tbCokeWant.setText("1");

                    cbPepsi.setSelected(false);
                    inventory.enterItem(pepsi , pepsi.getInitialAmountOfItem());
                    lblPepsiInventory.setText(Integer.toString(pepsi.getItemNumber()));
                    tbPepsiWant.setText("1");

                    cbSoda.setSelected(false);
                    inventory.enterItem(soda , soda.getInitialAmountOfItem());
                    lblSodaInventory.setText(Integer.toString(soda.getItemNumber()));
                    tbSodaWant.setText("1");

                    sumPrice = 0 ;
                    lblSumPrice.setText("0");
                    lblSumInsertedCents.setText("0");
                }
            }
        });

        //effect of Bill Button to show SumOfItemsPrice & SumOfInsertedCents & ChangePrice
        payButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    bill.pay(sumPrice,sumInsertedCents);
                    GetMyChangeButton.setEnabled(true);
                    lblEnteredCentsForBill.setText(Integer.toString(sumInsertedCents));
                    lblItemsPriceForBill.setText(Integer.toString(sumPrice));
                    lblChangeForBill.setText(Integer.toString(Bill.getChange()));
                }
                catch (NotSufficientPaidException nse) {
                    System.out.println(nse.getMessage());
                    JOptionPane.showMessageDialog(null, nse.getMessage(), "Not Sufficient Paid Exception: ", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        /////////effect of Get change Button////////
        GetMyChangeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    checkChange(bill.getChange());
                    JOptionPane.showMessageDialog(null , "Done , Check number of Coins in Machine which corresponding to your change");
                }
                catch (NoChangeAvailableException ncae){
                    System.out.println(ncae.getMessage());
                    JOptionPane.showMessageDialog(null, ncae.getMessage() , "Not Sufficient Paid Exception: " , JOptionPane.INFORMATION_MESSAGE);
                    int YesOrNo = JOptionPane.showConfirmDialog(null,"Do You Want To Cancel Order ?","Cancel Order", JOptionPane.YES_NO_OPTION);
                    if(YesOrNo == 0)
                    {
                        reFund();
                        lblSumInsertedCents.setText("0");
                    }

                }
            }
        });

    }
    ////initiate Panel ////
        public static void main(String[] args){

            JFrame myJFrame = new JFrame("VendingMachine");
            myJFrame.setContentPane(new machine().panelMain);
            myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            myJFrame.pack();
            myJFrame.setVisible(true);
        }

        public static void reFund(){
            Bill.setSumOfInsertedCents(0);
        }

        public void addCoin(Coin coin){
            coin.setCoinNumberInMachine(coin.getCoinNumberInMachine()+1);
        }

        public void removeCoin(Coin coin , int numberOfCoins){
            coin.setCoinNumberInMachine(coin.getCoinNumberInMachine() - numberOfCoins);
        }

        public void compareBetAmountOfReqItemsAndInvItems(Item item , int requiredItems) throws SoldOutException{
            if(requiredItems > item.getInitialAmountOfItem()){
                throw new SoldOutException("The amount of " + item.getItemName() + " in Inventory Not Sufficient Please reduce Your request Or cancel request");
            }
            else
            {
                inventory.enterItem(item , item.getInitialAmountOfItem());
                inventory.removeItem(item , requiredItems);
                System.out.println(item.getItemNumber());
            }
        }

        public void checkAmountInInventory(Item item ,  int requiredItems){

            try {
                compareBetAmountOfReqItemsAndInvItems(item , requiredItems);
                lblSumPrice.setText(Integer.toString(sumPrice));
            }
            catch (SoldOutException soe){
                System.out.println(soe.getMessage());
                JOptionPane.showMessageDialog(null, soe.getMessage() , "Sold Out Exception: " , JOptionPane.INFORMATION_MESSAGE);
            }
        }

        public void checkChange(int requiredChange) throws NoChangeAvailableException{

            while ( requiredChange > 0) {

                if ( (requiredChange - twoDollar.getCoinValue() >= 0 ) && (twoDollar.getCoinNumberInMachine() > 0)) {
                    if (requiredChange > (Integer.parseInt(lblNumOfTwoDollarInMachine.getText())*twoDollar.getCoinValue() )){
                        removeCoin(twoDollar , 1);
                        requiredChange -= twoDollar.getCoinValue();
                        continue;
                    }
                    removeCoin(twoDollar , 1);
                    requiredChange -= twoDollar.getCoinValue();
                    lblNumOfTwoDollarInMachine.setText(Integer.toString(twoDollar.getCoinNumberInMachine()));
                    lblChangeForBill.setText(Integer.toString(requiredChange));
                    continue;
                }
                 else if( (requiredChange - oneDollar.getCoinValue() >= 0) && (oneDollar.getCoinNumberInMachine() > 0)){
                     if (requiredChange > (Integer.parseInt(lblNumOfOneDollarInMachine.getText())*oneDollar.getCoinValue() )){
                         removeCoin(oneDollar , 1);
                         requiredChange -= oneDollar.getCoinValue();
                         continue;
                     }
                    removeCoin(oneDollar , 1);
                    requiredChange -= oneDollar.getCoinValue();
                    lblNumOfOneDollarInMachine.setText(Integer.toString(oneDollar.getCoinNumberInMachine()));
                    lblChangeForBill.setText(Integer.toString(requiredChange));
                    continue;
                 }
                 else if( (requiredChange - halfDollar.getCoinValue() >=0) && (halfDollar.getCoinNumberInMachine() > 0)){
                     if (requiredChange > (Integer.parseInt(lblNumOfHalfDollarInMachine.getText())*halfDollar.getCoinValue() )){
                         removeCoin(halfDollar , 1);
                         requiredChange -= halfDollar.getCoinValue();
                         continue;
                     }
                    removeCoin(halfDollar , 1);
                    requiredChange -= halfDollar.getCoinValue();
                    lblNumOfHalfDollarInMachine.setText(Integer.toString(halfDollar.getCoinNumberInMachine()));
                    lblChangeForBill.setText(Integer.toString(requiredChange));
                    continue;
                 }
                 else if( (requiredChange - quarter.getCoinValue() >=0)&& (quarter.getCoinNumberInMachine() > 0)){
                     if (requiredChange >(Integer.parseInt(lblNumOfQuarterInMachine.getText())*quarter.getCoinValue() )){
                         removeCoin(quarter , 1);
                         requiredChange -= quarter.getCoinValue();
                         continue;
                     }
                    removeCoin(quarter , 1);
                    requiredChange -= quarter.getCoinValue();
                    lblNumOfQuarterInMachine.setText(Integer.toString(quarter.getCoinNumberInMachine()));
                    lblChangeForBill.setText(Integer.toString(requiredChange));
                    continue;
                 }
                 else if( (requiredChange - dime.getCoinValue() >=0) && (dime.getCoinNumberInMachine() > 0)){
                     if (requiredChange > (Integer.parseInt(lblNumOfDimeInMachine.getText())*dime.getCoinValue()) ){
                         removeCoin(dime , 1);
                         requiredChange -= dime.getCoinValue();
                         continue;
                     }
                     else
                    removeCoin(dime , 1);
                    requiredChange -= dime.getCoinValue();
                    lblNumOfDimeInMachine.setText(Integer.toString(dime.getCoinNumberInMachine()));
                    lblChangeForBill.setText(Integer.toString(requiredChange));
                    continue;
                 }
                 else if(((requiredChange - nickel.getCoinValue()) >= 0) && (nickel.getCoinNumberInMachine() > 0)){
                     if (requiredChange > (Integer.parseInt(lblNumOfNickelInMachine.getText())*nickel.getCoinValue()))
                     {
                         removeCoin(nickel , 1);
                         requiredChange -= nickel.getCoinValue();
                         continue;
                     }

                     removeCoin(nickel , 1);
                     requiredChange -= nickel.getCoinValue();
                     lblNumOfNickelInMachine.setText(Integer.toString(nickel.getCoinNumberInMachine()));
                     lblChangeForBill.setText(Integer.toString(requiredChange));
                     continue;
                 }
                 else if( (requiredChange - penny.getCoinValue() >=0)&& (penny.getCoinNumberInMachine() > 0)){

                    if(requiredChange > (Integer.parseInt(lblNumOfPennyInMachine.getText())*penny.getCoinValue()))
                    {
                        removeCoin(penny , 1);
                        requiredChange -= penny.getCoinValue();
                        continue;
                    }
                    else {
                    removeCoin(penny , 1);
                    requiredChange -= penny.getCoinValue();
                    lblNumOfPennyInMachine.setText(Integer.toString(penny.getCoinNumberInMachine()));
                    lblChangeForBill.setText(Integer.toString(requiredChange));
                    continue;
                    }
                 }
                else {
                    throw new NoChangeAvailableException("No Complete Change Available :) ");
                }
            }
        }

}



