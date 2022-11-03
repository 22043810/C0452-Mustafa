import java.util.ArrayList;


public class Song 
{
private String song;
private String artistname;
private int date;
private int views;


public Song(String song, String artistname, int date, int views)

{
this.song = song;
this.artistname = artistname;
this.date = date;
this.views = views;
}

public void print()
{
    System.out.println ("song: " + this.song + "\tartistname:" + this.artistname + "\tdate:" + this.date + "\tviews:"  + this.views);

}
public String getsong()

{
return song;
}

public int getviews()
{return views;
}

}




