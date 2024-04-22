package com.zm.learnspringframwork;

import com.zm.learnspringframwork.game.GameRunner;
import com.zm.learnspringframwork.game.MarioGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
