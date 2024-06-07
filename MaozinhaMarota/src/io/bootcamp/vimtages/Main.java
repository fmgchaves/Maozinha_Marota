package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Level.*;

public class Main {
    private static final int cols = 20;
    private static final int rows = 10;
    public static void main(String[] args) {
        Game game = new Game(cols,rows);
        game.init();

        Hand hand = new Hand(new Position(2,3));

        Moes moes = new Moes (hand);
        moes.makeCenario();
        moes.runScenario();

    }
}
