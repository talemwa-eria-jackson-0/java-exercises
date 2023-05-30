/*
 * putting constructors with parameters into practice
 * putting class constants into practice
 * hiding and visibility modifiers into practice
 * 
 * This program will integrate with DeductionWithFee.java program to perform
 */

class AccountVer3 {
    private String name;            //name of account holder
    private double balance;         //balance in account
    private static final double fee = 0.8;     //fee to be deducted everytime a withdrawal is made. It is a class constant

    //constructor
    public AccountVer3(String cusName, double accountBalance) {
        name = cusName;
        balance = accountBalance;
    }

    //returns name
    public String getName() {
        return name;
    }
    //returns balance
    public double getBalance() {
        return balance;
    }

    //making a deposit
    public void deposit(double depositAmt) {
        balance = balance + depositAmt;
    }
    //making a withdrawal
    public void withdrawal(double withdrawalAmt) {
        balance = balance - withdrawalAmt - fee;
    }
}
