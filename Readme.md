# What we need 


## The user can

-   select a song and play it
-   stop the song
-   pause the song 
-   choose next song 
    -   random 
    -   next song in the list
    -   repeat
    

## 
>-   We can use a stack implemented by a doubly linked list.
The list will be read from the file and each node will cointain a song and any other info that will be given (artist, song name, etc)
>
## Select song and play

-   We will add the list to the gui
    
-   The user will click on a button next to the song 
    
-   When the button is clicked:
            
        song.open()
        song.play()


## Stop the song 

-   song.stop()
-   song.close()


##   Pause the song 

-   song.stop()
-   songTimePosision = song.getMicroSecondPosition()
-   song.setMicroSecondPosition(SongTimePosition)
-   song.start()


## Choosing next song 


### Random

-   From the stack we will use random method to select the next song excluding the current song.

### Next song in the list 

-   Again from the stack we will pop the next song and play it.

### Repeat 

-   song.loop(Song.LOOP_CONTINUOUSLY)


>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ---


>We can use switch assigning each case to a gui button


# Gui 

-   create a frame [X]
-   create button [X]
-   allign correctly the buttons []
-   add images to the buttons[]
-   add text


## Buttons

-   play
-   pause
-   repeat
-   next
-   random

## Text 

-   searchbar