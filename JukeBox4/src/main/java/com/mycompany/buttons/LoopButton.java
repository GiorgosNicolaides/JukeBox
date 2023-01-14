/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttons;

import gr.hua.dit.oop2.musicplayer.Player;
import gr.hua.dit.oop2.musicplayer.PlayerException;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author giorgos
 */
public class LoopButton extends JButton{
    ImageIcon loop =new ImageIcon("src/main/java/com/mycompany/Images/loop.png");
    ArrayList list;
    Player p = PlayerFactory.getPlayer();
    
    public LoopButton(){
        this.addActionListener(new LoopButtonListener());
        this.setBounds(10, 320, 40, 40);
        this.setBackground(Color.gray);
        this.setVisible(true);
        this.setIcon(loop);
    }
    
    
private class LoopButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(p.getStatus() == p.getStatus().PLAYING){
                String song;
                song =  list.iterator().toString();
                InputStream songf = null;
                try {
                    songf = new FileInputStream(song);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(LoopButton.class.getName()).log(Level.SEVERE, null, ex);
                }
                while(true){
                    try {
                        p.play(songf);
                    } catch (PlayerException ex) {
                        Logger.getLogger(LoopButton.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    
}
    
}
