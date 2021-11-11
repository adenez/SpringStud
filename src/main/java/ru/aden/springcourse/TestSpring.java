package ru.aden.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aden.springcourse.models.Music;
import ru.aden.springcourse.models.MusicPlayer;
import ru.aden.springcourse.models.impls.ClassicalMusic;
import ru.aden.springcourse.models.impls.RockMusic;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        applicationContext.close();
    }
}
