package com.main;

import com.hero.type.Assassin;
import com.hero.type.Mage;

public class Main {
    public static void main(String[] args) {

        Assassin heroAssassin1 = new Assassin("Lancelot");
        Mage heroMage1 = new Mage("odette");

        System.out.println();

        heroAssassin1.attack(heroMage1);
        System.out.println(heroAssassin1.getBaseHp());
        heroAssassin1.display();

    }
}
