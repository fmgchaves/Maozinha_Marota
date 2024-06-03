package io.bootcamp.vimtages;


import org.academiadecodigo.simplegraphics.graphics.Shape;

public class Position implements GridPosition {

    private int col;

    private int row;

    private Shape grid;



    public Position(int col, int row, Shape grid) {
        this.col = col;
        this.row = row;
        this.grid = grid;
    }

    @Override
    public int getCol() {
        return col;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
    }


}
