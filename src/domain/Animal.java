package domain;

public class Animal {
    private String name;
    private int weight;

    public Animal() {
        this.name = "Unknown animal";
        this.weight = 30;
    }

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void speak() {
        System.out.println("Animal makes a sound...");
    }

    @Override
    public String toString() {
        return "Animal [Name: " + name + ", Weight: " + weight + "kg]";
    }
}
