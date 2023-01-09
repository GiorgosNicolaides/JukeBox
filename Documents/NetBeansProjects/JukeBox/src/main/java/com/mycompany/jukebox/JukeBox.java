/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jukebox;

import gr.hua.dit.oop2.musicplayer.PlayerEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;
import gr.hua.dit.oop2.musicplayer.PlayerException;
import gr.hua.dit.oop2.musicplayer.ProgressEvent;
import java.io.InputStream;
import java.util.Scanner;
import static org.jaudiotagger.audio.AudioFile.logger;
import gr.hua.dit.oop2.musicplayer.Player;
import java.io.FileInputStream;



public class JukeBox {

    public static void main(String[] args) throws FileNotFoundException, IOException, PlayerException {
          
        MyFrame frame = new MyFrame();
        /*Player player = PlayerFactory.getPlayer();
        try{ 
           InputStream input = new FileInputStream("C:/Users/agelo/Desktop/GUIMusicP/Ice & Fire - King Canyon.mp3");
           player.startPlaying(input);
           Thread.sleep(1000);
           player.stop();
           InputStream lastSong = new FileInputStream("C:/Users/agelo/Desktop/GUIMusicP/Oh Christmas Tree - DJ Williams.mp3");
           player.startPlaying(lastSong);
           
        }catch (Exception ex){
            ex.printStackTrace();
        }*/
    }

    

}
        
