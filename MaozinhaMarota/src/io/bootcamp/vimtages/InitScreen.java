package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.graphics.Canvas;

public class InitScreen implements Grid {
    int cellSize;
    int col;
    int row;

    public InitScreen() {

    }

    @Override
    public void init() {

    }

    @Override
    public int getWidth() {
        return getRow()*cellSize;
    }

    @Override
    public int getHeigth() {
        return getCol()*cellSize;
    }

    @Override
    public Position GridPosition(int col, int row) {
        return null;
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

    }
}
