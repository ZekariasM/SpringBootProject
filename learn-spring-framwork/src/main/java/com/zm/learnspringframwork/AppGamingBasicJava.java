package com.zm.learnspringframwork;

import com.zm.learnspringframwork.game.GameRunner;
import com.zm.learnspringframwork.game.MarioGame;
import com.zm.learnspringframwork.game.SuperContraGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {

       //  var game = new MarioGame();
        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
