/*
 * program to demonstrate the confirmation bo method of he JOptionPane class
 */

import javax.swing.JOptionPane;

class usingConfirmationBox {
    public static void main(String[] args) {
        int selection = JOptionPane.showConfirmDialog(
            null,
            "Are you a minor?",
            "Age confirmation",
            JOptionPane.YES_NO_OPTION
        );
        if (selection == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Go to theatre 3");
        } else {
            JOptionPane.showMessageDialog(null, "Go to theatre 8");
        }
    }
}
