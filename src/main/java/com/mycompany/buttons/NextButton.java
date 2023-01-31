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
public class NextButton extends JButton implements ActionListener {

    ArrayList list = new ArrayList();
    Player p = PlayerFactory.getPlayer();
    InputStream song;
    int songNumber = 0;
    ImageIcon next = new ImageIcon("src/main/java/com/mycompany/Images/next.png");
    ArrayList songNames = new ArrayList();

    public NextButton(ArrayList songs, ArrayList songsN) {
        for (int i = 0; i < songs.size(); i++) {
            this.list.add(songs.get(i));
        }
        for (int i = 0; i < songs.size(); i++) {
            this.songNames.add(songsN.get(i));
        }

        this.setIcon(next);
        this.setBounds(370, 320, 40, 40);
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (songNumber == list.size()) {
            songNumber = 0;
        }
        try {
            
            song = new FileInputStream((String) list.get(songNumber));
            p.stop();
            System.out.println("Song " + songNames.get(songNumber) + " playing");
            p.startPlaying(song);
            songNumber++;
            p.addPlayerListener(new PlayerListener() {
                @Override
                public void statusUpdated(PlayerEvent pe) {
                    if (p.getStatus().equals(p.getStatus().IDLE)) {
                        int e = 0;
                        e++;
                    }

                }
            });
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NextButton.class.getName()).log(Level.SEVERE, null, ex);
        } catch (PlayerException ex) {
            Logger.getLogger(NextButton.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
