// class to demonstarate the working of the java.awt.Graphics class use to draw shapes 

import javax.swing.*;
import java.awt.*;

class Ch5SampleGraphics {
    public static void main(String[] args) {
        //referencing required classees
        JFrame window;
        Container contentPane;
        Graphics graphics;

        //setting up he window
        window = new JFrame("My first Rectangle");
        window.setSize(300, 200);
        window.setLocation(300, 300);
        window.setVisible(true);

        //setting up the content pane
        contentPane = window.getContentPane();
        contentPane.setBackground(Color.BLUE);

        //setting up the graphics
        graphics = contentPane.getGraphics();
        // graphics.setColor(Color.ORANGE);
        graphics.drawLine(20, 100, 120, 100);
        graphics.drawRect(50, 50, 100, 30);
    }
}