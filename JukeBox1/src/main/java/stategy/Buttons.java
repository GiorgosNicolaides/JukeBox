/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stategy;

import gr.hua.dit.oop2.musicplayer.PlayerException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 *
 * @author giorgos
 */
public interface Buttons {
    
    
    
    public void next(ArrayList<InputStream> list , int songNumber)throws PlayerException;
    
    public void selectionButtons(ArrayList<InputStream> list);
    
    public void selectionSongs(ArrayList<InputStream> list);
}
