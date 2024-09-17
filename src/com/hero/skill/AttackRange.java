package com.hero.skill;

import com.hero.Hero;

public class AttackRange implements iAttackSkill {
    
    private double power, range;

    public AttackRange(double power, double range){
        this.power = power;
        this.range = range;
    }

    public void attack(Hero enemy){
        System.out.println(enemy.getName() + " was attacked with power : " + this.power + " at range : " + this.range);
    }


}
