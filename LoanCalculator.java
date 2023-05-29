/*
 * A loan calculator program that computes both monthly and total 
 * payments for a given loan amount, annual interest rate and loan period
 */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

class LoanCalculator {
    public static void main(String[] args) {
        //declaring variables
        double loanAmount, annualIntrestRate, monthlyIntrestRate, monthlyPayment, totalPayment;
        int loanPeriod;
        String inputStr;

        //configuring number of decimal places
        DecimalFormat dFormat = new DecimalFormat("0.0000");

        //getting inputs
        inputStr = JOptionPane.showInputDialog(null, "Enter loan amount:");
        loanAmount = Double.parseDouble(inputStr);

        inputStr = JOptionPane.showInputDialog(null, "Enter Annual intrest rate (out of 100):");
        annualIntrestRate = Double.parseDouble(inputStr);
        monthlyIntrestRate = (annualIntrestRate/100) / 12.0;

        inputStr = JOptionPane.showInputDialog(null, "Enter loan period (in years):");
        loanPeriod = Integer.parseInt(inputStr);
        loanPeriod = loanPeriod * 12;

        //calculating monthly and total payment
        monthlyPayment = (loanAmount * monthlyIntrestRate) / (1 - Math.pow((1 / (1 + monthlyIntrestRate)), loanPeriod));
        totalPayment = monthlyPayment * loanPeriod;

        //outputting monthly and total payments
        JOptionPane.showMessageDialog(
            null,
            "Your loan amount::\t $" + dFormat.format(loanAmount) +
            "\nYour loan period::\t " + dFormat.format(loanPeriod) + " months" +
            "\nYour annual interest rate::\t" + dFormat.format(annualIntrestRate) + "%" + 
            "\n\nYour monthly amount::\t $" + dFormat.format(monthlyPayment) +
            "\nYour total amount::\t $" + dFormat.format(totalPayment)
        );
    }
}
