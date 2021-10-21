package Jukebox;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

//import org.springframework.web.bind.annotation.RequestParam;
@SpringBootApplication
@RestController
public class SpringbootApplication {

    public static void main(String[] args){
        SpringApplication.run(SpringbootApplication.class, args);
    }

    Song Track1 = new Song("Bohemian Rhapsody", "Queen", "Rock");
    Song Track2 = new Song("Heroes", "David Bowie", "Rock");
        Playlist jukebox = new Playlist();
        @CrossOrigin("http://localhost:3000")
        @RequestMapping(value="/contents", method=RequestMethod.GET)
        public String contents() {
            if(jukebox.collection().isEmpty()) {
                jukebox.addSong(Track1);
                jukebox.addSong(Track2);
                return jukebox.collection().toString();
            } else {
                return jukebox.collection().toString();
            }
        }
        @CrossOrigin("http://localhost:3000")
        @PostMapping("/addSong")
        public String addSong(String songTitle, String songArtist, String songGenre) {
            Song song = new Song(songTitle, songArtist, songGenre);
            jukebox.addSong(song);
            return song.toString();
        }

        @CrossOrigin("http://localhost:3000")
        @GetMapping("/titleSearch")
        public String songTitleSearch(String songTitle) {
            if(jukebox.collection().isEmpty()) {
                jukebox.addSong(Track1);
                jukebox.addSong(Track2);
                return jukebox.selectSongsByTitle(songTitle).toString();
            } else {
                return jukebox.selectSongsByTitle(songTitle).toString();
            }
        }
    }





