
package java2assignment.jukebox;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


import java2assignment.Playlist.Create;
import java2assignment.User.PlayerException;
import java2assignment.User.User;

public class JukeBox {

    public static void main(String[] args) throws PlayerException {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        File f = new File(s);
        Create create = new Create();
        User u = new User();
        String response = "";
        ArrayList <File> songs = new ArrayList<>();
        create.createList(f, songs);

        while(!response.equals("q")){
        for(int i = 0 ; i < songs.size(); i++ ){
            u.play(songs.get(i));
        }
    }
        in.close();
        
    }

}
