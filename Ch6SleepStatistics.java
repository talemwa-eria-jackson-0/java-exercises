/*
 * program to estimate the various sleeping average times for different hostels at camppus
 * program prompts the user to input their hostel name and the number of hours they sleep, users coninously add sleep hours unil 0 is entered to stop the program
 * program puts the use of while in practical
 */

import javax.swing.JOptionPane;

class Ch6SleepStatistics {
    //declaring instance variables
    int sleepingTime, count, sum;
    double sleepingAverage;


    public static void main(String[] args) {
        Ch6SleepStatistics program = new Ch6SleepStatistics();
        String hostelName = program.getHostelName();
        program.getSleepingTimes();
        double averageSleep = program.getAverageSleep();

        JOptionPane.showMessageDialog(
            null,
            "Name of Hostel          :" + hostelName + "\n" +
            "Average sleeping time   :" + averageSleep
        );
    }

    public String getHostelName() {
        String hostelName = JOptionPane.showInputDialog(null, "Name of Hostel:");
        return hostelName;
    }

    //getting sleeping times
    public void getSleepingTimes() {
        sleepingTime = Integer.parseInt(JOptionPane.showInputDialog(null, "For how many hours do you sleep.\n(Enter 0 to quit program.)"));
        count = 1;
        sum = 0;

        //looping through sleeping times until program stops
        while (sleepingTime != 0) {
            sum = sum + sleepingTime;
            count = count + 1;

            sleepingTime = Integer.parseInt(JOptionPane.showInputDialog(null, "At what ime do you sleep.\n(Enter 0 to quit program.)"));
        }
    }

    //geting average sleep
    public double getAverageSleep() {
        sleepingAverage = sum / count;
        return sleepingAverage;
    }
}
