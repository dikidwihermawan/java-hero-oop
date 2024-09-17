package com.hero.skill;

import com.hero.Hero;

public class AttackMelee implements iAttackSkill {
    
    private double power;

    public AttackMelee(double power){
        this.power = power;
    }

    public void attack(Hero enemy){
        System.out.println(enemy.getName() + " was attacked with power :  " + this.power);
    }

}
