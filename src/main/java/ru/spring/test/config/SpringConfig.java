package ru.spring.test.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.spring.test.Computer;
import ru.spring.test.Music;
import ru.spring.test.MusicPlayer;
import ru.spring.test.genre.ClassicalMusic;
import ru.spring.test.genre.RapMusic;
import ru.spring.test.genre.RockMusic;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("ru.spring.test")
@PropertySource("classpath:musicPlayer.properties")
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
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), rapMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }
}
