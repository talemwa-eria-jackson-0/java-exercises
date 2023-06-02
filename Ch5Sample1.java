/*
 * Program works with Ch5Circle.java 
 */

import javax.swing.*;

class Ch5Sample1 {
    public static void main(String[] args) {
        //data members
        double area, circumference, radius;

        radius = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value of radius::"));
    
        //calling the Ch5Circle class
        Ch5Circle circle = new Ch5Circle(radius);
    
        if (circle.isRadiusValid()) {
            circumference = circle.getCircumference();
            area = circle.getArea();

            System.out.print("Input radius:\t" + radius +
            "\nCircumference:\t" + circumference +
            "\nArea:\t" + area);
        } else {
            System.out.println("Invalid value of radius entered");
        }
        
    }
}
