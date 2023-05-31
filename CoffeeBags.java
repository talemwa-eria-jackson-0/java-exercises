/*
 * program enables the user to enter information about the coffee bags they are willing to buy
 * and the program outputs the overall total price for them to pay
 * program works with PriceOfCoffeebags.java
 */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

class CoffeeBags {
    // controlling the number of decimal places 
    DecimalFormat dFormat = new DecimalFormat("0.00");

    //initializing variables
    private static final double PRICE_PER_KG = 5.99;     //constant
    private static final double TAX_RATE = 7.25;            //tax to be added on the price
    private static final double WEIGHT_PER_BAG = 5;

    double totalBagWeight, numberOfBags, taxRate;
    double totalPrice, totalPriceWithtax;
    String inpuString;

    public CoffeeBags() {}                                  //constructor

    //getting input from the user
    public void getInput() {
        inpuString = JOptionPane.showInputDialog(null, "Enter number of bags:");
        numberOfBags = Double.parseDouble(inpuString);
    }

    //calculating values
    public void computeResults() {
        totalBagWeight = numberOfBags * WEIGHT_PER_BAG;
        totalPrice = totalBagWeight * PRICE_PER_KG;

        taxRate = TAX_RATE / 100;
        totalPriceWithtax = totalPrice + (totalPrice * taxRate );
    }

    //displaying total price and total price with tax
    public void displayResults() {
        JOptionPane.showMessageDialog(
            null,
            "Number of bags bought:              " + dFormat.format(numberOfBags) + "\n" +
            "Weight per bag       :              " + dFormat.format(WEIGHT_PER_BAG) + " kgs" + "\n" +
            "Price per kilogram   :              " + dFormat.format(PRICE_PER_KG) + "\n" +
            "Sales Tax            :              " + dFormat.format(TAX_RATE) + "\n\n" +

            "Total price          :            $ " + dFormat.format(totalPrice) + "\n" +
            "Total price with tax :            $ " + dFormat.format(totalPriceWithtax)
        );
    }

    //method to hold all the other methods
    public void allMethods() {
        getInput();;
        computeResults();
        displayResults();
    }
}
