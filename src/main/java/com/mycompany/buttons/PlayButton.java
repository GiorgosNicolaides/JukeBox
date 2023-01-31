/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttons;

import gr.hua.dit.oop2.musicplayer.Player;
import gr.hua.dit.oop2.musicplayer.PlayerEvent;
import gr.hua.dit.oop2.musicplayer.PlayerException;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;
import gr.hua.dit.oop2.musicplayer.PlayerListener;
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
public class PlayButton extends JButton implements ActionListener {

    ArrayList songNames = new ArrayList();//arraylist for songNames
    ArrayList songs = new ArrayList();
    ImageIcon play = new ImageIcon("src/main/java/com/mycompany/Images/play.png");
    Player p = PlayerFactory.getPlayer();
    InputStream song;
    int songNumber = 0;

    public PlayButton(ArrayList list, ArrayList songsN) {
        for (int i = 0; i < list.size(); i++) {
            this.songs.add(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            this.songNames.add(songsN.get(i));
        }
        this.addActionListener(this);
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setBounds(190, 320, 40, 40);
        this.setIcon(play);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (p.getStatus().equals(p.getStatus().PAUSED)) {
            p.resume();
        } else {
            try {
                song = new FileInputStream(songs.get(songNumber).toString());
                p.stop();
                System.out.println("Song " + songNames.get(songNumber) + " playing");
                p.startPlaying(song);
                p.addPlayerListener(new PlayerListener() {
                    @Override
                    public void statusUpdated(PlayerEvent pe) {
                        if (p.getStatus().equals(p.getStatus().IDLE)) {
                            int e = 0;
                            e++;
                        }

                    }
                });

            } catch (PlayerException ex) {
                Logger.getLogger(PlayButton.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PlayButton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
