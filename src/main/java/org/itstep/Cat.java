package org.itstep;

public class Cat extends Animal {
    private String flock;
    private String color;

    public Cat(String name, int age, int weight, int number, int time, int dayCosts, String flock, String color) {
        super(name, age, weight, number, time, dayCosts);
        this.flock = flock;
        this.color = color;
    }

    public String getFlock() {
        return flock;
    }

    public void setFlock(String flock) {
        this.flock = flock;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
