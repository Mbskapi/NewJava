public class Song {
    private String artist;

    private String title;

    public Song(String title, String artist) {
        this.artist = artist;
        this.title = title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public void setArtist(String artist) {
        this.artist = artist;


}


    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}


