package ru.aden.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aden.springcourse.models.Computer;
import ru.aden.springcourse.models.Music;
import ru.aden.springcourse.models.MusicPlayer;
import ru.aden.springcourse.models.config.SpringConfig;
import ru.aden.springcourse.models.impls.ClassicalMusic;
import ru.aden.springcourse.models.impls.RockMusic;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);

        System.out.println(classicalMusic1 == classicalMusic2);


        context.close();
    }
}
