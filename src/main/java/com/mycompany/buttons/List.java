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
import java.awt.Component;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author giorgos
 */
public class List extends JList implements ListSelectionListener {

    DefaultListModel<String> modellist = new DefaultListModel();
    InputStream song;
    Player p = PlayerFactory.getPlayer();
    ArrayList songs = new ArrayList();
    ArrayList songsNames = new ArrayList();

    public List(ArrayList songName, ArrayList list) {
        for (Object song : songName) {
            modellist.addElement(song.toString());
        }
        for (int i = 0; i < list.size(); i++) {
            songs.add(list.get(i));
        }
        for (int i = 0; i < songName.size(); i++) {
            songsNames.add(list.get(i));
        }
        this.setModel(modellist);
        this.setBackground(Color.gray);
        this.setBounds(0, 80, 420, 220);
        this.setVisible(true);
        this.addListSelectionListener(this);

    }

    @Override
    public void valueChanged(ListSelectionEvent lse) {
        if (!lse.getValueIsAdjusting()) {
            int y = 0;
            String selectedSong = (String) this.getSelectedValue();
            System.out.println(selectedSong);
            try {

                for (int i = 0; i < songs.size(); i++) {
                    if (songs.get(i).toString().endsWith(selectedSong)) {
                        y = i;
                    }
                }
                song = new FileInputStream((String) songs.get(y));
                p.stop();
                
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
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            } catch (PlayerException ex) {
                Logger.getLogger(List.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
