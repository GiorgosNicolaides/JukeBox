/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jukebox;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;
import gr.hua.dit.oop2.musicplayer.Player;
import static gr.hua.dit.oop2.musicplayer.Player.Status.PLAYING;
import gr.hua.dit.oop2.musicplayer.PlayerEvent;
import gr.hua.dit.oop2.musicplayer.PlayerException;
import java.io.FileInputStream;
import java.io.InputStream;
import gr.hua.dit.oop2.musicplayer.PlayerListener;
import gr.hua.dit.oop2.musicplayer.ProgressEvent;
import gr.hua.dit.oop2.musicplayer.ProgressListener;
import java.util.Random;
import javax.sound.sampled.AudioFileFormat;
import javazoom.spi.mpeg.sampled.file.MpegAudioFileFormat;
import static org.jaudiotagger.audio.AudioFile.logger;
/**
 *
 * @author agelo
 */
public class MyFrame extends JFrame implements ActionListener {
    
    JButton stop;
    JButton nextsong;
    JButton endsong;
    JButton continuesong;
    JButton startsong;
    JButton selectsong;
    JButton rewind;
    JButton close;
    JButton random;
    
    
    
    JLabel label;
    JList<String> List;
    File[] files;
    ArrayList <FileInputStream> Arraylist;
    ArrayList <String> SongNames;
    ArrayList <String> NotSongs;
    
    MyFrame() throws FileNotFoundException, IOException, PlayerException{
        
        DefaultListModel<String> myList = new DefaultListModel<>();
        List = new JList<>(myList);
        List.setBounds(30, 100, 300, 100);
        this.add(List);
        
        String name = JOptionPane.showInputDialog("Enter a file:");
        File file = new File(name);
        files = file.listFiles();
        String str;
        Arraylist = new ArrayList<>();
        SongNames = new ArrayList<>();
        NotSongs = new ArrayList<>();
        InputStream Playlist;
        if (files != null){
            for (File f : files){
                str = f.getName();
                if (str.endsWith("mp3")){
                    myList.addElement(str);
                    Playlist = new FileInputStream(f);
                    Arraylist.add((FileInputStream)Playlist);
                    SongNames.add(str);
                }else{
                    NotSongs.add(str);
                }
            }
            for (String notsongs: NotSongs){
                System.out.println(notsongs + " " + "is not an mp3 song");
            }
        }
        
        stop = new JButton();
        nextsong = new JButton();
        endsong = new JButton();
        continuesong = new JButton();
        startsong = new JButton();
        selectsong = new JButton();
        close = new JButton();
        rewind = new JButton();
        random = new JButton();
           
        label = new JLabel("Select a song");
           
        label.setBounds(30, 70, 500, 500);
        close.setBounds(30, 400, 300, 40);
        stop.setBounds(350, 100, 100, 40);
        nextsong.setBounds(350, 150, 100, 40);
        endsong.setBounds(350, 50, 100, 40);
        startsong.setBounds(350, 250, 100, 40);
        continuesong.setBounds(350, 200, 100, 40);
        selectsong.setBounds(30, 200, 300, 40);
        rewind.setBounds(350, 400, 100, 40);
        random.setBounds(350, 350, 100, 40);
           
        stop.addActionListener(this);
        nextsong.addActionListener(this);
        endsong.addActionListener(this);
        startsong.addActionListener(this);
        continuesong.addActionListener(this);
        selectsong.addActionListener(this);
        rewind.addActionListener(this);
        close.addActionListener(this);
        random.addActionListener(this);
           
        stop.setText("PAUSE");
        nextsong.setText("NEXT SONG");
        endsong.setText("END");
        startsong.setText("START");
        continuesong.setText("CONTINUE");
        selectsong.setText("SELECT SONG");
        rewind.setText("REWIND");
        close.setText("CLOSE MUSIC PLAYER");
        random.setText("RANDOM");
           
        stop.setFocusable(false);
        nextsong.setFocusable(false);
        endsong.setFocusable(false);
        startsong.setFocusable(false);
        continuesong.setFocusable(false);
        selectsong.setFocusable(false);
        rewind.setFocusable(false);
        close.setFocusable(false);
        random.setFocusable(false);
           
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(stop);
        this.add(nextsong);
        this.add(endsong);
        this.add(continuesong);
        this.add(startsong);
        this.add(selectsong);
        this.add(label);
        this.add(rewind);
        this.add(close);
        this.add(random);
           
        JTextField txt1 = new JTextField();
        
        
        this.setTitle("MUSICPLAYER");
        ImageIcon image = new ImageIcon("C:/Users/agelo/Downloads/—Pngtree—music player media icon_3649121.png");
        this.setIconImage(image.getImage());
    }

