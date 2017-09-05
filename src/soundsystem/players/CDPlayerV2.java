package soundsystem.players;

import org.springframework.stereotype.Component;
import soundsystem.disks.CompactDisk;

import java.util.List;


public class CDPlayerV2 implements MediaPlayer{

    private List<CompactDisk> disks;
    private CompactDisk lastPlayed;

    @Override
    public String play(CompactDisk compactDisk) {
        lastPlayed=compactDisk;
        return compactDisk.play();
    }

    @Override
    public String playAgain() {
        if(null == lastPlayed) {
            System.out.println("No CD has been played so far.");
            return null;
        }
        return lastPlayed.play();
    }

    @Override
    public void playAll() {
        for (CompactDisk cd : disks) {
            cd.play();
            lastPlayed=cd;
        }
    }

    public void setDisks(List<CompactDisk> disks) {
        this.disks = disks;
    }
}
