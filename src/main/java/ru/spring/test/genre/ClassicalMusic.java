package ru.spring.test.genre;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.spring.test.Music;

//@Component
public class ClassicalMusic implements Music {
    @Override
    @Scope("singleton")
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
