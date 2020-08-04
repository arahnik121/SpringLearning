package ru.spring.test.genre;

import org.springframework.stereotype.Component;
import ru.spring.test.Music;

//@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
