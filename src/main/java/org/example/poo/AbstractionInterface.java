package org.example.poo;

public interface AbstractionInterface {

    String status = "started";
    void checkBehavior();

    default void printHi() {
        System.out.println("Hi");
    }

    static void sayHello() {
        System.out.println("Hello!!");
    }
}
