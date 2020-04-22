package com.appnetics;

public class Main {

    public static void main(String[] args) {

    Freelander freelander = new Freelander(30);
    freelander.steer(35);
    freelander.accelerate(33);
    freelander.accelerate(12);
    freelander.accelerate(-37);

    }
}
