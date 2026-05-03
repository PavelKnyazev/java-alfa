package main.lesson3;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        String[] passwords = {"1qaz!QAZ", "sgb@Nvs@#!ns242!4", "klawfkf@MFGpowjg0wg!"};


        for (int i = 0; i < passwords.length; i++) {
            String password = passwords[i];
            boolean isValid = true;


            if (password.length() <= 8) {
                isValid = false;
            }
            if (password.startsWith("1")) {
                isValid = false;
            }
            if (password.endsWith("z")) {
                isValid = false;
            }
            if (password.contains("1234")) {
                isValid = false;
            }
            if (password.contains("qwerty")) {
                isValid = false;
            }


            System.out.println("пароль '" + password + "' прошел проверку: " + isValid);
        }


    }
}
