/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jukebox1;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import gr.hua.dit.oop2.musicplayer.Player;
import gr.hua.dit.oop2.musicplayer.PlayerException;
import gr.hua.dit.oop2.musicplayer.PlayerFactory;
import java.util.ArrayList;
import java.util.Scanner;
//import java.io.BufferedInputStream;
//import java.io.File;
//import static java.nio.file.Paths.get;
//import java.util.ArrayList;
//import java.util.Scanner;
import java.util.logging.*;

//import java.util.*;
/**
 *
 * @author it2021154
 */
public class JukeBox1 {
    
   
    
   
   
   
   public static void main(String[] args) {
     //String choice = null; 
     
      
            
     
     
     Player p = PlayerFactory.getPlayer();
    
     try {
    //System.out.println("music is now playing");
            //File file = new File("bin/audio/.mp3");
           // Scanner scan = new Scanner(System.in);
           // System.out.println("Enter your full file path:");
           // String filename = scan.nextLine();
           // Scanner inputFile = new Scanner(new File(filename));  
            //ArrayList<InputStream> songs = new ArrayList<>(); 
            InputStream song = new FileInputStream("/home/giorgos/git/JukeBox1/src/main/java/com/mycompany/jukebox1/Trivium3.mp3");
           // InputStream song1 = new FileInputStream("/home/it2021154/NetBeansProjects/JukeBox1/src/main/java/com/mycompany/jukebox1/Alice_in_Chains_Would_.mp3");
          //  InputStream song2 = new FileInputStream("/home/it2021154/NetBeansProjects/JukeBox1/src/main/java/com/mycompany/jukebox1/Alice_in_Chains_Down_In_A_Hole_2022_Remaster_.mp3");
     
    //ArrayList<InputStream> Song = new ArrayList<>();
    
            
               // songs.add(song);
               // songs.add(song1);
               // songs.add(song2);
       ////Song.add(song);
    //Song.add(song1);
    //Song.add(song2);
            
           
    
    //Scanner choose = new Scanner(System.in);
            
            
            
                
                    p.play(song);
                  //  p.play(song1);
                 //   p.play(song2);
            
                    //p.stop();
            
                p.pause();
            
                p.resume();
            
            
            
             
             
    //p.play(song);
    //p.play(song1);
    //p.play(song2);
    //p.play(s);
    
        //p.stop();
       // p.pause();
       // p.resume();
    
    
    
     
     
    

   
  
     
   }catch (FileNotFoundException e) {
   System.err.println("File not found");
   } catch (PlayerException e) {
    System.err.println("Something's wrong with the player: " + e.getMessage());
    } finally {
    if (p != null)
    p.close();
    }
   
     
   }
}
 



   


     
       
      // MusicPlayer mp3 = new MusicPlayer(); 
       
    
     
      //System.out.println("music is now playing");
            //File file = new File("bin/audio/.mp3");
           // Scanner scan = new Scanner(System.in);
           // System.out.println("Enter your full file path:");
           // String filename = scan.nextLine();
           // Scanner inputFile = new Scanner(new File(filename));  
      
   
       // mp3.addSong(1,"Trivium.mp3","Trivium",Genre.ROCK);
    // mp3.addSong(2,"Alice_in_Chains","Would",Genre.ROCK);
       // mp3.addSong(3,"Alice_in_Chains","Down_In_A_Hole_2022_Remaster_.mp3",Genre.ROCK);
       // mp3.playMusicFromQueue();
        
        
        //mp3.playRandomSong();
       // mp3.playRandomSong();
       // mp3.playsongB(1,true);
       // mp3.playsongB(2,false);
       // mp3.playMusicFromQueue();
        
       // mp3.closeMusicPlayer();
        
       // mp3.playRandomSong();
       // mp3.playMusicFromQueue();
       // mp3.playSong();
       // mp3.closeMusicPlayer();
        
       //mp3.loopSong();
       
        
       
   
       
        
   
   
  
   
  
   
   
   
   
                
            //mp3.loop();
            //mp3.randsong();
            //mp3.inorder();
            //m3u.playSong();
         //m3u.randsong();
            //m3u.inorder();

 

   
   
   
 

    

    //private static void play(LinkedList<Song> playList){
       // Scanner sc = new Scanner(System.in);
       // boolean quit = false;
       // boolean forward = true;
       // ListIterator<Song> listIterator = playList.listIterator();

       // if(playList.size() == 0){
         //   System.out.println("This playlist have no song");
     //   }else {
         //   System.out.println("Now playing " + listIterator.next().toString());
       //     printMenu();
       // }

       // while(!quit){
          //  int action = sc.nextInt();
         //   sc.nextLine();

         //   switch (action){

             //   case 0:
             //       System.out.println("Playlist complete");
             //       quit = true;
               //     break;

                //case 1:
                  //  if(!forward){
                  //      if(listIterator.hasNext()){
                   //         listIterator.next();
                    //    }
                      //  forward = true;
                  //  }
                 //   if(listIterator.hasNext()){
                     //   System.out.println("Now playing "+listIterator.next().toString());
                   // }else {
                     //   System.out.println("no song availble, reached to the end of the list");
                      //  forward = false;
                    //}
                   // break;
              //  case 2:
                  //  if(forward){
                   //     if (listIterator.hasPrevious()){
                   //         listIterator.previous();
                    //    }
                    //    forward = false;
                   // }
                 //   if(listIterator.hasPrevious()){
                      //  System.out.println("Now playing "+listIterator.previous().toString());
                 //   }else {
                   //     System.out.println("we are the first song");
                      //  forward = false;
                  //  }
                  //  break;

               // case 3:
                   // if(forward){
                     //   if(listIterator.hasPrevious()){
                         //   System.out.println("Now playing "+listIterator.previous().toString());
                       //     forward = false;
                      //  }else {
                         //   System.out.println("we are at the start of the list");
                      //  }
                  //  }else {
                    //    if(listIterator.hasNext()){
                      //      System.out.println("now playing "+listIterator.next().toString());
                           // forward = true;
                       // }else {
                      //      System.out.println("we have reached to the end of list");
                   //    }
                  //  }
                  //  break;

                //case 4:
                  //  printList(playList);
                //    break;
              //  case 5:
             //       printMenu();
              //      break;
              //  case 6:
              //      if (playList.size() >0){
              //          listIterator.remove();
              //          if(listIterator.hasNext()){
                      //      System.out.println("now playing "+listIterator.next().toString());
                    //    }
                    ///    else {
                    //        if(listIterator.hasPrevious())
                       //     System.out.println("now playing "+listIterator.previous().toString());
                     //   }
                   // }

           // }
      //  }
   // }

    //private static void printMenu(){
    //    System.out.println("Available options\n press");
    //    System.out.println("0 - to quit\n"+
    //            "1 - to play next song\n"+
    //            "2 - to play previous song\n"+
    //            "3 - to replay the current song\n"+
    //            "4 - list of all songs \n"+
    //            "5 - print all available options\n"+
    //            "6 - delete current song");
  //  }

    //private static void printList(LinkedList<Song> playList){
       // Iterator<Song> iterator = playList.iterator();
      //  System.out.println("-----------------");

      //  while (iterator.hasNext()){
       //     System.out.println(iterator.next());
     //   }

     // System.out.println("-----------------");
   // }


   
   
   

    




      
      
   
   

   
   
    
       
   

       
       
        
        
     
        
    

   
