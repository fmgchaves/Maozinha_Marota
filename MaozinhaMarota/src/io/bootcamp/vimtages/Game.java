package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Item.Item;
import io.bootcamp.vimtages.Level.Garden;

public class Game {
    private static int cols;
    private static int rows;
    public Game (int cols, int rows){
        this.cols=cols;
        this.rows=rows;

    }

    public static int getRows() {
        return rows;
    }

    public void initInitialScreen(){
        //GameScreen grid = new GameScreen(cols,rows);
        //grid.init();
        InitScreen initScreen = new InitScreen(cols,rows);
        initScreen.init();
        //System.out.println("Hei " + grid.getHeight());
        //System.out.println("Width " + grid.getWidth());
    }
    public void initGame(){
        GameScreen newGame = new GameScreen(cols,rows);
        newGame.init();
        //System.out.println("Hei " + grid.getHeight());
        //System.out.println("Width " + grid.getWidth());
    }
    public static void gridSquares(){


    }
}
