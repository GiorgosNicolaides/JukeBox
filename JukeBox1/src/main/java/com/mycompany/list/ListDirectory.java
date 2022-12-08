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
public class ListDirectory extends ArrayList {
    
    File[] listOfFiles; 
    
    
    public ListDirectory(File folder) throws FileNotFoundException{
        
        listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            String fileName = file.getName();
            if (fileName.endsWith(".mp3")) {
                this.add(file);
            }
        }
             
      } 
      
    
    File getFile( int number){
        return this.getFile(number);
    }

    
}
