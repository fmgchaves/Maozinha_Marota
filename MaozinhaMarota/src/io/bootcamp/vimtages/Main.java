package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Level.Garden;

public class Main {
    private static final int cols = 20;
    private static final int rows = 10;
    public static void main(String[] args) {
        Game game = new Game(cols,rows);
        game.init();
    }
}