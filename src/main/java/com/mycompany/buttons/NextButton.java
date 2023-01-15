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
public class NextButton extends JButton {

    ArrayList list = new ArrayList();
    Player p = PlayerFactory.getPlayer();
    ImageIcon next = new ImageIcon("src/main/java/com/mycompany/Images/next.png");
    int songNumber;

    public NextButton(ArrayList songs, int songNum) {
        for (int i = 0; i < songs.size(); i++) {
            this.list.add(songs.get(i));
        }
        this.songNumber = songNum;
        this.setIcon(next);
        this.addActionListener(new NextButtonListener());
        this.setBounds(370, 320, 40, 40);
        this.setVisible(true);
        this.setBackground(Color.gray);
    }

    private class NextButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(songNumber >=list.size()-1){
                songNumber =0;
            }
            if (p.getStatus().equals(p.getStatus().PLAYING)) {
                try {
                    
                    p.stop();
                    InputStream song = new FileInputStream(list.get(++songNumber).toString());
                    System.out.println(song);
                    p.startPlaying(song);
                    
                } catch (PlayerException ex) {
                    Logger.getLogger(NextButton.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(NextButton.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
