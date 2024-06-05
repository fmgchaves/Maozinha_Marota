package io.bootcamp.vimtages;

//This Class defines de position inside the Grid

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

    public void setCol (int col) {
        this.col = col;
    }

    public void setRow(int row) {
        this.row = row;
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

    /*
    public Position setPos(Position position){
        return  position.setPos(position.getCol(),position.getRow());

    }

     */

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
