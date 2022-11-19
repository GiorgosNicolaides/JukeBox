package java2assignment.PlayList;

import java.io.*;

public class ReadFromFile {
    private Reader read ;

    public void getFile(File f) {
        try{

            read = new FileReader(f);
            read.close();
           

    }catch(Exception e){
        System.out.println("File not found");
    }

}
}