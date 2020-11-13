package org.itstep;

public class Snake extends Animal{
    int length;

    public Snake(String name, int age, int weight, int number, int time, int dayCosts, int length) {
        super(name, age, weight, number, time, dayCosts);
        this.length = length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

}
