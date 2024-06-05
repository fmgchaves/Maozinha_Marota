package io.bootcamp.vimtages;

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

    public void init(){
        //GameScreen grid = new GameScreen(cols,rows);
        //grid.init();
        InitScreen initScreen = new InitScreen(cols,rows);
        initScreen.init();
        //System.out.println("Hei " + grid.getHeight());
        //System.out.println("Width " + grid.getWidth());
    }
    public static void gridSquares(){


    }
}
