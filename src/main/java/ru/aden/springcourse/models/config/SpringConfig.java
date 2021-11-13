package ru.aden.springcourse.models.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.aden.springcourse.models.Computer;
import ru.aden.springcourse.models.MusicPlayer;
import ru.aden.springcourse.models.impls.ClassicalMusic;
import ru.aden.springcourse.models.impls.RockMusic;

@Configuration
@PropertySource("musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(rockMusic(), classicalMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }
}
