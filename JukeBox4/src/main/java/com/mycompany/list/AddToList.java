/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.list;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 *
 * @author giorgos
 */
public class AddToList {
    
    
    
    public void fromFolder(ArrayList list ,File f) throws FileNotFoundException{
        String st;
        st = "/home/giorgos/Desktop/Songs";
        f = new File(st);
        File directory = f ;
        File [] files ;
        String str;
        files = directory.listFiles();
        
        if(files != null){
            for (File file : files){
                str = file.getName();
                if(str.endsWith(".mp3") || str.endsWith(".m3u")){
                    
                    list.add(file);
                }
            }
        }
    }
}
