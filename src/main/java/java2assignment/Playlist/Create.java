package java2assignment.Playlist;

import java.io.File;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class Create {
    
    private File directory;
    private File [] files;
    private ArrayList<File> songs;
    private int songnumber;
    private Timer timer ;
    private TimerTask task ;
    private boolean running ;


    public void createList(File f){

        songs = new ArrayList<File>();
        directory = f;
        files = directory.listFiles();

        if(files != null){
            for(File file : files){
                songs.add(file);
                System.out.println(file);
            }
        }
    }
}
