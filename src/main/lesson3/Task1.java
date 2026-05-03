package main.lesson3;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        String[] petya = {"курица", "бананы", "творог"};
        String[] kolya = {"курица", "бананы", "творог"};
        String[] terentiy = {"пиво", "пельмени", "ласка магия черного"};

        if (petya.length == kolya.length) {
            System.out.println("Корзины Пети и Коли по количеству товаров => равны");
        } else {
            System.out.println("Корзины Пети и Коли по количеству товаров => НЕ равны");
        }

        if (petya.length == terentiy.length) {
            System.out.println("Корзины Пети и Терентия по количеству товаров => равны");
        } else {
            System.out.println("Корзины Пети и Терентия по количеству товаров => НЕ равны");
        }


        Arrays.sort(petya);
        Arrays.sort(kolya);
        Arrays.sort(terentiy);

        if (Arrays.equals(petya, kolya)) {
            System.out.println("Состав корзины Пети и Коли => равны");
        } else {
            System.out.println("Состав корзины Пети и Коли => разный");
        }

        if (Arrays.equals(petya, terentiy)) {
            System.out.println("Состав корзины Пети и Терентия => равны");
        } else {
            System.out.println("Состав корзины Пети и Терентия => разный");
        }



    }
}
