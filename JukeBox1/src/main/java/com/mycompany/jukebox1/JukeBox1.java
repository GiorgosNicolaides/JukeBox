/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jukebox1;

import Array.Creation;
import gr.hua.dit.oop2.musicplayer.Player;

import gr.hua.dit.oop2.musicplayer.PlayerException;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.ArrayList;

import stategy.Stategy;

/**
 *
 * @author giorgos
 */
public class JukeBox1 {

    public static void main(String[] args) throws PlayerException, FileNotFoundException, IOException {
        String song = null;
        String strategy = "order";


        if(args.length==1){
            song=args[0];
        }else
            if(args.length==2){
                song=args[0];
                strategy=args[1];
            }
        
        System.out.println(strategy);
        ArrayList list = new ArrayList();
        Creation l = new Creation();
        File f = new File(song);
        if (song.endsWith(".mp3") || song.endsWith(".m3u")) {
            l.addFile(list, f);
        } else {
            l.fromFolder(list, f);
        }
        l.printFiles(list);

        Stategy st = new Stategy();

        if (strategy.equals("order")) {
            st.order(list);
        } else if (strategy.equals("loop")) {
            do{
            st.loop(list);
            }while(strategy.equals("loop"));
        } else if (strategy.equals("random")) {
            st.random(list);
        
        } else {
            System.err.println("Not valid arguments");
        }
    }

}
