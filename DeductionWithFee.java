/*
 * we shall set name and balance by calling class AccountVer3 and its object
 * we shall call withdrawal method from AccountVer3, 3 times and we see how program reacts
 */

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

class DeductionWithFee {
    public static void main(String[] args) {
        //calling class AccountVer3 and its object
        AccountVer3 accountVer3 = new AccountVer3("Cyber Venom", 500.0);

        // making withdrawals
        accountVer3.withdrawal(50);             //first withdrawal
        accountVer3.withdrawal(50);             //second withdrawal
        accountVer3.withdrawal(50);             //third withdrawal

        //configring number of decimal places
        DecimalFormat dformat = new DecimalFormat("0.00");

        //displaying info
        JOptionPane.showMessageDialog(
            null, 
            "Name of account holder:\t" + accountVer3.getName() +
            "\nHolder's account balance:\t" + dformat.format(accountVer3.getBalance())
        );
    }
}
