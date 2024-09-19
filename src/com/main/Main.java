package com.main;


import java.util.Scanner;

import com.hero.skill.AttackMelee;
import com.hero.skill.AttackRange;
import com.hero.type.Assassin;
import com.hero.type.Mage;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String pilihan;
        String namaHero = "";
        String typeHero = "";
        String [] typeHeroArr = new String[]{
            "Assassin", "Fighter", "Mage", "Marksman", "Support", "Tank"
        };
        String attackHero = "";
        String [] attackHeroArr = new String[]{
            "Melee", "Range"
        };

        String roleHero = "";
        String [] roleHeroArr = new String[]{
            "Jungler", "Midlaner", "Goldlaner", "Explaner", "Roamer"
        };

        while(true){        
        System.out.println("\nSelamat datang di kelas Hero");
        System.out.println("\n1. Buat hero baru");
        System.out.println("2. Cek daftar hero");
        System.out.print("\nMasukkan input anda: ");
        pilihan = scanner.nextLine();
        if(pilihan.equalsIgnoreCase("1")){
            System.out.print("\nMasukkan nama hero: ");
            namaHero = scanner.nextLine();
            System.out.println();
            
            for(int i = 0; i < typeHeroArr.length; i++){
                System.out.println(i+1 + ". " + typeHeroArr[i]);
            }
            System.out.print("Masukkan type hero: ");
            typeHero = scanner.nextLine();
            System.out.println();
            
            for(int i = 0; i < attackHeroArr.length; i++){
                System.out.println(i+1 + ". " + attackHeroArr[i]);
            }
            System.out.print("Masukkan type serangan: ");
            attackHero = scanner.nextLine();
            System.out.println();
   
            for(int i = 0; i < roleHeroArr.length; i++){
                System.out.println(i+1 + ". " + roleHeroArr[i]);
            }
            System.out.print("Masukkan role hero: ");
            roleHero = scanner.nextLine();
            System.out.println();
        }



        System.out.println("\nNama Hero: "+ namaHero);
        System.out.println("Type Hero: "+ typeHeroArr[Integer.valueOf(typeHero) - 1]);
        System.out.println("Attack Hero: "+ attackHeroArr[Integer.valueOf(attackHero) - 1]);
        System.out.println("Role Hero: "+ roleHeroArr[Integer.valueOf(roleHero) - 1]);

        }
        
        // Assassin heroAssassin1 = new Assassin("Lancelot");
        // Mage heroMage1 = new Mage("lylia");

        // heroAssassin1.setAttackSkill(new AttackMelee(50));
        // heroMage1.setAttackSkill(new AttackRange(30,10));

        // System.out.println();
        // heroAssassin1.attack(heroMage1);
        // heroMage1.attack(heroAssassin1);

        // heroAssassin1.display();
        // heroMage1.display();

    }
}
