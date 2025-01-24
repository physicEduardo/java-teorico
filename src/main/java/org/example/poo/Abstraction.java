package org.example.poo;

/*
* Abstraction means define an idea of behavior that doesn't require an instance.
* The use of abstract class or interfaces we express the intention, in that way another class
* doesn't require to know the behavior of the other to use it.
*
* */
public abstract class Abstraction {

    protected int level;

    Abstraction(int level) {
        this.level = level;
    }

    final protected void printLevel() {
        System.out.println("Level " + level);
    }

    abstract int calculateLevel();

    // final abstract checklevel(); final and abstract are incompatible

    public static void main(String[] args) {
        Abstraction abs = new Abstraction(1) {
            @Override
            int calculateLevel() {
                return 0;
            }
        };

        abs.printLevel();
    }
}

abstract class SecondAbstraction extends Abstraction{
    protected int weigth;

    SecondAbstraction(int level) {
        super(level);
    }
}