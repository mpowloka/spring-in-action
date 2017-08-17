package CdPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CdPlayer
        implements MediaPlayer {


    @Autowired
    @Override
    public void play(CompactDisc cd) {
       cd.play();
    }
}
