package main.lesson13;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Alien alien1 = new Alien("Roman", "Mars", 10);
        Alien alien2 = new Alien("Roman", "Mars", 3);

        System.out.println(alien1.equals(alien2));
        System.out.println(alien1.toString());;

        List<Alien> listAlien = new ArrayList<>();
        listAlien.add(alien1);
        listAlien.add(alien2);
        listAlien.add(new Alien("Pavel", "Zemla", 1));
        listAlien.add(new Alien("Andrey", "Merkuriq", 9));
        listAlien.add(new Alien("Andrey", "Merkuriq", 9));

        boolean hasDuplicates = false;
        for (int i = 0; i < listAlien.size(); i++) {
            for (int j = i + 1; j < listAlien.size(); j++) {
                if (listAlien.get(i).equals(listAlien.get(j))) {
                    hasDuplicates = true;
                    break;
                }
            }

            if (hasDuplicates == true) {
                break;
            }
        }

        System.out.println("Есть дубликаты?");
        System.out.println("Ответ: " + hasDuplicates);


        SquadManager.demonstrateListCreations();

        List<String> squad = new ArrayList<>();
        squad.add("Роман");
        squad.add("Павел");
        squad.add("Андрей");
        squad.add("Трус Вася");
        squad.add("Трус Петя");
        SquadManager squadManager = new SquadManager();
        squadManager.filterOutCowards(squad);
    }
}
