package main;

public class Main {
    public static void main(String[] args) {
        String name = "Глеб";
        String post = "Старший шаурма-инженер";
        int stavkaZaSmenu = 16000;
        int kolichestvoSmen = 20;
        int bonus = 3000;
        int shtraf = 500;
        int priceShawarma = 900;
        int countShawarma = 1000;

        int salaryNotBonus = kolichestvoSmen * stavkaZaSmenu;

        System.out.println("Сотрдуник: " + name);
        System.out.println("Должность: " + post);
        System.out.println("Зарплата без премии: " + salaryNotBonus);
        System.out.println("Премия: " + bonus);
        System.out.println("Штраф: " + shtraf);
        System.out.println("Итоговая зарплата: " + (salaryNotBonus + bonus - shtraf));
        System.out.println("Шаурм-выручка: " + priceShawarma * countShawarma);

    }
}
