package CdPlayer;

import org.springframework.stereotype.Component;

@Component
public class MusicDisc
        implements CompactDisc {

    private String artist;
    private String title;

    public MusicDisc() {};

    public MusicDisc(String artist, String title) {
        this.setArtist(artist);
        this.setTitle(title);
    }

    @Override
    public void play() {
        System.out.println("Playing: " + artist + " - " + title);
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
