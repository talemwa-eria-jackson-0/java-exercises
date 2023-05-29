/*
 * program to find values of a quadratic equation
 */

import java.text.DecimalFormat;

import javax.swing.*;

class QuadraticEquation {
    public static void main(String[] args) {
        //declaring variables
        double a, b, c, x1, x2;
        String inputStr;

        //configuring decimal places
        DecimalFormat dFormat = new DecimalFormat("0.00");

        //getting constant inputs of a, b, and c
        inputStr = JOptionPane.showInputDialog(null, "Enter value of a:");
        a = Double.parseDouble(inputStr);

        inputStr = JOptionPane.showInputDialog(null, "Enter value of b:");
        b = Double.parseDouble(inputStr);

        inputStr = JOptionPane.showInputDialog(null, "Enter value of c:");
        c = Double.parseDouble(inputStr);

        //calculating the values of x
        x1 = -b + Math.sqrt(Math.pow(b,2) - (4 * a * c)) / 2 * a;
        x2 = -b - Math.sqrt(Math.pow(b,2) - (4 * a * c)) / 2 * a;

        //displaying values of x
        JOptionPane.showMessageDialog(null, "Values of x are x1 = " + dFormat.format(x1) + ", x2 = " + dFormat.format(x2));
        // JOptionPane.showMessageDialog(null, x1);

    }
}
