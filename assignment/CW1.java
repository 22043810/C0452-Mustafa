public class CW1 
import java.util.ArrayList;
import java.util.Iterator;
import helpers.InputReader;

public class CW1

 {
    public static void main(String[] args)
    {
        Song Adele = new Song ("Adele","Easy On Me", 314474560);
        Song Bob = new Song ("Adele","Set Fire To The Rain", 724013122);
        Song Carlo = new Song ("Adele", "Rolling In The Deep", 2109190457);
        Song Adam = new Song ("Adele", "Love In The Dark", 32920629 );
        Song Bruno= new Song ("Adele", "When We Were Young", 32565591);
        Song Carl = new Song ("Adele", "Hello", 3019195566);
        Song Adolf = new Song ("Adele", "Someone Like You", 1924224127);
        Song Kurt = new Song ("Adele", "Skyfall", 509105041);
        Song Mofasa = new Song ("Adele", "Water Under the Bridge", 154492);
        Song Justin= new Song ("Adele", "I Drink Wine", 13021566 );
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(Adele);
        //PrintList(songs);
        System.out.println(CONSOLE_CLEAR);
        String opening = InputReader.getString ("\tWould you like to see a list of songs? yes/no ");
        opening.toLowerCase();
        if (opening.equals("y") || opening.equals("yes"))
{
    for (Song song : songs)
    { song.print(); }
}
String views = InputReader.getString("\twould you like to see songs listed by its views? ");
views.toLowerCase();
if (views.equals("y")  || views.equals("yes"))
{  
    System.out.println("\t Songs Listed By Views: ");
    PrintListByCount(songs);
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
        PrintList(songs);
    }
else
System.out.println(" song could not be found.");
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
        for (int highest= 0 ; highest< howLong; highgest++)
    {
            Song temporary = new Song("", ",0");
            int highhestNumber=0;
            for (Song song : localSongs)
            {
                if (highestNumber < song.getviews())
                {
                    highestNumber = song.getviews();
                    temporary = song;
                }
            }
            temporary.print();
            localsongs.remove(temporary);
        }
    
    }
}
