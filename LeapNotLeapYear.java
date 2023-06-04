/*
 * program to determine whether a year is leap or not leap
 * year is leap if it is divisable by 4 but no by 100
 * year divisible by both 4 and 100 is leap if it is also divisible by  00
 */

import javax.swing.JOptionPane;

class LeapNotLeapYear {
    public static void main(String[] args) {
        int year;
        String str;

        // getting input
        str = JOptionPane.showInputDialog(null, "Enter year in integers");
        year = Integer.parseInt(str);

        //selecting year if it is leap or not
        if (year % 4 == 0 && year % 100 != 0) {
            JOptionPane.showMessageDialog(null, year + " is a leap year");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            JOptionPane.showMessageDialog(null, year + " is a leap year");
        } else {
            JOptionPane.showMessageDialog(null, year + " is not a leap year");
        }
    }
}
