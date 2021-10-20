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
    Song song;

    @Given("I have a song to add")
    public void iHaveASongToAdd() {
    }

    @When("I enter the song details")
    public void iEnterTheSongDetails() {
        song = new Song("Thong Song", "Sisgo", "Hip-Hop");
    }

    @Then("Song should be created")
    public void songShouldBeCreated() {
        assertEquals("Thong Song", song.getSongTitle(), "Song was not correct");
    }

    //Playlist Tests

    Song playlistSong = new Song("In Too Deep", "Sum41", "Punk-Rock");
    Playlist myPlaylist = new Playlist();

    @Given("I have a song to add to a playlist")
    public void iHaveASongToAddToAPlaylist() {
    }

    @And("I have a playlist")
    public void iHaveAPlaylist() {
    }

    @When("I enter the song into the playlist")
    public void iEnterTheSongIntoThePlaylist() {
        myPlaylist.addSong(playlistSong);
    }

    @Then("Song should be added to playlist")
    public void songShouldBeAddedToPlaylist() {
        assertEquals("True", myPlaylist.contains(playlistSong), "Song is not in playlist");
    }
}
