package ru.spring.test.genre;

import ru.spring.test.Music;

import java.util.ArrayList;
import java.util.List;

public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Rap God";
    }
}