    InputStream song = null;
    InputStream song2 = null;
    
    ArrayList<Integer> SONGS = new ArrayList<>();
    boolean flag ;
    int i = -1;
    int l = -1;
    @Override
    public void actionPerformed(ActionEvent e){
      
        if (e.getSource() == close){
            System.exit(0);
        }
        
        Player p = PlayerFactory.getPlayer();
      
        String msg ="";
        if (List.getSelectedIndex() != -1){
            msg = "You selected :" + List.getSelectedValue();
            label.setText(msg);
        }
        
        if (e.getSource() == selectsong){
            if (p.getStatus() == PLAYING){
                p.stop();
            }
        }
        
        if (e.getSource().equals(startsong)){
            label.setText("Song:" + List.getSelectedValue() + " is playing");
            for ( i = 0; i < SongNames.size(); i++){
                if (List.getSelectedValue().equals(SongNames.get(i))){
                    song = (InputStream) Arraylist.get(i);
                    l = i;
                    SONGS.add(i);
                }
            }
            try{
                InputStream f = song;
                p.startPlaying(f);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        
        }
            
        if (e.getSource() == stop){
            label.setText("Song: " + List.getSelectedValue() + " has stopped");
            flag = false;
            p.pause();
        }
            
        if (e.getSource() == continuesong){
            if (flag == false){
                label.setText("Song: " + List.getSelectedValue() + " resumed");
                p.resume();
            }else{
                label.setText("The song has ended");
            }
        }
            
            
        int number = -1;    
        if (e.getSource() == random){
            p.stop();
            Random rand = new Random();
            number = rand.nextInt(Arraylist.size());
            song = (InputStream) Arraylist.get(number);
            int j = 0;
            for (int Song: SONGS){
                if (Song == number){
                    j++;
                }
            }
                
            if (SONGS.size() == Arraylist.size()){
                label.setText("All songs have been played");
            }else{
                if (j == 0){
                    SONGS.add(number);
                    try{
                        InputStream file = song;
                        p.startPlaying(file);
                        label.setText("Song: " + SongNames.get(number) + " is playing");
                    }catch(Exception ex){
                        ex.printStackTrace();
                    }
                }
                if (j > 0){
                    label.setText("Song: " + SongNames.get(number) + " has already been played");
                }
            }
        }
        
        
        if (e.getSource() == nextsong){
            p.stop();
            int k = 0;
            if (SongNames.size() == l + 1){
                l = 0;
                for (int song: SONGS){
                    if (l == song){
                        k++;
                    }
                } 
                if (SONGS.size() == Arraylist.size()){
                    label.setText("All songs have been played");
                }else{
                    if (k == 0){
                        SONGS.add(l);
                        song = (InputStream) Arraylist.get(l);
                        try{
                            InputStream file = song;
                            p.startPlaying(file);
                            label.setText("Song: " + SongNames.get(l) + " is playing");
                        }catch(Exception ex){
                            ex.printStackTrace();
                        }
                    }
                    if ( k > 0){
                        label.setText("Song: " + SongNames.get(l) + " has already been played");
                    }
                }
                }else{ 
                    l = l + 1;
                    for (int song: SONGS){
                        if (song == l){
                            k++;
                        }
                    }
                    if (SONGS.size() == Arraylist.size()){
                        label.setText("All songs have been played");
                    }else{
                        if (k == 0){
                            song = (InputStream) Arraylist.get(l);
                            SONGS.add(l);
                            try{
                                InputStream file = song;
                                p.startPlaying(file);
                                label.setText("Song: " + SongNames.get(l) + " is playing");
                            }catch(Exception ex){
                                ex.printStackTrace();
                            }    
                        }
                    if (k > 0){
                        label.setText("Song: " + SongNames.get(l) + " has already been played");
                    }
                }
            }
        }
            
        /*if (e.getSource() == rewind){
            System.out.println(p.getStatus());
            System.out.println(Arraylist.get(k));
            song = (InputStream) Arraylist.get(k);
            try{
                InputStream s1 = song;
                p.startPlaying(s1);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }*/
        
        if (e.getSource() == endsong){
            flag = true;
            label.setText("Song: " + List.getSelectedValue() + " has ended");
            p.stop();
            
        }
        
        
      
    }
}


        
    

    




    
   
            
    



    

