/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.buttons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author giorgos
 */
public class ChooseButton extends JFileChooser {
    
    ArrayList list = new ArrayList();
    int returnVal ;
    File file;
    
    public ChooseButton(Frame frame , ArrayList songs){
        this.setFileSelectionMode(this.FILES_AND_DIRECTORIES);
        this.returnVal = this.showOpenDialog(frame);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
             this.file = this.getSelectedFile();
              if(file.isFile()){
                // add the selected file to the songs list
                songs.clear();
                songs.add(file.getAbsolutePath());
            }
            else if(file.isDirectory()){
                songs.clear();
                File[] listOfFiles = file.listFiles();
                for (int i = 0; i < listOfFiles.length; i++) {
                  if (listOfFiles[i].isFile()) {
                    String ext = listOfFiles[i].getName().substring(listOfFiles[i].getName().lastIndexOf(".")+1);
                    if(ext.equals("mp3")||ext.equals("wav")||ext.equals("flac"))
                        songs.add(listOfFiles[i].getAbsolutePath());
                    System.out.println("add");
                  }
                }
}
        }
        
        this.setVisible(false);
        
        for(int i=0; i<list.size();i++){
            songs.get(i).equals(this.list.get(i));
        }
    }
    

}