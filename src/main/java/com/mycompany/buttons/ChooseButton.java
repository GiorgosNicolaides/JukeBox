/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author giorgos
 */
public class ChooseButton extends JFileChooser {

    ArrayList list = new ArrayList();
    int returnVal;
    File file;
    ArrayList addMP3 = new ArrayList();

    public ChooseButton(ArrayList songs, ArrayList songNames) throws FileNotFoundException, IOException {
        this.setFileSelectionMode(this.FILES_AND_DIRECTORIES);
        this.returnVal = this.showOpenDialog(new JFrame());
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            this.file = this.getSelectedFile();
            if (file.isFile()) {
                // add the selected file to the songs list
                if (file.toString().endsWith(".mp3")) {
                    songs.clear();
                    songs.add(file.getAbsolutePath());
                    songNames.add(file.getName());
                    System.out.println("Song " + songNames.get(0) + " added to the list");
                } else if (file.toString().endsWith(".m3u")) {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.startsWith("https") && line.endsWith("mp3")) {
                            URL conn = new URL(line);
                            File f = new File(conn.toString());
                            String t = f.getName().substring(f.getName().lastIndexOf(".") + 1);
                            songs.add(f.getAbsolutePath());
                            songNames.add(f.getName());
                        } else if (line.endsWith("mp3")) {

                            File f = new File(line.toString());
                            String t = f.getName().substring(f.getName().lastIndexOf(".") + 1);
                            songs.add(f.getAbsolutePath());
                            songNames.add(f.getName());
                        }

                    }
                }
            } else if (file.isDirectory()) {
                songs.clear();
                File[] listOfFiles = file.listFiles();
                for (int i = 0; i < listOfFiles.length; i++) {
                    if (listOfFiles[i].isFile()) {
                        String ext = listOfFiles[i].getName().substring(listOfFiles[i].getName().lastIndexOf(".") + 1);
                        if (ext.equals("mp3") || ext.equals("wav") || ext.equals("flac")) {
                            songs.add(listOfFiles[i].getAbsolutePath());
                            songNames.add(listOfFiles[i].getName());
                        }

                        System.out.println("Song " + songNames.get(i) + "added to the list");
                    }

                }

            }

            this.setVisible(false);

            for (int i = 0; i < list.size(); i++) {
                songs.get(i).equals(this.list.get(i));
            }
        }

    }
}
