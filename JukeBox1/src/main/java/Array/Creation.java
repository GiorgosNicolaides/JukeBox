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

/**
 *
 * @author giorgos
 */
public class Creation {

    InputStream song1, song2, song3, song4;

    public void addFiles(ArrayList<FileInputStream> list) throws FileNotFoundException {

        song1 = new FileInputStream("/home/giorgos/git/JukeBox1/src/main/java/Array/Alice_in_Chains_Down_In_A_Hole_2022_Remaster_.mp3");
        song2 = new FileInputStream("/home/giorgos/git/JukeBox1/src/main/java/Array/Alice_in_Chains_Would_.mp3");
        song3 = new FileInputStream("/home/giorgos/git/JukeBox1/src/main/java/Array/Trivium3.mp3");
        song4 = new FileInputStream("/home/giorgos/git/JukeBox1/src/main/java/Array/hardware-remove.mp3");

        list.add((FileInputStream) song1);
        list.add((FileInputStream) song2);
        list.add((FileInputStream) song3);
        list.add((FileInputStream) song4);
    }

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
