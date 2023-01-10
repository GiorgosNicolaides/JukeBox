/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stategy;

import gr.hua.dit.oop2.musicplayer.Player;
import gr.hua.dit.oop2.musicplayer.PlayerException;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/**
 *
 * @author giorgos
 */
public class Stategy {

    public void random(ArrayList list , int songNumber) throws PlayerException {

        //Create new Array to store the songs
        ArrayList<FileInputStream> randlist = new ArrayList();
        Player p = PlayerFactory.getPlayer();
        //Create a random variable
        //min
        int min = 0;
        //max
        int max = list.size();
        int a = (int) (Math.random() * (max - min + 1) + min);
        songNumber=a;
        //add the songs to the new Array
        //from the random variable until the end 
        for (int i = a; i < list.size(); i++) {
            FileInputStream song = (FileInputStream) list.get(i);
            randlist.add(song);
        }

        //from the start until random variable
        for (int i = 0; i < list.size(); i++) {
            FileInputStream song = (FileInputStream) list.get(i);
            randlist.add(song);
        }
        //this is done because we want to start a new playlist with the random being the 
        //first song to be played

        //play the songs
        for (int i = 0; i < randlist.size(); i++) {
            InputStream song = (InputStream) randlist.get(i);
            p.play(song);
        }
        if (p != null) {
            p.close();
        }

    }

    public void order(ArrayList<InputStream> list , int songNumber) throws PlayerException {

        Player p = PlayerFactory.getPlayer();

        for (int i = 0; i < list.size(); i++) {
            InputStream song = (InputStream) list.get(i);
            p.play(song);
            songNumber=i;

        }
        if (p != null) {
            p.close();
        }
    }

    public  void loop(InputStream dong) throws PlayerException {
        Player p = PlayerFactory.getPlayer( );
        p.play(dong);
        
          }

    
}
    
        
         
      
        
    
    


