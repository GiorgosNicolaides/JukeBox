/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttons;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author giorgos
 */
public class MP3Label extends JLabel {

    public MP3Label() {
        this.setBounds(35, 0, 100, 80);
        this.setText("MP3");
        this.setFont(new Font("MV Boli", Font.BOLD, 25));
        this.setForeground(Color.black);
        this.setVisible(true);
        this.setHorizontalTextPosition(this.RIGHT);
        this.setVerticalTextPosition(this.CENTER);
        this.setHorizontalAlignment(this.CENTER);
        this.setVerticalAlignment(this.CENTER);
    }
}
