package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Jukebox.Song;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
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

    @Then("{string} should be created")
    public void songShouldBeCreated(String newSong) {
        assertEquals("Thong Song", newSong, "Song was not correct");
    }
}
