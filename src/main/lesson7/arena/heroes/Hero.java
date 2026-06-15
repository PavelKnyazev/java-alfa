package main.lesson7.arena.heroes;

public class Hero {

    private static int heroesCreated; // количество созданных героев

    private String name; // имя героя
    private int level; // уровень героя
    private int health; // текущее здоровье
    private final static int MAX_LEVEL = 100; // максимально возможный уровень героя: 100

    public Hero() {
        heroesCreated++;
    }

    public final void rest() {
        System.out.println("Герой отдыхает и восстанавливает силы.");
    }

    public static void printHeroesCreated() {
        System.out.println("Всего создано героев: " + heroesCreated);
    }

    public void printInfo() {
        System.out.println("Имя героя: " + name);
        System.out.println("Уровень: " + level);
        System.out.println("текущее здоровье: " + health);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void levelUp() {
        if (level < MAX_LEVEL) {
            level++;
        }
    }

    public void attack() {
        System.out.println("Герой наносит обычный удар.");
    }


    public void attack(String target) {
        System.out.println("Герой наносит обычный удар. Цель: " + target);
    }

    public void attack(String target, int times) {
        System.out.println("Герой атакует цель: " + target + " " + times + " раза.");
    }
}
