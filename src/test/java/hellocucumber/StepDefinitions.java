package hellocucumber;

import Jukebox.Playlist;
import Jukebox.Song;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    //Song Tests
    @Given("I have a song to add")
    public void iHaveASongToAdd() {
    }

    @When("I enter the song details")
    public String iEnterTheSongDetails() {
        String SongTitle = "Thong Song";
        String Artist = "Sisqo";
        String Genre = "Hip-Hop";
        Song song = new Song(SongTitle, Artist, Genre);
        return song.getSongTitle();
    }

    @Then("Song should be created")
    public void songShouldBeCreated() {
        String ourSong = iEnterTheSongDetails();
        assertEquals("Thong Song", ourSong, "Song was not correct");
    }

    //Playlist Tests
    Song song = new Song("In Too Deep", "Sum41", "Punk-Rock");
    Playlist myPlaylist = new Playlist();

    @Given("I have a song to add to a playlist")
    public void iHaveASongToAddToAPlaylist() {
    }

    @And("I have a playlist")
    public void iHaveAPlaylist() {
    }

    @When("I enter the song into the playlist")
    public void iEnterTheSongIntoThePlaylist() {
        myPlaylist.addSong(song);
    }

    @Then("Song should be added to playlist")
    public void songShouldBeAddedToPlaylist() {
        assertEquals("True", myPlaylist.contains(song), "Song is not in playlist");
    }
}
