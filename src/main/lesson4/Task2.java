package main.lesson4;

public class Task2 {
    public static void main(String[] args) {

        boolean showOnlyIssues = true;
        boolean stopOnCriticalLimit = true;

        int criticalCount = 0;
        int criticalLimit = 3;

        System.out.println("===== ИТОГИ НОЧНОЙ СМЕНЫ =====");
        System.out.println("Всего тестов: 100");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                criticalCount++;
                System.out.println("Тест #" + i + ": " + "Critical!");
            } else if (i % 5 == 0) {
                System.out.println("Тест #" + i + ": " + "Bug");
            } else if (i % 3 == 0) {
                System.out.println("Тест #" + i + ": " + "Flaky");
            } else {
                System.out.println("Тест #" + i + ": " + "Pass");
            }


            if (stopOnCriticalLimit && criticalCount >= criticalLimit) {
                System.out.println("Слишком много критических багов — будим тимлида!");
                break;
            }
        }

    }
}
