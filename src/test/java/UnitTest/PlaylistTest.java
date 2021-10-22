package UnitTest;

import Jukebox.Playlist;
import Jukebox.Song;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PlaylistTest {
    Song track1 = new Song("Somebody come get her", "Rae Sremmurd","Hip-Hop");
    Song track2 = new Song("All Star", "Smash Mouth", "Alternative Rock");
    Song track3 = new Song("Darude", "Sandstorm", "Techno");
    Playlist playlist = new Playlist();

@Test
    public void addSongTest(){
    playlist.addSong(track1);
    assertEquals("True", playlist.contains(track1), "Song is not contained in playlist");
}

@Test
    public void removeSongTest(){
    playlist.addSong(track1);
    playlist.addSong(track2);
    playlist.addSong(track3);
    playlist.removeSong(track1);
    assertEquals("False",playlist.contains(track1),"This song is on the playlist");
}

@Test
    public void containsTest(){
    playlist.addSong(track1);
    assertEquals("True", playlist.contains(track1), "This song is not contained in playlist");
}
@Test
    public void selectSongsByTitleTest(){
    playlist.addSong(track1);
    assertEquals("Optional[Song{SongTitle='Somebody come get her', Artist='Rae Sremmurd', Genre='Hip-Hop'}]", playlist.selectSongsByTitle("Somebody come get her"),"The song was not selected");
}
@Test
    public void toStringPlaylistTest(){
    playlist.addSong(track1);
    assertEquals("[{\"SongTitle\":\"Somebody come get her\",\"Artist\":\"Rae Sremmurd\",\"Genre\":\"Hip-Hop\"}]", playlist.toString(), "Did not return a json file");
}


}


