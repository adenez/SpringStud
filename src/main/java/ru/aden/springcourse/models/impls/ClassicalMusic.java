package ru.aden.springcourse.models.impls;

import ru.aden.springcourse.models.Music;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }
}
