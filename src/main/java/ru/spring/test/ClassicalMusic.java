package ru.spring.test;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
public class ClassicalMusic implements Music {
    @Override
    @Scope("singleton")
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
