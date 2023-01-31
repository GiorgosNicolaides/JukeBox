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
import static java.awt.image.ImageObserver.WIDTH;
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
public class RandomButton extends JButton implements ActionListener {

    ArrayList songNames = new ArrayList();//arraylist for songNames
    ArrayList songs = new ArrayList();
    ImageIcon random = new ImageIcon("src/main/java/com/mycompany/Images/shuffle.png");
    Player p = PlayerFactory.getPlayer();
    InputStream song = null;

    public RandomButton(ArrayList list, ArrayList songsN) {
        for (int i = 0; i < list.size(); i++) {
            this.songs.add(list.get(i));
        }
        for (int i = 0; i < list.size(); i++) {
            this.songNames.add(songsN.get(i));
        }

        this.addActionListener(this);
        this.setBounds(60, 320, 40, 40);
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setIcon(random);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (songs.size() > 1) {
            int max = songs.size();
            int min = 0;

            if (songs.size() > 0) {

                try {
                    int a = (int) (Math.random() * (max - min + 1) - 1);
                    p.stop();
                    System.out.println("Song " + songNames.get(a) + " started");
                    song = new FileInputStream(songs.get(a).toString());
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
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(RandomButton.class.getName()).log(Level.SEVERE, null, ex);
                } catch (PlayerException ex) {
                    Logger.getLogger(RandomButton.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
}
