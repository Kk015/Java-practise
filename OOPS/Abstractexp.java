package OOPS;

public class Abstractexp {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        h1.changeColor();
        System.out.println(h1.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("walk with 4 legs");
    }

    void changeColor() {
        this.color = "Black";
    }
}