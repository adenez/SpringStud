package ru.aden.springcourse.models.impls;

import ru.aden.springcourse.models.Music;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rapsody";
    }

    public void doInit(){
        System.out.println("Starting init-method.");
        System.out.println("=====================");
    }

    public void doDestroy(){
        System.out.println("========================");
        System.out.println("Starting destroy-method.");
    }
}
