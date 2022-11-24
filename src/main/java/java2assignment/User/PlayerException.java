package java2assignment.User;

import java.util.ArrayList;

public class PlayerException extends Exception {

    public void FileNotFound(){
        System.out.println("File not found");
        return ;
    }

    public void FileIsEmpty(ArrayList f){
        if(f.isEmpty()){
            System.out.println("Playlist is empty");
        }else return;
    }
    
}
