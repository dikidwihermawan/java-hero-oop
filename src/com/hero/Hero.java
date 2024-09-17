package com.hero;

public abstract class Hero {

    private String name;

    public String getName() {
        return name;
    }

    public Hero(String name) {
        this.name = name;
    }

    public void attack(Hero enemy) {
        System.out.println(this.name + " was attacked " + enemy.name);
    }

    public void display() {
        System.out.println("Hero :\t" + this.name);
    }

}
