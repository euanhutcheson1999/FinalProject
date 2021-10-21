package Jukebox;

public class Song {

    private String SongTitle;
    private String Artist;
    private String Genre;

    public Song(String songTitle, String artist, String genre) {
        SongTitle = songTitle;
        Artist = artist;
        Genre = genre;
    }

    public String getSongTitle() {
        return SongTitle;
    }

    public String getArtist() {
        return Artist;
    }

    public String getGenre() {
        return Genre;
    }

    public void setSongTitle(String songTitle) {
        SongTitle = songTitle;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }


    @Override
    public String toString() {
        return "Song{" +
                "SongTitle='" + SongTitle + '\'' +
                ", Artist='" + Artist + '\'' +
                ", Genre='" + Genre + '\'' +
                '}';
    }
}

