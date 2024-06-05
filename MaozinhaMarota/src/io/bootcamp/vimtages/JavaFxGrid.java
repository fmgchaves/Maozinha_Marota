package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;

public class JavaFxGrid implements Grid {
    Canvas canvas;
    Shape grid;
    Shape[][] squares;
    int cellSize = 80;
    int padding = 10;
    int rows;
    int cols;
    public JavaFxGrid(int cols, int rows){
        this.cols=cols;
        this.rows = rows;
        this.squares=new Shape[getWidth()/cellSize][getHeight()/cellSize];
    }
    @Override
    public void init() {
        this.canvas= Canvas.getInstance();
        this.grid= new Rectangle(padding,padding,getWidth(),getHeight());
        canvas.show(grid);
        gridSquares();
    }
    //Creates rectangle objects in 2 dimensional array
    public void gridSquares(){
        Position position = new Position(0, 0);
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                if (squares[i][j] == null) {
                    squares[i][j] = new Rectangle(position.getCol()+padding, position.getRow()+padding, cellSize, cellSize);
                    squares[i][j].draw();
                    position.setPos(position.getCol(),position.getRow()+cellSize);
                }
            }
            position.setPos(position.getCol()+cellSize,0);

        }
    }

    public int getWidth(){
        return cols*this.cellSize;
    }
    public int getHeight(){
        return rows*this.cellSize;
    }

    @Override
    public int getCols() {
        return this.cols;
    }

    @Override
    public int getRows() {
        return this.getRows();
    }

    @Override
    public Position GridPosition(int col, int row) {
        return new Position(col,row);
    }

    public Position makeGridPosition(int col, int row) {
        return new Position(col,row);
    }
}
