package soundsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soundsystem.disks.CompactDisk;
import soundsystem.disks.MusicDiscV1;
import soundsystem.disks.MusicDiscV2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class DisksConfig {

    @Bean
    public CompactDisk etherDisc() {
        return new MusicDiscV1("Make them Suffer", "Summoning Storms",
                Arrays.asList("Ether", "Blood Moon", "Actually", "I don't", "know tracks", "from this CD"));
    }

    @Bean(name="siameseDreamDisc")
    public CompactDisk thisMethodNameIsIrrelevant() {
        return new MusicDiscV1("The Smashing Pumpkins", "Siamese Dream",
                Arrays.asList("Cherub Rock", "Today", "Disarm", "Silverfuck", "Geek in the USA", "Quiet"));
    }

    @Bean
    public CompactDisk outerEdgesDisc() {
        MusicDiscV2 musicDiscV2 = new MusicDiscV2();
        musicDiscV2.setAlbum("Outer Edges");
        musicDiscV2.setAuthor("Noisia");
        musicDiscV2.setTracks(Arrays.asList("Approach", "Anomaly", "Collider", "Voo Doo", "Mantra", "Into Dust", "Sinkhole", "Get Deaded"));
        return musicDiscV2;
    }

    @Bean
    public List<CompactDisk> discs(CompactDisk etherDisc, CompactDisk siameseDreamDisc) {
        // Beans in config can be called as arguments or they can be called via methods
        // When method called Spring intercepts it and returns existing bean (unless singleton mode is off)
        return Arrays.asList( etherDisc, siameseDreamDisc, outerEdgesDisc() );
    }

}
