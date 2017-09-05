package soundsystem.players;

import soundsystem.disks.CompactDisk;

import java.util.List;

public interface MediaPlayer {
    String play(CompactDisk compactDisk);
    String playAgain();
    void playAll();
}
