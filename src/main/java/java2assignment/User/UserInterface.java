package java2assignment.User;

import java.io.InputStream;

import com.goxr3plus.streamplayer.enums.Status;

public interface UserInterface {

    void play(InputStream i) throws PlayerException;

    void startPlaying(InputStream i) throws PlayerException;

    Status getStatus();

    void pause();

    void resume();

    void stop();

    void close();

    void addPlayerListener(PlayerListener listener);

    void removePlayerListener(PlayerListener listener);

}
