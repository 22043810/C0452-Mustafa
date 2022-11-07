package Week5;
import java.util.ArrayList;

import helpers.InputReader;


public class CW1
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        Song A1 = new Song ("Easy On Me","Adele",  314474560);
        Song A2 = new Song ("Set Fire To The Rain","Adele", 724013122);
        Song A3 = new Song ("Rolling In The Deep", "Adele", 2109190457);
        Song A4 = new Song ("Love In The Dark", "Adele", 32920629);
        Song A5 = new Song ("When We Were Young", "Adele", 32565591);
        Song A6 = new Song ("Hello", "Adele", 301919556);
        Song A7 = new Song ("Someone Like You", "Adele", 1924224127);
        Song A8 = new Song ("Skyfall", "Adele", 509105041);
        Song A9 = new Song ("Water Under The Bridge", "Adele", 154492);
        Song A10 = new Song ("I Drink Wine", "Adele", 13021566 );
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(A1);
        songs.add(A2);
        songs.add(A3);
        songs.add(A4);
        songs.add(A5);
        songs.add(A6);
        songs.add(A7);
        songs.add(A8);
        songs.add(A9);
        songs.add(A10);

        // Print a list of all the songs stored
        System.out.println(CONSOLE_CLEAR);
        String opening = InputReader.getString ("\tWould you like to see a list of songs? yes/no ");
        opening.toLowerCase();
        if (opening.equals("y") || opening.equals("yes"))
        
        {
            for (Song song : songs)
            { song.print(); }
        }

   // Print a List of songs over a given number of plays
    
   String filter = InputReader.getString("Do you wish to filter the songs by playcount? yes/no ").toLowerCase();
    
   if (filter.equals("y") || filter.equals("yes"))

   {
       int minimumnumber = InputReader.getInt("Please type your minimum playcount number");
       for (Song song : songs)

       {
           if (song.getnumber() >= minimumnumber)
           {
               song.print();
           }
       }

   }

        // Add a new song to the list of songs
        String addition = InputReader.getString("Would you like to Add Song? ").toLowerCase();
        if (addition.equals("y")  ||  addition.equals("yes"));

        {
            String music = InputReader.getString("Please type the name of the song");
            int count = InputReader.getInt("Kindly enter the playcount ");

            Song newmusic = new Song(music, count);
            songs.add(newmusic);

            for (Song song: songs)
            {
                song.print();
            }
        }


        //  Remove a song from the list of songs
        String songname = InputReader.getString("\tDo you wish to remove a song? ").toLowerCase();
        if (songname.equals("y")  || songname.equals("yes"))

        {
            String remove = InputReader.getString("\tplease write name of the song you would like to remove ");
            remove.toLowerCase();
            for (Song song : songs)
            {
      
                if(remove.equals(song.getsong().toLowerCase()))
                {
                     songs.remove(song);
                    System.out.println(" song was found and successfully removed. ");
                               
                }
                else{
                    System.out.println(" song could not be found.");
                    }
                    
            }    
            
        }
    
        for (Song song : songs)
        { 
           song.print();
        }
        
        
    }
}

 
