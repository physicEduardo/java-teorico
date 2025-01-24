package org.example.poo;

/*
*
* Encapsulation means hide data implementation by restricting access only to public methods.
* attributes keep private and accessors methods are public
*
* */
public class Encapsulation {

    private String name;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
