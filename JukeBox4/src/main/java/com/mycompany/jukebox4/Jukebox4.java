
package com.mycompany.jukebox4;

import com.mycompany.buttons.Frame;
import com.mycompany.list.AddToList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class Jukebox4 {

    public static void main(String[] args) throws FileNotFoundException {
        String song = null;
        String strategy = "order";


        if(args.length==1){
            song=args[0];
        }else
            if(args.length==2){
                song=args[0];
                strategy=args[1];
            }
        ArrayList list = new ArrayList();
        AddToList add = new AddToList();
        File f = new File(song);
        add.fromFolder(list , f);
        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        new Frame(list);
    }
}
