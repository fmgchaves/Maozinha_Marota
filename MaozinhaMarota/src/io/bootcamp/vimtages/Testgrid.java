package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Testgrid {
    private static int col;
    private static int row;
    private static int cellSize;
    private int padding;
    private int x = padding;
    private int y = padding;
    public Testgrid(int col, int row, int cellSize, int padding) {
        this.col = col;
        this.row = row;
        this.cellSize = cellSize;
        this.padding = padding;


    }
    public void gridSquares(){


        for (int i = 0; i < col; i++) {
            Rectangle square= new Rectangle(x+padding,y+padding,cellSize,cellSize);
            square.draw();
            x+=cellSize;



        }
        if(y!=row*cellSize){
            //System.out.println("here");
            x=0;
            y+=cellSize;
            gridSquares();

        }

    }
}
