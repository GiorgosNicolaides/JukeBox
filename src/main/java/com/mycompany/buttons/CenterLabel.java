/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttons;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author giorgos
 */
public class CenterLabel extends JLabel {

    ImageIcon img = new ImageIcon("src/main/java/com/mycompany/Images/label1.png");

    public CenterLabel() {
        this.setBounds(190, 20, 40, 40);
        this.setIcon(img);
        this.setVisible(true);

        this.setHorizontalTextPosition(this.RIGHT);
        this.setVerticalTextPosition(this.CENTER);
        this.setHorizontalAlignment(this.CENTER);
        this.setVerticalAlignment(this.CENTER);
        this.setBackground(Color.gray);
    }

}
