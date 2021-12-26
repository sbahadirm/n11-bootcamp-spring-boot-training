package com.bahadirmemis.springboot.designpattern.state;

public class OffenceState implements Console {

    @Override
    public void pressX() {
        System.out.println("shot");
    }

    @Override
    public void pressY() {
        System.out.println("throught ball");
    }

    @Override
    public void pressA() {
        System.out.println("short pass");
    }

    @Override
    public void pressB() {
        System.out.println("cross ball");
    }
}
