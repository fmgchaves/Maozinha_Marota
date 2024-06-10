package io.bootcamp.vimtages;

import java.io.IOException;

public class Main {
    private static final int cols = 22;
    private static final int rows = 10;
    private static final int padding = 10;
    private static final int cellSize = 80;
    public static void main(String[] args) throws InterruptedException, IOException {
        Game game = new Game(rows,cols,cellSize,padding);
        game.init ();
    
        //Hand hand = new Hand(new Position(2,3));
        /*
        Factory factory = new Factory(hand);
        factory.makeCenario();
        factory.runScenario();
        */
    }
}
