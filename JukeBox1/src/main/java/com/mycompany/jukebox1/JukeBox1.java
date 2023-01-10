/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jukebox1;

import Array.Creation;
import Gui.Gui;
import gr.hua.dit.oop2.musicplayer.Player;

import gr.hua.dit.oop2.musicplayer.PlayerException;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import stategy.ButtonsGui;

import stategy.Stategy;

/**
 *
 * @author giorgos
 */
public class JukeBox1 {

    public static void main(String[] args) throws  FileNotFoundException, IOException, PlayerException {
        String song = null;
        String strategy = "order";
        int songNumber=0;
        Scanner scanner = new Scanner(System.in);

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
        Gui gui = new Gui();
        gui.Gui(list);
            
            }
    }

