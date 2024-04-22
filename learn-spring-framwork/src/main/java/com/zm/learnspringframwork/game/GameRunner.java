package com.zm.learnspringframwork.game;

public class GameRunner {

    MarioGame game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running Game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}