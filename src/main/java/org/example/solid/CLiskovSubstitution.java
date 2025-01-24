package org.example.solid;

/*
* Subclasses should be able to be substituted by its parent class
*
* */
public class CLiskovSubstitution {

    static void verifyFinger(Finger finger) {
        System.out.println(finger.name);
    }

    public static void main(String[] args) {
        verifyFinger(new Middle("d1", "dañado"));
    }
}

class Finger {

    protected String name;

    Finger(String name) {
        this.name = name;
    }
}

class Middle extends Finger {

    private String status;

    Middle(String name, String status) {
        super(name);
    }

    public String getStatus() {
        return status;
    }
}
