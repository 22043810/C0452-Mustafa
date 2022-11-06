package Week5;
import java.util.ArrayList;
import helpers.InputReader;

public class CW1
 {
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        Song easyonme = new Song ("Easy On Me","Adele", 2021, 314474560);
        Song setfiretotherain = new Song ("Set Fire To The Rain","Adele",2011, 724013122);
        Song rollinginthedeep = new Song ("Rolling In The Deep", "Adele",2010, 2109190457);
        Song loveinthedark = new Song ("Love In The Dark", "Adele",2019, 32920629);
        Song whenwewereyoung= new Song ("When We Were Young", "Adele",2015, 32565591);
        Song hello = new Song ("Hello", "Adele",2015, 301919556);
        Song someonelikeyou = new Song ("Someone Like You", "Adele",2011, 1924224127);
        Song skyfall = new Song ("Skyfall", "Adele",2012, 509105041);
        Song waterunderthebridge = new Song ("Water Under The Bridge", "Adele",2017, 154492);
        Song idrinkwine= new Song ("I Drink Wine", "Adele",2022, 13021566 );
        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(easyonme);
        songs.add(setfiretotherain);
        songs.add(rollinginthedeep);
        songs.add(loveinthedark);
        songs.add(whenwewereyoung);
        songs.add(hello);
        songs.add(someonelikeyou);
        songs.add(skyfall);
        songs.add(waterunderthebridge);
        songs.add(idrinkwine);


       //PrintList(songs); 
        System.out.println(CONSOLE_CLEAR);
        String opening = InputReader.getString ("\tWould you like to see a list of songs? yes/no ");
        opening.toLowerCase();
        if (opening.equals("y") || opening.equals("yes"))
{
    for (Song song : songs)
    { song.print(); }
}

String remove = InputReader.getString("\tto remove a song simply type the name of a song:");
remove.toLowerCase();
for (Song song : songs)
{
    if(song.getname().toLowerCase().contains(remove))
    {
        System.out.println(remove + " " + song.getname());
        songs.remove(song);
        System.out.println(" song was found and successfully removed. ");
        printList(songs);
    }
else{
System.out.println(" song could not be found.");
}
}

    }
    
    public static void printList(ArrayList<Song> songs)
{
    for (Song song : songs)
   
    { song.print();}
       System.out.println("Mustafa's CW1");
    }
    public static void PrintListByCount(ArrayList<Song> localSongs)
    {
                int howLong = localSongs.size();
        for (int highest= 0 ; highest< howLong; highest++ )
    {
            Song temporary = new Song("", ",0", highest, highest);
            int highestNumber=0;
            for (Song song : localSongs)
            {
                if (highest < song.getviews())
                {
                    highestNumber = song.getviews();
                    temporary = song;
                }
            }
            temporary.print();
            localSongs.remove(temporary);
        }
    
    }
}
