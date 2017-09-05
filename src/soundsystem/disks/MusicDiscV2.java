package soundsystem.disks;

import java.util.List;

public class MusicDiscV2 implements CompactDisk {

    private String author;
    private String album;
    private List<String> tracks;

    @Override
    public String play() {

        System.out.println("Playing: " + author + " - " + album);
        int i=0;
        for(String track : tracks) {
            System.out.println(++i + ": " + track);
        }
        return "Playing: " + author + " - " + album;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }


}
