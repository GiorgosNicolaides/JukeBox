
package java2assignment.jukebox;

import java.io.File;
import java.util.Scanner;

import java2assignment.Playlist.Create;

public class JukeBox {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        File f = new File(s);
        Create create = new Create();
        create.createList(f);
        in.close();
        
    }

}
