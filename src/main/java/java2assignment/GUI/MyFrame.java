package java2assignment.GUI;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

    JButton pause = new JButton();
    JButton repeat = new JButton();
    JButton random = new JButton();
    JButton next = new JButton();
    ImageIcon playImg = new ImageIcon("Images/play.png");
    JButton play = new JButton();

    public MyFrame() {

        // Create the frame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);// set close button
        this.setBounds(0, 0, 1500, 1000);// set Bounds
        this.setResizable(false);// not resizabke
        this.setVisible(true);// visibility
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0x808080));// Color
        this.setTitle("MusicPlayer");

        // get the left panel
        Panel left = new Panel();
        // TODO
        // add pay button
        play.setBounds(850, 880, 50, 50);
        play.setBackground(new Color(0x808080));
        play.setIcon(playImg);
        play.setVisible(true);
        // add pause button
        pause.setBackground(Color.BLUE);
        pause.setBounds(900, 880, 50, 50);
        // add repeat button
        repeat.setBackground(Color.BLUE);
        repeat.setBounds(380, 880, 30, 30);
        // add random button
        random.setBackground(Color.BLUE);
        random.setBounds(350, 880, 30, 30);
        // add next song button
        next.setBackground(Color.BLUE);
        next.setBounds(1050, 880, 50, 50);

        // add playlist label and button
        // add song playlist and button

        // Add componenents
        this.add(left);
        this.add(play);
        this.add(pause);
        this.add(repeat);
        this.add(random);
        this.add(next);

    }
}