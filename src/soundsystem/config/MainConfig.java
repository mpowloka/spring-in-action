package soundsystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import soundsystem.disks.CompactDisk;
import soundsystem.players.MediaPlayer;

@Configuration
@ComponentScan(basePackages = {"disks", "players"})
// Identical component scan procedures
@ComponentScan(basePackageClasses = {CompactDisk.class, MediaPlayer.class})
@Import({DisksConfig.class, PlayersConfig.class})
public class MainConfig {
}
