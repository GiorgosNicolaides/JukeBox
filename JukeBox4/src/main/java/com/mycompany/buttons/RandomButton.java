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
public class RandomButton extends JButton {

    ArrayList songs = new ArrayList();
    ImageIcon random = new ImageIcon("src/main/java/com/mycompany/Images/shuffle.png");
    Player p = PlayerFactory.getPlayer();
     StopButton stop ;
     PauseButton pause ;
    public RandomButton(ArrayList list) {
        for(int i = 0 ; i<list.size();i++){
            this.songs.add(list.get(i));
        }
        this.addActionListener(new RandomButtonListener());
        this.setBounds(60, 320, 40, 40);
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setIcon(random);
    }

    private class RandomButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (songs.size() > 1) {
                int max = songs.size();
                int min = 0;
                int a = (int) (Math.random() * (max - min + 1) );
                InputStream song = null;
                System.out.println(songs.size());
                if(songs.size() > 0) {
                    try {
                        p.stop();
                        System.out.println(songs.get(a));
                        song = new FileInputStream(songs.get(a).toString());
                        try {
                            p.startPlaying((song) );
                            pause.setEnabled(true);
                        stop.setEnabled(true);
                        } catch (PlayerException ex) {
                            Logger.getLogger(RandomButton.class.getName()).log(Level.SEVERE, null, ex);
                        }
                       
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(RandomButton.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                }
                
                }

            }
        }
    

}
