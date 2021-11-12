package ru.aden.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aden.springcourse.models.Music;
import ru.aden.springcourse.models.MusicPlayer;
import ru.aden.springcourse.models.impls.ClassicalMusic;
import ru.aden.springcourse.models.impls.RockMusic;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = applicationContext.getBean("rockMusic",Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        MusicPlayer musicPlayer2 = new MusicPlayer(applicationContext.getBean("classicalMusic",Music.class));
        musicPlayer2.playMusic();

        applicationContext.close();




        applicationContext.close();
    }
}
