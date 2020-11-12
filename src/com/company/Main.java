package com.company;

public class Main {

    public static void main(String[] args) {
        Monster bMonster = createMonster("Pikachu", 0);

        displayMonster(bMonster);

        for (int i = 1; i <= 8; i++) {
            Monster tmpMonster = createMonster("Pikachu " + i, i);
            displayMonster(tmpMonster);
        }
    }

    public static void displayMonster(Monster pMonster) {
        System.out.println("Monster<"+pMonster.name+">");
    }

    public static Monster createMonster(String pName, int pHealth) {
        Monster aMonster = new Monster();
        aMonster.name = pName;
        aMonster.health = pHealth;
        return aMonster;
    }
}