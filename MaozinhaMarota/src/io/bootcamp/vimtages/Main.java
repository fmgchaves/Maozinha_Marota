package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Level.Factory;
import io.bootcamp.vimtages.Level.Garden;
import io.bootcamp.vimtages.Level.Level;

public class Main {
    private static final int cols = 20;
    private static final int rows = 10;
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game(cols,rows);
        game.startScreen();
        new Handler();




        //Hand hand = new Hand(new Position(2,3));
        /*
        Factory factory = new Factory(hand);
        factory.makeCenario();
        factory.runScenario();
        */
    }
}
