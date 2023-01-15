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

    ArrayList songs = new ArrayList();
    ImageIcon play = new ImageIcon("src/main/java/com/mycompany/Images/play.png");
    Player p = PlayerFactory.getPlayer();
    PauseButton pause ;
        StopButton stop ;
        RandomButton random ;
        NextButton next;
        LoopButton loop ;
        Label label ;
        InputStream in ;
    public PlayButton(ArrayList list , int songNumber) {
        for(int i = 0 ; i<list.size();i++){
            this.songs.add(list.get(i));
        }
        pause = new PauseButton();
         stop = new StopButton();
         random = new RandomButton(list,songNumber);
         next = new NextButton(list , songNumber);
         loop = new LoopButton();
         label = new Label();
        this.addActionListener(this);
        this.setVisible(true);
        this.setBackground(Color.gray);
        this.setBounds(190, 320, 40, 40);
        this.setIcon(play);
        
    

   

        

    
}

    @Override
    public void actionPerformed(ActionEvent ae) {
       
            
        if (p.getStatus() == Player.Status.PAUSED) {
            p.resume(); 
        } else {
            try {
                System.out.println(songs.size());
                if(songs.size() > 0) {
                    
                    InputStream song = new FileInputStream(songs.get(0).toString());
                    p.startPlaying(song);
                    pause.setEnabled(true);
                    stop.setEnabled(true);
                    random.setEnabled(true);
                    
            }}catch (PlayerException E){
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PlayButton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
        
    

       