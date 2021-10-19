package Jukebox;

public class Main {

    public static void main(String[] args){
        Song track1 = new Song("Somebody come get her", "Rae Sremmurd","Hip-Hop");
        Song track2 = new Song("All Star", "Smash Mouth", "Alternative Rock");
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong(track1);
        myPlaylist.addSong(track2);
        myPlaylist.removeSong(track1);
        myPlaylist.getPlaylist();
    }
}
