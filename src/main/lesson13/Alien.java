package main.lesson13;

import java.util.Objects;

/**
 * Часть 1: База данных пришельцев
 * Создайте класс Alien (файл Alien.java) с полями:
 *
 * String name — имя пришельца (например, «Зигмунд»)
 * String planet — планета происхождения
 * int dangerLevel — уровень опасности (1–10)
 * Требования к классу Alien:
 * Переопределите equals() и hashCode(), чтобы пришельцы считались одинаковыми при совпадении имени и планеты.
 * Переопределите toString() для удобного вывода информации об объекте.
 * Логика в main:
 * Создайте ArrayList<Alien>.
 * Добавьте 5 объектов Alien. Два из них должны иметь одинаковые имя и планету, но разный dangerLevel.
 * Проверьте: содержит ли список дубликат.
 * Выведите результат на экран.
 */
public class Alien {
    String name;
    String planet;
    int dangerLevel;

    public Alien(String name, String planet, int dangerLevel) {
        this.name = name;
        this.planet = planet;
        this.dangerLevel = dangerLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alien alien = (Alien) o;
        return Objects.equals(name, alien.name) && Objects.equals(planet, alien.planet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, planet);
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", planet='" + planet + '\'' +
                ", dangerLevel=" + dangerLevel +
                '}';
    }
}
