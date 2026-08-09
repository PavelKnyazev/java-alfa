package main.lesson14.task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ObjectScanner {

    public static void scan(Object objet) {

        Class<?> clazz = objet.getClass();

        System.out.println("Class: " + clazz.getName());


        System.out.println("\n--- ПОЛЯ ---");

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            String modifier = Modifier.toString(field.getModifiers());

            String type = field.getType().getSimpleName();

            String name = field.getName();

            System.out.println(modifier + " " + type + " " + name);
        }


        System.out.println("\n--- МЕТОДЫ ---");

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            String modifier = Modifier.toString(method.getModifiers());

            String returnType = method.getReturnType().getSimpleName();

            String name = method.getName();

            System.out.println(modifier + " " + returnType + " " + name + "()");
        }


        System.out.println("\n--- КОНСТРУКТОРЫ ---");

        Constructor<?>[] constructors = clazz.getDeclaredConstructors();

        for (Constructor<?> constructor : constructors) {

            String modifier = Modifier.toString(constructor.getModifiers());

            System.out.println(modifier + " " + constructor.getName());
        }

    }

}