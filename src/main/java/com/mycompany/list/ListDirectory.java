/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.list;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 *
 * @author giorgos
 */

//class for directory list


public class ListDirectory extends ArrayList {
    //create variable to list the files
    File[] listOfFiles; 
    
    //get from args the directory and add the mp3 songs to an ArrayList
    public ListDirectory(File folder) throws FileNotFoundException{
        
        listOfFiles = folder.listFiles();
        //using for to add the songs 
        for (File file : listOfFiles) {
            //getting the filename
            String fileName = file.getName();
            if (fileName.endsWith(".mp3")) {
                //adding to the list
                this.add(file);
            }
        }
             
      } 
      
    //getter in order to get the song from other classe 
    //will be used in stategy where we will get the list to implement random, order, loop
    File getFile( int number){
        return this.getFile(number);
    }

    
}
