package ru.spring.test;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {
    private List<String> rapMusicList = new ArrayList<>();

    @Override
    public List<String> getSongs() {
        return rapMusicList;
    }
}
