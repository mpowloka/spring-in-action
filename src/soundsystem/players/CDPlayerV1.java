package soundsystem.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import soundsystem.disks.CompactDisk;

import java.util.List;

@Component("cDPlayerV1")
public class CDPlayerV1 implements MediaPlayer {

    private List<CompactDisk> disks;
    private CompactDisk lastPlayed;

    @Autowired
    public CDPlayerV1(List<CompactDisk> disks) {
        this.disks = disks;
    }

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
}
