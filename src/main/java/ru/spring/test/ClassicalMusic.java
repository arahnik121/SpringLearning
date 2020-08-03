package ru.spring.test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> classicalMusicList = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        classicalMusicList.add("Hungarian Rhapsody");
        classicalMusicList.add("Symphony no. 5 in C Minor, op. 67");
        classicalMusicList.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSongs() {
        return classicalMusicList;
    }
}
