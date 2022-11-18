package java2assignment.GUI;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame  extends JFrame {
    /**
     * 
     */
    
    
    public MyFrame(){
        
         //Create the frame
         this.setTitle("MusicPlayer");//set tittle
         this.setSize(420 , 420);// set size 
         this.setVisible(true); //make frame visible
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);//exit out of application
         this.getContentPane().setBackground(new Color(255 , 0, 0));//change background 
        
        //Create a button and add it to the frame
        
        JButton play = new JButton();
        play.setBounds(10 ,80 , 80 , 25);
        this.add(play);
       

    }


    
}
