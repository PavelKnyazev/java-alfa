package main.lesson7.arena;

import main.lesson7.arena.heroes.Archer;
import main.lesson7.arena.heroes.Hero;
import main.lesson7.arena.heroes.Knight;
import main.lesson7.arena.heroes.Mage;

public class App {
    public static void main(String[] args) {
        Archer archer = new Archer();
        Knight knight = new Knight();
        Mage mage = new Mage();

        Hero.printHeroesCreated();
        archer.rest();


        Hero[] heroes = {new Archer(), new Knight(), new Mage()};
        for (Hero hero : heroes) {
            hero.printInfo();
            hero.attack();
        }
    }
}
