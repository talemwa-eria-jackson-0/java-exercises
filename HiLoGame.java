import javax.swing.JOptionPane;

class HiLoGame {
    private static double realNumber = Math.floor(Math.random() * 100) + 1;
    private static int selection;
    public static void main(String[] args) {
        HiLoGame.programDescripion();
        HiLoGame.response();
        HiLoGame.guess();
    }

//method to describe the program
public static void programDescripion() {
    JOptionPane.showMessageDialog(
    null,
    "THis is a high or low program which allows a user to guess a number\nbetween 1 and 100 in a maximum of 6 times."
    );
}

public static int response() {
    //getting user's response about playing he game
    selection = JOptionPane.showConfirmDialog(
        null, 
        "Wanna try out the game??",
        "Confirmation box",
        JOptionPane.YES_NO_OPTION
    );
    return selection;
}

//checking if the guesses are right
public static void guess() {
    if (selection == JOptionPane.YES_OPTION) {
        for (int guessTimes = 1; guessTimes <= 6; guessTimes++) {
            double guessNumber = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter yor guess"));
        if (guessNumber == realNumber) {
            JOptionPane.showMessageDialog(null,"CONGS, your guess is right");
            break;
        } else if (guessNumber > realNumber) {
            JOptionPane.showMessageDialog(null,"OOPS!!, your guess is high");
        } else if (guessNumber < realNumber) {
            JOptionPane.showMessageDialog(null,"OOPS!!, your guess is low");
        }
    
        if (guessTimes == 6)
            JOptionPane.showMessageDialog(null,"YOU HAVE REACHED THE MAX NUMBER OF GUESS TIMES\nProgram shutting down........");
        }

        HiLoGame.response();
        if (selection == JOptionPane.YES_OPTION)
            HiLoGame.guess();

    }
}
}
