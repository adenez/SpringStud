package ru.aden.springcourse.models.impls;

import ru.aden.springcourse.models.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }

    @PostConstruct
    public void doInit(){
        System.out.println("Doing init-method");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("Doing destroy-method");
    }

}
