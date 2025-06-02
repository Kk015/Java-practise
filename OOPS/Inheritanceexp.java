package OOPS;

public class Inheritanceexp {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();

        // Dog dob = new Dog();
        // dob.eat();

    }

}

class Animal { // Base class
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathes() {
        System.out.println("breathes");
    }
}

class Mammals extends Animal {
    void walks() {
        System.out.println("walking");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

// class Dog extends Mammals {
// String breed;
// }

// Derived Class / subClass
// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.println("swimming");
// }
// }
