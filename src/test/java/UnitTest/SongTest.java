package UnitTest;

import Jukebox.Song;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {
    Song track1 = new Song("Somebody come get her", "Rae Sremmurd","Hip-Hop");
    Song track2 = new Song("All Star", "Smash Mouth", "Alternative Rock");

    @Test
    public void testGetSongTitle(){
        assertEquals("Somebody come get her", track1.getSongTitle(),"The song title was not as expected");
    }

    @Test
    public void testGetArtist(){
        assertEquals("Rae Sremmurd", track1.getArtist(), "The artist was not the same as expected");
    }

    @Test
    public void testGetGenre(){
        assertEquals("Hip-Hop", track1.getGenre(), "The genre was not the same as expected");
    }

    @Test
    public void testSetSongTitle(){
        track1.setSongTitle("Somebody come get her (edit)");
        assertEquals("Somebody come get her (edit)", track1.getSongTitle(), "The title remained unchanged");
    }
    @Test
    public void testSetArtist(){
        track1.setArtist("Nobody");
        assertEquals("Nobody",track1.getArtist(), "The artist remained unchanged");
    }
    @Test
    public void testSetGenre(){
        track1.setGenre("Reggae");
        assertEquals("Reggae", track1.getGenre(), "The genre remained unchanged");
    }

    @Test
    public void testToString(){
        assertEquals("Song{" +
                "SongTitle='" + track1.getSongTitle() + '\'' +
                ", Artist='" + track1.getArtist() + '\'' +
                ", Genre='" + track1.getGenre() + '\'' +
                '}', track1.toString(),"This is not correct");
    }

}
