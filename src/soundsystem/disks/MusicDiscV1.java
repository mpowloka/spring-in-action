package soundsystem.disks;


import org.springframework.stereotype.Component;

import java.util.List;


public class MusicDiscV1 implements CompactDisk {

    private String author;
    private String album;
    private List<String> tracks;


    public MusicDiscV1(String author, String album, List<String> tracks) {
        this.author = author;
        this.album = album;
        this.tracks = tracks;
    }

    @Override
    public String play() {

        System.out.println("Playing: " + author + " - " + album);
        int i=0;
        for(String track : tracks) {
            System.out.println(++i + ": " + track);
        }

        return "Playing: " + author + " - " + album;
    }
}
