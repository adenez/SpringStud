package ru.aden.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.aden.springcourse.models.Computer;
import ru.aden.springcourse.models.Music;
import ru.aden.springcourse.models.MusicPlayer;
import ru.aden.springcourse.models.impls.ClassicalMusic;
import ru.aden.springcourse.models.impls.RockMusic;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = applicationContext.getBean("computer", Computer.class);
        System.out.println(computer);


        applicationContext.close();
    }
}
