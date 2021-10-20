package Jukebox;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private Song song;
    private List<Song> songList= new ArrayList<>();


    public void getPlaylist() {
        for (Song song: songList){
            String a = song.getSongTitle();
            String b = song.getArtist();
            String c = "Song Name: " + a + ", Artist: " + b;
            System.out.println(c);
        }
    }

    public void addSong(Song song){
        this.songList.add(song);
    }
    public void removeSong(Song song){
        this.songList.remove(song);

    }
public String contains(Song song){
        if (this.songList.contains(song)==true){
            return "True";}
    else {

        return "False";
        }
    }

}
