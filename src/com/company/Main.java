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
        // Boucle de parcours du tableau de monstre de l'armée
        for (int i = 0; i < army.top; i++) {
            // On affiche le monstre parcouru
            displayMonster(army.monsters[i]);
        }
    }

    public static void addMonster(Army army, Monster monster)
    {
        /* On vérifie si l'indice auquel on va insérer notre monstre est bien inférieur à la taille du tableau
        (ou qu'il n'est pas supérieur ou égal, c'est la même chose) */
        if (army.top >= army.monsters.length) {
            // S'il est supérieur à la taille de notre tableau, il faut augmenter la taille de notre tableau
            // Sinon l'éxecution nous enverra une exception (ArrayIndexOutOfBoundException)
            // Donc on recréer un tableau temporaire en y ajoutant un élément à la taille du tableau de base
            Monster[] tmpMonsters = new Monster[army.top + 1];

            // Puis on copie tous les éléments du premier tableau vers notre nouveau tableau
            for (int i = 0; i < army.monsters.length; i++) {
                tmpMonsters[i] = army.monsters[i];
            }

            /* Enfin on change la référence du tableau de monstre de notre armée avec le tableau nouvellement créé
            (ayant donc une case supplémentaire pour stocker un monstre */
            army.monsters = tmpMonsters;
        }

        // Finalement nous ajoutons notre monstre à l'index disponible (army.top)
        army.monsters[army.top] = monster;
        // Puis nous incrémentons l'index disponible (index dispo = index dispo + 1) puisqu'il est pris
        army.top++;
    }

    public static Army createArmy() {
        // Création de l'objet Army
        Army army = new Army();

        // Initialisation d'un tableau de monstre à 4 éléments
        army.monsters = new Monster[4];
        // Initialisation du premier index disponible à 0 puisque notre tableau de monstre est vide.
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