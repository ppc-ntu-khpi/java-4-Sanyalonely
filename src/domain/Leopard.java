package domain;

public class Leopard extends Predator {
    private String angry; 

    public Leopard(String name, int weight, String angry) {
        this.angry = angry;
    }

    public Leopard() {
        this.angry = "Very angry";
    }

    public void play() {
        System.out.println("Leopard is playing with its cubs or climbing a tree.");
    }

    public void speak() {
        System.out.println("Leopard roars and purrs!");
    }

    public void eat() {
        System.out.println("Leopard is eating meat in the tree branches.");
    }

    public String toString() {
        return super.toString() + "\nThis leopard is " + angry;
    }
}
