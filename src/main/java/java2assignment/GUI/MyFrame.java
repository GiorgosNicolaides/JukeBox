package java2assignment.GUI;


import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{

    public MyFrame(){

        //Create the frame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//set close button 
        this.setBounds(0, 0, 1500, 1000);//set Bounds
        this.setResizable(false);//not resizabke
        this.setVisible(true);//visibility
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0x808080));//Color
        this.setTitle("MusicPlayer");
        
        
        

        //create the left panel
        JPanel left = new JPanel();
        left.setBackground(Color.darkGray);//Color
        left.setBounds(0,0,300,1000);//set Bounds

        //TODO
        // add pay button
        // add pause button
        // add repeat button
        // add random button
        // add next song button


        //Add componenents
        this.add(left);




    }
}