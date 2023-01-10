/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.commons.io.FileUtils;


public class Creation {

   

 
    public void printFiles(ArrayList list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }

    public void fromFolder(ArrayList<FileInputStream> list, File f) throws FileNotFoundException, IOException {
        File directory = f;
        File[] files;
        String str;
        files = directory.listFiles();
        InputStream inPlaylist;
        if (files != null) {
            for (File file : files) {
                str = file.getName();
                if (str.endsWith(".mp3") || str.endsWith(".m3u")) {
                    inPlaylist = new FileInputStream(file);
                    list.add((FileInputStream) inPlaylist);

                }
            }
        }

    }

    public void addFile(ArrayList list, File file) throws FileNotFoundException {
        InputStream inPlaylist;
        
        String str = file.getName();
        if (str.endsWith(".mp3") || str.endsWith(".m3u")) {
            
            inPlaylist = new FileInputStream(file);
            list.add((FileInputStream) inPlaylist);
        }
    }
}
