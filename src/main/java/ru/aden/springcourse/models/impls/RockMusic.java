package ru.aden.springcourse.models.impls;

import org.springframework.stereotype.Component;
import ru.aden.springcourse.models.Music;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind of Change";
    }
}
