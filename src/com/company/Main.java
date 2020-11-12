package com.company;

public class Main {

    public static void main(String[] args) {
        //Monster bMonster = createMonster("Pikachu", 0);
        Army bArmy = Army.createArmy();

        //displayMonster(bMonster);

        for (int i = 1; i <= 50; i++) {
            Monster tmpMonster = Monster.createMonster("Pikachu " + i, i);
            //displayMonster(tmpMonster);
            Army.addMonster(bArmy, tmpMonster);
        }

        Army.displayArmy(bArmy);
    }

}