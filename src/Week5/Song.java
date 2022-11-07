package Week5;

public class Song 
{

private String song;
private String artistname;
private int playcount;

//Constructor
public Song (String song, String artistname,int playcount)
{
this.song = song;
this.artistname = artistname;
this.playcount = playcount;
}

public Song(String song2, int count) {
}

//print method
public void print()
{
    System.out.print ("Song: " + this.song + "\t");
    System.out.print("Artistname: " + this.artistname + "\t");
    System.out.print("Playcount: " + this.playcount + "\t");
}

public int getnumber() {
    return playcount;
}

public String getsong(){
    return song;
}

public String getartistname() {
return artistname;
}



}




