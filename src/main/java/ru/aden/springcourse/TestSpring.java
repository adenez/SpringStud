package ru.aden.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aden.springcourse.models.Music;
import ru.aden.springcourse.models.MusicPlayer;
import ru.aden.springcourse.models.impls.ClassicalMusic;
import ru.aden.springcourse.models.impls.RockMusic;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer firstMusicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(firstMusicPlayer == secondMusicPlayer);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(100);

        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());

        applicationContext.close();
    }
}
