package soundsystem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soundsystem.disks.CompactDisk;
import soundsystem.players.CDPlayerV2;
import soundsystem.players.MediaPlayer;

import java.util.List;

@Configuration
public class PlayersConfig {

    @Bean
    public MediaPlayer cDPlayerV2 (List<CompactDisk> discs) {
        CDPlayerV2 cdPlayerV2 = new CDPlayerV2();
        cdPlayerV2.setDisks(discs);
        return cdPlayerV2;
    }

}
