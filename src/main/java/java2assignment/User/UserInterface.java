package java2assignment.User;

import java.io.InputStream;
import java.io.ObjectInputFilter.Status;

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
