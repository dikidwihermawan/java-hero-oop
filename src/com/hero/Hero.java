package com.hero;

import com.hero.skill.iAttackSkill;

public abstract class Hero {

    private String name;
    private iAttackSkill attackSkill;

    public Hero(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setAttackSkill(iAttackSkill attackSkill){
        this.attackSkill = attackSkill;
    }

    public void attack(Hero enemy){
        System.out.println(this.name + " is attacking");
        this.attackSkill.attack(enemy);
    }

    public void display(){
        System.out.println("Name: " + this.name);
    }
    
}
