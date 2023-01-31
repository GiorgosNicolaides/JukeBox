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
public class PauseButton extends JButton {

    Player p = PlayerFactory.getPlayer();
    ImageIcon pause = new ImageIcon("src/main/java/com/mycompany/Images/pause.png");

    public PauseButton() {

        this.addActionListener(new PauseButtonListener());
        this.setBounds(240, 320, 40, 40);
        this.setBackground(Color.gray);
        this.setIcon(pause);
        this.setVisible(true);

    }

    private class PauseButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (p.getStatus() == Player.Status.PLAYING) {
                p.pause();

            }
        }

    }
}
