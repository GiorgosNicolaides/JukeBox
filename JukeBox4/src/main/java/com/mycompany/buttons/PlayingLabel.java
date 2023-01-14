/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttons;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author giorgos
 */
public class PlayingLabel extends JLabel{
        String  text;
        
    public PlayingLabel(ArrayList<File> list , int i , int y){
        
        text =list.get(i).toString();
        
        
        this.setBounds(0 , y , 420 , 20);
        this.setText(text);
        this.setBackground(Color.red);
}
}
