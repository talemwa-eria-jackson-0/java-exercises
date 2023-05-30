/*
 * this class works with LotteryCard.java to display the winning combination of the lottery
 * the lottery card will be spinned 4 times and at each time, we shall obtain the winning combination
 */

import javax.swing.JOptionPane;

class LotteryWinner {
    public static void main(String[] args) {
        LotteryCard lotteryCard1 = new LotteryCard();
        LotteryCard lotteryCard2 = new LotteryCard();
        LotteryCard lotteryCard3 = new LotteryCard();
        LotteryCard lotteryCard4 = new LotteryCard();

        //spinning the lottery cards
        lotteryCard1.spin();
        lotteryCard2.spin();
        lotteryCard3.spin();
        lotteryCard4.spin();

        //displaying winning combinations
        JOptionPane.showMessageDialog(
            null, 
            "Lottery card was spinned 4 times and the following were the winning combinations:" +
            "1 - Black; 2 - Red; 3 - Yellow;" +
            "\nWinning combination 1:  \t" + "\nNumber:    " + lotteryCard1.getRandomNumber() + "\nColor (Black => 1, Red => 2, Yellow => 3):    " + lotteryCard1.getRandomColor() + "\nCombination::==>    " + lotteryCard1.getRandomNumber() + "," + lotteryCard1.getRandomColor() +
            "\n\nWinning combination 2:  \t" + "\nNumber:    " + lotteryCard2.getRandomNumber() + "\nColor (Black => 1, Red => 2, Yellow => 3):    " + lotteryCard2.getRandomColor() + "\nCombination::==>    " + lotteryCard2.getRandomNumber() + "," + lotteryCard2.getRandomColor() +
            "\n\nWinning combination 3:  \t" + "\nNumber:    " + lotteryCard3.getRandomNumber() + "\nColor (Black => 1, Red => 2, Yellow => 3):    " + lotteryCard3.getRandomColor() + "\nCombination::==>    " + lotteryCard3.getRandomNumber() + "," + lotteryCard3.getRandomColor()
        );
    }
}
