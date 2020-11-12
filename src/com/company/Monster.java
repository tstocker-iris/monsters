package com.company;

public class Monster {
    String name;
    int health;


    public static void displayMonster(Monster pMonster) {
        if (pMonster != null) {
            System.out.println("Monster<"+pMonster.name+">");
        }
    }

    public static Monster createMonster(String pName, int pHealth) {
        Monster aMonster = new Monster();
        aMonster.name = pName;
        aMonster.health = pHealth;
        return aMonster;
    }
}
