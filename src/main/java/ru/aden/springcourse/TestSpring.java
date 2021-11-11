package ru.aden.springcourse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean testBean = applicationContext.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());

        applicationContext.close();
    }
}
