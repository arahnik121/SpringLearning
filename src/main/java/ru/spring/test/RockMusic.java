package ru.spring.test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockMusicList = new ArrayList<>();

    {
        rockMusicList.add("Wind cries Mary");
        rockMusicList.add("Paint it black");
        rockMusicList.add("Can't seem to make you mine");
    }

    @Override
    public List<String> getSongs() {
        return rockMusicList;
    }
}
