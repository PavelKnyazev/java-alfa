package main.lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Часть 2: Формирование отрядов
 * Создайте класс SquadManager (файл SquadManager.java), который будет отвечать за работу с отрядами.
 *
 * Требования к классу SquadManager:
 * Метод demonstrateListCreations(), внутри которого:
 *
 * Создайте список new ArrayList<>() — основной отряд. Добавьте 4 имени.
 * Создайте список Arrays.asList() — отряд поддержки. Создайте сразу с 3 именами.
 * Создайте список List.of() — элитный отряд. Создайте сразу с 2 именами.
 * В этом же методе попробуйте добавить и удалить по одному штурмовику из каждого списка.
 * Оберните каждую операцию добавления/удаления в try-catch и выведите результат: успех или название перехваченного исключения.
 *
 * Логика в main:
 * Создайте экземпляр SquadManager и вызовите метод demonstrateListCreations().
 */
public class SquadManager {

    public static void filterOutCowards(List<String> squad) {
        Iterator<String> iterator = squad.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
        }

        System.out.println("После фильтрации: " + squad);
    }


    public static void demonstrateListCreations() {
        List<String> mainSquad = new ArrayList<>();
        mainSquad.add("Roman");
        mainSquad.add("Pavel");
        mainSquad.add("Andrey");
        mainSquad.add("Andrey");

        List<String> asList = new ArrayList<>();
        List<String> supportSquad = Arrays.asList("Alex", "Bob", "John");
        List<String> eliteSquad = List.of("Max", "Sam");

        mainSquad.remove(3);
        asList.add("Pavel");



    }
}
