package main.lesson13;

import java.util.LinkedList;

public class AssaultQueue {

    private LinkedList<String> queue = new LinkedList<>();

    public void addRecruits(String name) {
        queue.add(name);
    }

    public void retreatCoward() {
        queue.pollFirst();
    }

    public void printQueue() {
        System.out.println("Текущая очерель: " + queue);
    }

}
