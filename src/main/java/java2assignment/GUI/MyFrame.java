package java2assignment.GUI;

import java.awt.Color;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
    /**
     * 
     */
    Buttons play = new Buttons();
    

    public MyFrame() {
      
        

        // Create the frame
        this.setTitle("MusicPlayer");// set tittle
        // this.setSize(420, 420);// set size
        this.setBounds(0    , 0, 400, 400);
        this.setLayout(null);
        this.setVisible(true); // make frame visible
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// exit out of application
        this.getContentPane().setBackground(new Color(0, 0, 0));// change background
        

        // Create a button and add it to the frame
        this.add(play);

        

    }

}
