package io.bootcamp.vimtages;

import apple.laf.JRSUIConstants;

public class AbstractGridPosition implements GridPosition {

    private int col;

    private int row;

    private Grid grid;



    public AbstractGridPosition(int col, int row, Grid grid) {
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
