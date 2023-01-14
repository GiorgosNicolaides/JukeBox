/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttons;

import java.awt.Color;
import java.io.InputStream;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author giorgos
 */
public class Frame extends JFrame {

    ArrayList list = new ArrayList(); // declare the arraylist
    //declare the components
    JPanel p;
    PauseButton pause;
    StopButton stop;
    RandomButton random;
    NextButton next;
    LoopButton loop;
    Label label;
    PlayButton play;
    PlayingLabel plabel;
    
    public Frame(ArrayList<InputStream> songs) {
        //add ArrayList
        for (int i = 0; i < songs.size(); i++) {
            list.add(songs.get(i));
        }

        //declare variables
         pause = new PauseButton();
         stop = new StopButton();
         random = new RandomButton(songs);
         next = new NextButton();
         loop = new LoopButton();
         label = new Label();
         play = new PlayButton(list);
         
        this.setTitle("MusicPlayer");//set Title
        this.setSize(420, 420);//set the dimensions
        this.setResizable(false);//prevent from being resized
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);//exit out of application
        this.setVisible(true);//set visible
        this.getContentPane().setBackground(Color.gray);
        this.setLayout(null);
        //add components
        this.add(label);
        this.add(loop);
        this.add(random);
        this.add(play);
        this.add(pause);
        this.add(next);
        this.add(stop);
        
        int y=80;
       for(int i = 0 ;i<list.size();i++){
           y=y+20;
           plabel = new PlayingLabel(list , i , y);
           this.add(plabel);
       }
        
        

        //set ActionListeners
        
    }
}
