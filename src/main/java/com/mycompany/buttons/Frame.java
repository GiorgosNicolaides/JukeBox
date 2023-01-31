/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttons;

import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author giorgos
 */
public class Frame extends JFrame {

    ArrayList songNames = new ArrayList();//arraylist for songNames
    ArrayList list = new ArrayList(); // declare the arraylist
    //declare the components
    List jlist;
    PauseButton pause;
    StopButton stop;
    RandomButton random;
    NextButton next;
    LoopButton loop;
    Label label;
    PlayButton play;
    ChooseButton choose;
    InputStream song;
    int songNumber;

    public Frame() {
        try {
            //declare variables
            choose = new ChooseButton(list, songNames);
        } catch (IOException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        pause = new PauseButton();
        stop = new StopButton();
        random = new RandomButton(list, songNames);
        next = new NextButton(list, songNames);
        loop = new LoopButton(list);
        label = new Label();
        play = new PlayButton(list,songNames);
        jlist = new List(songNames, list);

        //add Action Listeners
        //set frame 
        this.setTitle("MusicPlayer");//set Title
        this.setSize(420, 420);//set the dimensions
        this.setResizable(false);//prevent from being resized
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);//exit out of application
        this.setVisible(true);//set visible
        this.getContentPane().setBackground(new Color(64,64,64));
        this.setLayout(null);
        //add components
        this.add(label);
        this.add(loop);
        this.add(random);
        this.add(play);
        this.add(pause);
        this.add(next);
        this.add(stop);
        this.add(choose);
        this.add(jlist);
    }

}
