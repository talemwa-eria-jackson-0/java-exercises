/*
 * Program puts random ino exercise by using a dice
 */

class Dice {
    private static final int MAX_NUMBER = 6;        //max number on a die
    private static final int MIN_NUMBER = 1;        //min number on a s dice
    private static final int NO_NUMBER = 0;
    private int randomNumber;

    public Dice() {
        randomNumber = NO_NUMBER;
    }

    //obtaining random number
    public void Roll() {
        randomNumber = (int)( (Math.random() * (MAX_NUMBER)) + 1); 
    }

    //results the random number
    public int getRandomNumber() {
        return randomNumber;
    }
}
