/*
This java class works with the Bicycle class to give outputs of the BicycleAndJava class
*/

class Account {
    private String ownerName;
    private double balance;
    
    //constructor
    public Account() {
        ownerName = "unassigned";
        balance = 0.0;
    }
    
    // adding money to account 
    public void add(double amt) {
        balance =+ amt;
    }

    // deduct money from account
    public void deduct(double amt) {
        balance =- amt;
    }

    //setting initial balance
    public void setInitialBalance(double amt) {
        balance = amt;
    }

    //getting current balance
    public double getCurrentBalance() {
        return balance;
    }

    //getting owner name
    public String getOwnerName(String name) {
        ownerName = name;
        return ownerName;
    }
}
