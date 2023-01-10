/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stategy;

import gr.hua.dit.oop2.musicplayer.Player;
import static gr.hua.dit.oop2.musicplayer.Player.Status.PLAYING;
import gr.hua.dit.oop2.musicplayer.PlayerException;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author giorgos
 */
public class ButtonsGui implements Buttons {
    public Player p = PlayerFactory.getPlayer();
    @Override
    public void next(ArrayList<InputStream> list,  int songNumber) throws PlayerException {
        
        
        InputStream song=null ;
        p.stop();
        for(int i=0;i<=list.size();i++){
            song= list.get(songNumber+1);
            p.play(song);
        }
        
    }

    @Override
    public void selectionButtons(ArrayList<InputStream> list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void selectionSongs(ArrayList<InputStream> list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
