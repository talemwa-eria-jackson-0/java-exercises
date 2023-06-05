/*
 * application to compute the delivery charge basing on ype of packaging and type of service
 */

import javax.swing.*;

class DeliveryCharge {
    //class variables
    private static String str;
    private static int typeOfPackage, typeOfService;
    private static double weightOfPackage, totalPrice;

    public static void main(String[] args) {
        setInput();
        implementingLogic();
    } 

    //function for setting input
    public static void setInput() {
        //getting input using JOptionPane
        str = JOptionPane.showInputDialog(null, "Enter number for type of package.\n(1 for Letter, 2 for Box)");
        typeOfPackage = Integer.parseInt(str);

        str = JOptionPane.showInputDialog(null, "Enter number for type of service.\n(1 for NextDayPriority, 2 for NextDayStd, 3 for 2-Day)");
        typeOfService = Integer.parseInt(str);

        str = JOptionPane.showInputDialog(null, "Enter weight of the package.\n(Weight should be in kilograms kgs)");
        weightOfPackage = Double.parseDouble(str);
    }

    // implementing logic for package type letter 
    public static void implementingLogic() {
        // variables for package and service 
        String letter = "Letter";
        String box = "Box";
        String ndp = "Next Day Priority";
        String nds = "Next Day Standard";
        String twoDay = "2-Day";

        // implementing logic 
        if (typeOfPackage == 1 && typeOfService == 1){
            totalPrice = 12.0 * weightOfPackage;
            JOptionPane.showMessageDialog(
                null,
                "Type of package:      " + letter + "\n" +
                "Type of service:      " + ndp + "\n" +
                "Weight of package:    " + weightOfPackage + "\n\n" +
                "Delivery charge:      " + totalPrice + " $\n" 
            );
        } else if (typeOfPackage == 1 && typeOfService == 2) {
             totalPrice = 10.50 * weightOfPackage;
             JOptionPane.showMessageDialog(
                null,
                "Type of package:      " + letter + "\n" +
                "Type of service:      " + nds + "\n" +
                "Weight of package:    " + weightOfPackage + "\n\n" +
                "Delivery charge:      " + totalPrice + " $\n" 
            );
        } else if (typeOfPackage == 1 && typeOfService == 3) {
            JOptionPane.showMessageDialog(null, "Service is currently not available");
        } else if (typeOfPackage == 2 && typeOfService == 1) {
            double firstKgPrice = 15.75;
            double otherKgPrice = (15.75 + 1.25) * (weightOfPackage - 1);
            totalPrice = firstKgPrice + otherKgPrice;

            JOptionPane.showMessageDialog(
                null,
                "Type of package:      " + box + "\n" +
                "Type of service:      " + ndp + "\n" +
                "Weight of package:    " + weightOfPackage + "\n\n" +
                "Delivery charge:      " + totalPrice + " $\n" 
            );
        } else if (typeOfPackage == 2 && typeOfService == 2) {
            double firstKgPrice = 13.75;
            double otherKgPrice = (13.75 + 1.00) * (weightOfPackage - 1);
            totalPrice = firstKgPrice + otherKgPrice;

            JOptionPane.showMessageDialog(
                null,
                "Type of package:      " + box + "\n" +
                "Type of service:      " + nds + "\n" +
                "Weight of package:    " + weightOfPackage + "\n\n" +
                "Delivery charge:      " + totalPrice + " $\n" 
            );
    } else if (typeOfPackage == 2 && typeOfService == 3) {
        double firstKgPrice = 7.00;
        double otherKgPrice = (7.00 + 0.5) * (weightOfPackage - 1);
        totalPrice = firstKgPrice + otherKgPrice;

        JOptionPane.showMessageDialog(
            null,
            "Type of package:      " + box + "\n" +
            "Type of service:      " + twoDay + "\n" +
            "Weight of package:    " + weightOfPackage + "\n\n" +
            "Delivery charge:      " + totalPrice + " $\n" 
        );
    }
    
}
}