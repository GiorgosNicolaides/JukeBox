package com.mycompany.main;

import java.io.File;
import java.io.InputStream;
import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;
import java.util.TimerTask;
import javax.print.attribute.standard.Media;
import javax.swing.Timer;




public interface UserInterface {
   
    
    
    
    
    void play(String musicLocation) throws PlayerException; 

    void startPlaying(InputStream i) throws PlayerException;
            
    Status getStatus(); // For GUI purpose 

    void pause();

    void resume();

    void stop();

    void close();

    void addPlayerListener(PlayerListener listener); //FIXME

    void removePlayerListener(PlayerListener listener); // FIXME
}