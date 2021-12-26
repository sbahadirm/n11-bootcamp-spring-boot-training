package com.bahadirmemis.springboot.designpattern.state;

public class StateApp {

    public static void main(String[] args) {

        Game game = new Game();

        game.a();
        game.a();
        game.a();
        game.y();
        game.loseTheBall();

        game.a();
        game.a();
        game.x();
        game.b();
        game.getTheBall();
    }
}
