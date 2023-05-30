/*
 * WE gonna roll a dice 3 times basing on the Dice.java program
 * And we see which values we obtain
 */

import javax.swing.JOptionPane;

class RollDice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        Dice dice3 = new Dice();

        //rolling the dice
        dice.Roll();
        dice1.Roll();
        dice2.Roll();
        dice3.Roll();

        //displaying random numbers
        JOptionPane.showMessageDialog(
            null,
            "Dice was rolled 4 times and obtained the following reselts::" +
            "\nResult 1:\t\t\t\t" + dice.getRandomNumber() +
            "\nResult 2:\t\t\t\t" + dice1.getRandomNumber() +
            "\nResult 3:\t\t\t\t" + dice2.getRandomNumber() +
            "\nResult 4:\t\t\t\t" + dice3.getRandomNumber() 
        );
    }
}
