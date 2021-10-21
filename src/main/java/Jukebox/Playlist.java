package Jukebox;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Playlist {
    private Song song;
    private List<Song> songList= new ArrayList<>();

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
    public Optional<Song> selectSongsByTitle(String songTitle){
        return this.songList.stream().filter(song -> song.getSongTitle().equals(songTitle)).findFirst();
    }
    public List<Song> collection(){
        return this.songList;
}

    public String toString(){
        String json = new Gson().toJson(songList);
        return json;
    }
}
