package main.lesson2;

import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {

        Random random = new Random();

        int age = random.nextInt(100);
        double balance = random.nextDouble() * 100000;
        balance = Math.round(balance * 100) / 100;

        boolean isInvite = random.nextBoolean(); // Приглашение
        boolean isBlocked = random.nextBoolean(); // Черный список

        System.out.println("Возраст: " + age);
        System.out.println("Баланс: " + balance);
        System.out.println("Приглашение: " + isInvite);
        System.out.println("Черный список: " + isBlocked);


        // Условия:
        boolean isLegalAge = (age >= 18);
        boolean isAllowed = (isInvite == true) || (balance > 50000);
        boolean isNotBlockList = !isBlocked; // проверяем что НЕ в четном списке
        double participationFee = Math.round(balance * 0.075 * 100) / 100.0;

        System.out.println("======================");
        System.out.println();

        System.out.println("Совершеннолетний: " + isLegalAge);
        System.out.println("Имеет доступ: " + isAllowed);
        System.out.println("НЕТ в черном списке: " + isNotBlockList);
        System.out.println("Сумма за участие: " + participationFee);
    }
}
