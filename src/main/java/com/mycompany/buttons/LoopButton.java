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
import gr.hua.dit.oop2.musicplayer.ProgressEvent;
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
public class LoopButton extends JButton implements ActionListener {

    ImageIcon loop = new ImageIcon("src/main/java/com/mycompany/Images/loop.png");
    ArrayList list = new ArrayList();
    Player p = PlayerFactory.getPlayer();
    int songNumber;
    InputStream song;

    public LoopButton(ArrayList songs) {
        for (int i = 0; i < songs.size(); i++) {
            this.list.add(songs.get(i));
        }

        this.addActionListener(this);
        this.setBounds(10, 320, 40, 40);
        this.setBackground(Color.gray);
        this.setVisible(true);
        this.setIcon(loop);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        while (true) {
            try {
                song = new FileInputStream(list.get(songNumber).toString());
                p.stop();
                while (true) {
                    p.startPlaying(song);
                    p.addPlayerListener(new PlayerListener() {
                        @Override
                        public void statusUpdated(PlayerEvent pe) {
                            if (p.getStatus().equals(p.getStatus().IDLE)) {
                                int e = 0;
                                e++;
                            }
                            System.out.println("Song ended");

                        }
                    });
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(LoopButton.class.getName()).log(Level.SEVERE, null, ex);
            } catch (PlayerException ex) {
                Logger.getLogger(LoopButton.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
