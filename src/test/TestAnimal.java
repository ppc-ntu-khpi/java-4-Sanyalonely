package test;

import domain.Leopard;

public class TestAnimal {
    public static void main(String[] args) {
        Leopard myLeopard = new Leopard("Spotty", 30, "Amur Leopard");

        System.out.println(myLeopard.toString());
        myLeopard.eat();
        myLeopard.speak();
        myLeopard.hunt();
        myLeopard.play();
    }
}
