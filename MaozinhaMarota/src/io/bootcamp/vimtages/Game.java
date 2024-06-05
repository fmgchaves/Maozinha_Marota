package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.graphics.Shape;

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
        JavaFxGrid grid = new JavaFxGrid(cols,rows);
        grid.init();
        //System.out.println("Hei " + grid.getHeight());
        //System.out.println("Width " + grid.getWidth());
    }
    public static void gridSquares(){


    }
}
