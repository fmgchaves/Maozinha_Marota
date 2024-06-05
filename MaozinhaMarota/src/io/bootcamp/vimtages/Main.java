package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Game;

public class Main {
    private static final int cols = 20;
    private static final int rows = 10;
    private final static int cellSize = 80;
    public static void main(String[] args) {
        Game game = new Game(new Position(cols,rows),cellSize);
        game.init();

    }

}