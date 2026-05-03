package main.lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = new String[5];

        for (int i = 0; i < str.length; i++) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("NULL")) {
                System.out.println("Часть сообщения повреждена! Используем резервный фрагмент...");
                str[i] = "XX";
            } else {
                str[i] = input;
            }
        }

        System.out.println("Вывод данных:" );
        for (String string : str) {
            System.out.println(string);
        }

        String result = String.join("#", str);

        System.out.println("Итоговое сообщение:");
        System.out.println(result);
    }
}
