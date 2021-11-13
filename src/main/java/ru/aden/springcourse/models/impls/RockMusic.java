package ru.aden.springcourse.models.impls;

import ru.aden.springcourse.models.Music;


public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind of Change";
    }
}
