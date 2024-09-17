package com.hero.type;

import com.hero.Hero;

public class Fighter extends Hero implements Type {

    private double baseHp = 1500;
    private double baseAttack = 120;
    private double baseArmor = 100;
    private double baseMana = 100;

    public Fighter(String name) {
        super(name);
    }

    public void skill1() {
    }

    public void skill2() {
    }

    public void skill3() {
    }

    public void skill4() {
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

    public void attack() {
    }

    public void defend() {
    }

}
