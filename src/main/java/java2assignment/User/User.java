package java2assignment.User;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import com.goxr3plus.streamplayer.enums.Status;

public class User implements UserInterface{

    @Override
    public void play(File i) throws PlayerException {
                try {
                    AudioInputStream audio = AudioSystem.getAudioInputStream(i);
                    Clip clip =AudioSystem.getClip();
                    clip.open(audio);
                    clip.start();
                    
                    
                } catch (UnsupportedAudioFileException | IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (LineUnavailableException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

    }

    @Override
    public void startPlaying(InputStream i) throws PlayerException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Status getStatus() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addPlayerListener(PlayerListener listener) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void removePlayerListener(PlayerListener listener) {
        // TODO Auto-generated method stub
        
    }

    
}
