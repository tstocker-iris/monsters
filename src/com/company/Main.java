package com.company;

public class Main {

    public static void main(String[] args) {
        //Monster bMonster = createMonster("Pikachu", 0);
        Army bArmy = createArmy();

        //displayMonster(bMonster);

        for (int i = 1; i <= 50; i++) {
            Monster tmpMonster = createMonster("Pikachu " + i, i);
            //displayMonster(tmpMonster);
            addMonster(bArmy, tmpMonster);
        }

        displayArmy(bArmy);
    }

    public static void displayArmy(Army army) {
        for (int i = 0; i < army.top; i++) {
            displayMonster(army.monsters[i]);
        }
    }

    public static void addMonster(Army army, Monster monster)
    {
        if (army.top >= army.monsters.length) {
            Monster[] tmpMonsters = new Monster[army.top + 1];

            for (int i = 0; i < army.monsters.length; i++) {
                tmpMonsters[i] = army.monsters[i];
            }

            army.monsters = tmpMonsters;
        }

        army.monsters[army.top] = monster;
        army.top++;
    }

    public static Army createArmy() {
        Army army = new Army();

        army.monsters = new Monster[4];
        army.top = 0;

        return army;
    }

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