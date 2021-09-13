package com.ripalay.hw_lesson_81.ui.models;

public class HeroModel {
    private String image;
    private String life;
    private String name;

    public HeroModel(String image, String life, String name) {
        this.image = image;
        this.life = life;
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public String getLife() {
        return life;
    }

    public String getName() {
        return name;
    }
}
