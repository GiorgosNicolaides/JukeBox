package java2assignment.GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    /**
     * 
     */
    // Creating Buttons
    JButton play = new PlayButton();
    JButton pause = new PauseButton();
    JButton repeat = new RepeatButton();
    JButton random = new RandomButton();
    JButton next = new NextButton();

    public MyFrame() {

        // Create the frame
        this.setTitle("MusicPlayer");// set tittle
        this.setBounds(0, 0, 400, 400); // set the bounds of the GUI

        this.setLayout(null);
        this.setResizable(false);//prevent user from resizing the window
        this.setVisible(true); // make frame visible
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// exit out of application
        this.getContentPane().setBackground(new Color(0, 0, 0));// change background

        // Add Buttons to the frame
        this.add(play);
        this.add(pause);
        this.add(repeat);
        this.add(random);
        this.add(next);

    }

}
