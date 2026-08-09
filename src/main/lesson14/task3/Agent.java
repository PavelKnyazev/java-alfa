package main.lesson14.task3;

public class Agent {

    // private - доступно только внутри класса Agent
    private String name;

    // protected - доступно в этом классе,
    // наследниках и классах того же package
    protected int level;

    // public - доступно отовсюду
    public String planet;

    // default
    boolean active;

    public Agent() {
        this.name = "Unknown";
        this.level = 1;
        this.planet = "Earth";
        this.active = true;
    }

    protected Agent(String name, int level) {
        this.name = name;
        this.level = level;
        this.planet = "Mars";
        this.active = true;
    }

    public void printInfo() {
        System.out.println("Agent: " + name);
    }

    protected void increaseLevel() {
        level++;
    }

    void deactivate() {
        active = false;
    }

    private void secretMethodSay() {
        System.out.println("Secret");
    }

}