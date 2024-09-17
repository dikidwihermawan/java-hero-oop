package com.main;

import com.hero.skill.AttackMelee;
import com.hero.skill.AttackRange;
import com.hero.type.Assassin;
import com.hero.type.Mage;

public class Main {
    public static void main(String[] args) {

        Assassin heroAssassin1 = new Assassin("Lancelot");
        Mage heroMage1 = new Mage("lylia");

        heroAssassin1.setAttackSkill(new AttackMelee(50));
        heroMage1.setAttackSkill(new AttackRange(30,10));

        System.out.println();
        heroAssassin1.attack(heroMage1);
        heroMage1.attack(heroAssassin1);

        heroAssassin1.display();
        heroMage1.display();

    }
}
