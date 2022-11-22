package java2assignment.Playlist;

import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Create {
    
    private File directory;
    private File [] files;
    private ArrayList<File> songs;
    private int songnumber = 0;
    private Timer timer ;
    private TimerTask task ;
    private boolean running ;


    public void createList(File f){

        songs = new ArrayList<File>();
        directory = f;
        files = directory.listFiles();

        if(files != null){
            for(File file : files){
                String s = file.getName();
                if(s.contains(".wav") || s.contains(".mp3")){
                songs.add(file);
                songnumber++;
                System.out.println(file );
            }
            
        }
    }
}
}