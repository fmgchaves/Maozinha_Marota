package io.bootcamp.vimtages;


import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;

public class JavaFxGrid implements Grid {
    Canvas canvas;
    Shape grid;
    private static Position position;
    int cellSize;
    int padding = 10;
    int rows;
    int cols;
    public JavaFxGrid(Position position, int cellSize){
        this.position = position;
        this.cellSize=cellSize;

    }
    @Override
    public void init() {
        this.canvas= Canvas.getInstance();
        this.grid= new Rectangle(padding,padding,getWidth(),getHeight());
        canvas.show(grid);

    }

    @Override
    public int getCol() {
        return cols*cellSize;
    }

    @Override
    public int getRow() {
        return rows*cellSize;
    }

    //Creates rectangle objects in 2 dimensional array

    public int getWidth(){
        return getCol()*this.cellSize;
    }

    @Override
    public int getHeigth() {
        return getRow()*this.cellSize;
    }

    public int getHeight(){
        return rows*this.cellSize;
    }

    @Override
    public void setPos(int col, int row) {
        GridPosition(col,row);
    }

    @Override
    public Position GridPosition(int col, int row) {
        return new Position(col,row);
    }


    public Position makeGridPosition(int col, int row) {
        return new Position(col,row);
    }
}
