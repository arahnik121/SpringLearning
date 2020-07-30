package ru.spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;

    //IoC
    @Autowired
    public MusicPlayer(ClassicalMusic music) {
        this.classicalMusic = music;
    }

    public void playMusic() {
        System.out.println("Playing " + classicalMusic.getSong());
    }
}
