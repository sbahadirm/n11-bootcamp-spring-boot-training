package com.bahadirmemis.springboot.designpattern.state;

public class Game {

    private Console console;

    public Game() {
        console = new OffenceState();

        System.out.println("the game started with offence mode");
    }

    public void x(){
        console.pressX();
    }

    public void y(){
        console.pressY();
    }

    public void a(){
        console.pressA();
    }

    public void b(){
        console.pressB();
    }

    public void getTheBall(){
        System.out.println("the ball is taken. new state is -> offence");
        console = new OffenceState();
    }

    public void loseTheBall(){
        System.out.println("the ball is lost. new state is -> deffence");
        console = new DefenceState();
    }
}
