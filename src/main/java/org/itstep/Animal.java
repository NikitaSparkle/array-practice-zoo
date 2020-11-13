package org.itstep;

abstract class Animal {
    private String name;
    private int age;
    private int weight;
    private int number;
    private int time;
    private int dayCosts;

    public Animal(String name, int age, int weight, int number, int time, int dayCosts) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.number = number;
        this.time = time;
        this.dayCosts = dayCosts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setDayCosts(int dayCosts) {
        this.dayCosts = dayCosts;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getNumber() {
        return number;
    }

    public int getTime() {
        return time;
    }

    public int getDayCosts() {
        return dayCosts;
    }
}
