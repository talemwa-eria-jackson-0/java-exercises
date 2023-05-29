
import javax.swing.*;


class FibonacciSequence {
    public static void main(String[] args) {
        //declaring variables
        int months;
        String inputString;
        double rabbits;

        //obtaining inputs
        inputString = JOptionPane.showInputDialog(null, "Enter number of months");
        months = Integer.parseInt(inputString);

        //calculating number of rabbits
        rabbits = (1 / Math.sqrt(5)) * (Math.pow( ((1 + Math.sqrt(5)) / 2) ,months) - (Math.pow( ((1 - Math.sqrt(5)) / 2) ,months)));

        //displaying number of rabbits
        JOptionPane.showMessageDialog(null, "Answer is " + rabbits + " rabbits");
    }
    
}
