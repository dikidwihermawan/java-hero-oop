package com.hero.type;

import com.hero.Hero;
import com.hero.skill.iAttackSkill;

public class Marksman extends Hero {

    private double baseHp = 1000;
    private double baseAttack = 90;
    private double baseArmor = 100;
    private double baseMana = 100;

    private iAttackSkill attackSkill;

    public Marksman(String name) {
        super(name);
    }

    public double getBaseHp() {
        return baseHp;
    }

    public void setBaseHp(double baseHp) {
        this.baseHp += baseHp;
    }

    public double getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(double baseAttack) {
        this.baseAttack += baseAttack;
    }

    public double getBaseArmor() {
        return baseArmor;
    }

    public void setBaseArmor(double baseArmor) {
        this.baseArmor += baseArmor;
    }

    public double getBaseMana() {
        return baseMana;
    }

    public void setBaseMana(double baseMana) {
        this.baseMana += baseMana;
    }

}
