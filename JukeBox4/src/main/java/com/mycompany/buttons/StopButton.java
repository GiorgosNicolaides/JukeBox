/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttons;

import gr.hua.dit.oop2.musicplayer.Player;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author giorgos
 */
public class StopButton extends JButton {
    ImageIcon stop = new ImageIcon("src/main/java/com/mycompany/Images/stop.png");
    Player p = PlayerFactory.getPlayer();
    
    
    public StopButton(){
        this.addActionListener(new StopButtonListener());
        this.setBounds(140 , 320 ,40,40);
        this.setBackground(Color.gray);
        this.setVisible(true);
        this.setIcon(stop);
    }
    private class StopButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
          if(p.getStatus() != Player.Status.IDLE) {
                p.stop();
                //pauseButton.setEnabled(false);
                
            }
        }
        }
        
    }

