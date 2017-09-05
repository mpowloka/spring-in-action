package soundsystem;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import soundsystem.config.MainConfig;
import soundsystem.disks.CompactDisk;
import soundsystem.players.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=MainConfig.class)
public class SoundSystemJavaTest {


    //these components are defined in DiscsConfig.class
    @Autowired
    private CompactDisk etherDisc;
    @Autowired
    private CompactDisk siameseDreamDisc;
    @Autowired
    private CompactDisk outerEdgesDisc;

    // This component is created using ComponentScan annotation, it is marked as Component
    // And it's dependencies are inserted using Autowire feature
    @Autowired
    private MediaPlayer cDPlayerV1;

    // This component is declared in PlayersConfig.class
    @Autowired
    private MediaPlayer cDPlayerV2;

    @Test
    public void ether_NotNull () {
        assertNotNull(etherDisc);
    }
    @Test
    public void siameseDream_NotNull() {
        assertNotNull(siameseDreamDisc);
    }
    @Test
    public void outerEdges_NotNull() {
        assertNotNull(outerEdgesDisc);
    }

    @Test
    public void cDPlayerV1_NotNull() {
        assertNotNull(cDPlayerV1);
    }

    @Test
    public void cDPlayerV1_playAll_NoException() throws Exception {
        cDPlayerV1.playAll();
        cDPlayerV1.play(etherDisc);
        cDPlayerV1.playAgain();
    }
    @Test
    public void cDPlayerV2_playAll_NoException() throws Exception {
        cDPlayerV2.playAll();
        cDPlayerV2.play(outerEdgesDisc);
        cDPlayerV2.playAgain();
    }
}
