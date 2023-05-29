/*
 * Coffe outlet is a shop that sells coffee online but it packages it for its customers
 * Each bag of coffe is $5.5 dollars
 * They pack coffee in large, medium and small boes which carry 20, 10, and 5 bags of coffee respectively
 * The large, medium and small bags cost $1.8, $3 and $0.6 respectively
 * So the program calculates how much he customer spends when buying a certain number of coffee bags 
 * And in how many boxes are the coffee bags packed
 */

 import javax.swing.*;
 import java.util.*;
 import java.text.*;


class CoffeeOutlet {
    public static void main(String[] args) {
        //declaring variables
        double bags, largeBoxNumber, mediumBoxNumber, smallBoxNumber;
        double amount;
        String inputString;

        //initializing variables
        double bagPrice = 5.5;

        int largeBoxSize = 20;
        int mediumBoxSize = 10;
        int smallBoxSize = 5;

        double largeBoxPrice = 1.8;
        double mediumBoxPrice = 1;
        double smallBoxPrice = 0.6;

        //configuring decimal places
        DecimalFormat dFormat = new DecimalFormat("0.00");

        //configuring JFrame window
        JFrame myFrame = new JFrame();
        myFrame.setSize(400, 300);
        myFrame.setLocation(200, 200);
        myFrame.setVisible(true);

        //configuring the date
        Date today = new Date();
        SimpleDateFormat sDateFormat = new SimpleDateFormat("MMMM dd, yyyy");
        

        //getting input
        inputString = JOptionPane.showInputDialog(myFrame, "How many bags are you taking?");
        bags = Integer.parseInt(inputString);

        //calculating
        //amount
        amount = bags * bagPrice;

        //boxes used
        // JOptionPane.showMessageDialog(myFrame, 12%1);
        if (bags == 20) {
            largeBoxNumber = 1;
            mediumBoxNumber = 0;
            smallBoxNumber = 0;

            double largeBoxTotalPrice = largeBoxNumber * largeBoxPrice;
            double mediumBoxTotalPrice = mediumBoxNumber * mediumBoxPrice;
            double smallBoxTotalPrice = smallBoxNumber * smallBoxPrice;

            double totalCost = amount + largeBoxTotalPrice + mediumBoxTotalPrice + smallBoxTotalPrice;

            JOptionPane.showMessageDialog(
                myFrame,
                "Number of bags ordered:\t" + dFormat.format(bags) + " -> $" + dFormat.format(amount) +
                "\n\nBoxes used:\n" + 
                dFormat.format(largeBoxNumber) + " large boxes" + " -> " + dFormat.format(largeBoxTotalPrice) + "\n" +  
                dFormat.format(mediumBoxNumber) + " medium boxes" + " -> " + dFormat.format(mediumBoxTotalPrice) + "\n" +
                dFormat.format(smallBoxNumber) + " small boxes" + " -> " + dFormat.format(smallBoxTotalPrice) + "\n" +
                "\nYour total cost is $" + dFormat.format(totalCost) +
                "\n\nDate of order:\t" + sDateFormat.format(today)
            );

            myFrame.setVisible(false);

        }
        if (bags > 20) {
            largeBoxNumber = (Math.floor(bags / 20));
            if (bags%20 > 5 && bags%20 <= 10){
                mediumBoxNumber = 1;
                smallBoxNumber = 0;

                double largeBoxTotalPrice = largeBoxNumber * largeBoxPrice;
                double mediumBoxTotalPrice = mediumBoxNumber * mediumBoxPrice;
                double smallBoxTotalPrice = smallBoxNumber * smallBoxPrice;
    
                double totalCost = amount + largeBoxTotalPrice + mediumBoxTotalPrice + smallBoxTotalPrice;
    
                JOptionPane.showMessageDialog(
                    myFrame,
                    "Number of bags ordered:\t" + dFormat.format(bags) + " -> $" + dFormat.format(amount) +
                    "\n\nBoxes used:\n" + 
                    dFormat.format(largeBoxNumber) + " large boxes" + " -> " + dFormat.format(largeBoxTotalPrice) + "\n" +  
                    dFormat.format(mediumBoxNumber) + " medium boxes" + " -> " + dFormat.format(mediumBoxTotalPrice) + "\n" +
                    dFormat.format(smallBoxNumber) + " small boxes" + " -> " + dFormat.format(smallBoxTotalPrice) + "\n" +
                    "\nYour total cost is $" + dFormat.format(totalCost) +
                    "\n\nDate of order:\t" + sDateFormat.format(today)
                );
    
                myFrame.setVisible(false);

            } else if (bags%20 > 10 && bags%20 < 15 ){
                mediumBoxNumber = 1;
                smallBoxNumber = 1;

                double largeBoxTotalPrice = largeBoxNumber * largeBoxPrice;
                double mediumBoxTotalPrice = mediumBoxNumber * mediumBoxPrice;
                double smallBoxTotalPrice = smallBoxNumber * smallBoxPrice;
    
                double totalCost = amount + largeBoxTotalPrice + mediumBoxTotalPrice + smallBoxTotalPrice;
    
                JOptionPane.showMessageDialog(
                    myFrame,
                    "Number of bags ordered:\t" + dFormat.format(bags) + " -> $" + dFormat.format(amount) +
                    "\n\nBoxes used:\n" + 
                    dFormat.format(largeBoxNumber) + " large boxes" + " -> " + dFormat.format(largeBoxTotalPrice) + "\n" +  
                    dFormat.format(mediumBoxNumber) + " medium boxes" + " -> " + dFormat.format(mediumBoxTotalPrice) + "\n" +
                    dFormat.format(smallBoxNumber) + " small boxes" + " -> " + dFormat.format(smallBoxTotalPrice) + "\n" +
                    "\nYour total cost is $" + dFormat.format(totalCost) +
                    "\n\nDate of order:\t" + sDateFormat.format(today)
                );
    
                myFrame.setVisible(false);


            } else if (bags%20 >=15) {
                mediumBoxNumber = 2;
                smallBoxNumber = 0;

                double largeBoxTotalPrice = largeBoxNumber * largeBoxPrice;
                double mediumBoxTotalPrice = mediumBoxNumber * mediumBoxPrice;
                double smallBoxTotalPrice = smallBoxNumber * smallBoxPrice;
    
                double totalCost = amount + largeBoxTotalPrice + mediumBoxTotalPrice + smallBoxTotalPrice;
    
                JOptionPane.showMessageDialog(
                    myFrame,
                    "Number of bags ordered:\t" + dFormat.format(bags) + " -> $" + dFormat.format(amount) +
                    "\n\nBoxes used:\n" + 
                    dFormat.format(largeBoxNumber) + " large boxes" + " -> " + dFormat.format(largeBoxTotalPrice) + "\n" +  
                    dFormat.format(mediumBoxNumber) + " medium boxes" + " -> " + dFormat.format(mediumBoxTotalPrice) + "\n" +
                    dFormat.format(smallBoxNumber) + " small boxes" + " -> " + dFormat.format(smallBoxTotalPrice) + "\n" +
                    "\nYour total cost is $" + dFormat.format(totalCost) +
                    "\n\nDate of order:\t" + sDateFormat.format(today)
                );
    
                myFrame.setVisible(false);

            }
        } else if (bags < 20) {
            if (bags < 5) {
                largeBoxNumber = 0;
                mediumBoxNumber = 0;
                smallBoxNumber = 1;

                double largeBoxTotalPrice = largeBoxNumber * largeBoxPrice;
                double mediumBoxTotalPrice = mediumBoxNumber * mediumBoxPrice;
                double smallBoxTotalPrice = smallBoxNumber * smallBoxPrice;
    
                double totalCost = amount + largeBoxTotalPrice + mediumBoxTotalPrice + smallBoxTotalPrice;
    
                JOptionPane.showMessageDialog(
                    myFrame,
                    "Number of bags ordered:\t" + dFormat.format(bags) + " -> $" + dFormat.format(amount) +
                    "\n\nBoxes used:\n" + 
                    dFormat.format(largeBoxNumber) + " large boxes" + " -> " + dFormat.format(largeBoxTotalPrice) + "\n" +  
                    dFormat.format(mediumBoxNumber) + " medium boxes" + " -> " + dFormat.format(mediumBoxTotalPrice) + "\n" +
                    dFormat.format(smallBoxNumber) + " small boxes" + " -> " + dFormat.format(smallBoxTotalPrice) + "\n" +
                    "\nYour total cost is $" + dFormat.format(totalCost) +
                    "\n\nDate of order:\t" + sDateFormat.format(today)
                );
    
                myFrame.setVisible(false);

            } else if (bags > 5 && bags <= 10) {
                largeBoxNumber = 0;
                mediumBoxNumber = 1;
                smallBoxNumber = 0;

                double largeBoxTotalPrice = largeBoxNumber * largeBoxPrice;
                double mediumBoxTotalPrice = mediumBoxNumber * mediumBoxPrice;
                double smallBoxTotalPrice = smallBoxNumber * smallBoxPrice;
    
                double totalCost = amount + largeBoxTotalPrice + mediumBoxTotalPrice + smallBoxTotalPrice;
    
                JOptionPane.showMessageDialog(
                    myFrame,
                    "Number of bags ordered:\t" + dFormat.format(bags) + " -> $" + dFormat.format(amount) +
                    "\n\nBoxes used:\n" + 
                    dFormat.format(largeBoxNumber) + " large boxes" + " -> " + dFormat.format(largeBoxTotalPrice) + "\n" +  
                    dFormat.format(mediumBoxNumber) + " medium boxes" + " -> " + dFormat.format(mediumBoxTotalPrice) + "\n" +
                    dFormat.format(smallBoxNumber) + " small boxes" + " -> " + dFormat.format(smallBoxTotalPrice) + "\n" +
                    "\nYour total cost is $" + dFormat.format(totalCost) +
                    "\n\nDate of order:\t" + sDateFormat.format(today)
                );
    
                myFrame.setVisible(false);

            } else if (bags > 10 && bags <= 15) {
                largeBoxNumber = 0;
                mediumBoxNumber = 1;
                smallBoxNumber = 1;

                double largeBoxTotalPrice = largeBoxNumber * largeBoxPrice;
                double mediumBoxTotalPrice = mediumBoxNumber * mediumBoxPrice;
                double smallBoxTotalPrice = smallBoxNumber * smallBoxPrice;
    
                double totalCost = amount + largeBoxTotalPrice + mediumBoxTotalPrice + smallBoxTotalPrice;
    
                JOptionPane.showMessageDialog(
                    myFrame,
                    "Number of bags ordered:\t" + dFormat.format(bags) + " -> $" + dFormat.format(amount) +
                    "\n\nBoxes used:\n" + 
                    dFormat.format(largeBoxNumber) + " large boxes" + " -> " + dFormat.format(largeBoxTotalPrice) + "\n" +  
                    dFormat.format(mediumBoxNumber) + " medium boxes" + " -> " + dFormat.format(mediumBoxTotalPrice) + "\n" +
                    dFormat.format(smallBoxNumber) + " small boxes" + " -> " + dFormat.format(smallBoxTotalPrice) + "\n" +
                    "\nYour total cost is $" + dFormat.format(totalCost) +
                    "\n\nDate of order:\t" + sDateFormat.format(today)
                );
    
                myFrame.setVisible(false);

            } else if (bags >= 15) {
                largeBoxNumber = 0;
                mediumBoxNumber = 2;
                smallBoxNumber = 0;

                double largeBoxTotalPrice = largeBoxNumber * largeBoxPrice;
                double mediumBoxTotalPrice = mediumBoxNumber * mediumBoxPrice;
                double smallBoxTotalPrice = smallBoxNumber * smallBoxPrice;
    
                double totalCost = amount + largeBoxTotalPrice + mediumBoxTotalPrice + smallBoxTotalPrice;
    
                JOptionPane.showMessageDialog(
                    myFrame,
                    "Number of bags ordered:\t" + dFormat.format(bags) + " -> $" + dFormat.format(amount) +
                    "\n\nBoxes used:\n" + 
                    dFormat.format(largeBoxNumber) + " large boxes" + " -> " + dFormat.format(largeBoxTotalPrice) + "\n" +  
                    dFormat.format(mediumBoxNumber) + " medium boxes" + " -> " + dFormat.format(mediumBoxTotalPrice) + "\n" +
                    dFormat.format(smallBoxNumber) + " small boxes" + " -> " + dFormat.format(smallBoxTotalPrice) + "\n" +
                    "\nYour total cost is $" + dFormat.format(totalCost) +
                    "\n\nDate of order:\t" + sDateFormat.format(today)
                );
    
                myFrame.setVisible(false);

            }
        }

        // JOptionPane.showMessageDialog(
        //     myFrame,
        //     "Number of bags ordered:\t" + dFormat.format(bags) + " -> $" + dFormat.format(amount) +
        //     "\n\nBoxes used:" + 
        //     "\t" + dFormat.format(largeBoxNumber) + " large boxes" +
        //     "\t" + dFormat.format(mediumBoxNumber) + " medium boxes" +
        //     "\t" + dFormat.format(smallBoxNumber) + " small boxes" 
        // );
    }
}
