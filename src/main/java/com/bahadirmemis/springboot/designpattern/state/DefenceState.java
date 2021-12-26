package com.bahadirmemis.springboot.designpattern.state;

public class DefenceState implements Console {

    @Override
    public void pressX() {
        System.out.println("intercept");
    }

    @Override
    public void pressY() {
        System.out.println("goalkeeper");
    }

    @Override
    public void pressA() {
        System.out.println("press");
    }

    @Override
    public void pressB() {
        System.out.println("slide");
    }
}
