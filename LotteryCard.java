/*
 * making a lottery card for students to compete through
 * program will output the winning combination of the lottery
 * students have to guess the combination of the number and the color, 
 * numbers range from 10 to 15 and colors are black-1, red-2, yellow-3
 * 
 * This program will work with LotteryWinner.java to get the winning combination
 */

class LotteryCard {
    private static final int MAX_NUMBER = 15;           //maximum lottery number
    private static final int MIN_NUMBER = 10;           //minimum lottery number
    private static final int NO_NUMBER = 0;           //zero lottery number

    private static final int MAX_COLOR = 3;           //number for yellow
    private static final int MIN_COLOR = 1;           //number for black
    private static final int NO_COLOR = 0;           //number for no color

    private int randomNumber;
    private int randomColor;

    //constructor
    public LotteryCard() {
        randomNumber = NO_NUMBER;
        randomColor = NO_COLOR;
    }

    //spinning the card to get random values
    public void spin() {
        randomColor = (int)( (Math.random() * (MAX_COLOR - MIN_COLOR + 1) + MIN_COLOR));
        randomNumber = (int)( (Math.random() * (MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER ));
    }

    //returning number on the card
    public int getRandomNumber() {
        return randomNumber;
    }

    //returning color on the card
    public int getRandomColor() {
        return randomColor;
    }
}