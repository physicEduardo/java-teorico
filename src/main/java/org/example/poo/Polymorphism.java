package org.example.poo;

/*
* Polymorphism means perform an action in many different ways
* */
public class Polymorphism {

    public static void main(String[] args) {
        var dog = new Dog();
        dog.makeSound();
    }
}

sealed class Animal permits Dog {
    void makeSound() {
        System.out.println("Make principal noise");
    }
}

final class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark!");
    }
}