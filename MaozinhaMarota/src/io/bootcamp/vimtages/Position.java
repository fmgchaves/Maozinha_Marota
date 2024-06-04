package io.bootcamp.vimtages;


import org.academiadecodigo.simplegraphics.graphics.Shape;

public class Position implements GridPosition {

    private int col;

    private int row;

    private boolean isFilled;

    //private Shape grid;



    public Position(int col, int row) {
        this.col = col;
        this.row = row;
        this.isFilled = false;
       // this.grid = grid;
    }

    @Override
    public int getCol() {
        return this.col;
    }

    @Override
    public int getRow() {
        return this.row;
    }

    @Override
    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public void setFilled() {
        this.isFilled = true;
    }

    public void notFilled() {
        this.isFilled = false;
    }

    public boolean isFilled() {
        return this.isFilled;
    }

}
