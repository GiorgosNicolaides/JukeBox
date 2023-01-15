/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttons;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author giorgos
 */
public class Label extends JLabel {
    
    public Label(){
        this.setText("MP3");
        this.setBackground(Color.black);
        this.setOpaque(true);
        this.setBounds(0, 0, 420, 80);
        this.setHorizontalTextPosition(this.CENTER);
        this.setVerticalTextPosition(this.CENTER);
        this.setHorizontalAlignment(this.CENTER);
        this.setVerticalAlignment(this.CENTER);
        this.setFont(new Font("MV Boli" , Font.BOLD , 20));
        this.setForeground(Color.green);
    }
    
    
}
