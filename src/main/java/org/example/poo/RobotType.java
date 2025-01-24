package org.example.poo;

public enum RobotType {
    A("aaaa", 1), B("bbb", 9);

    private String name;
    private int level;

    RobotType(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
