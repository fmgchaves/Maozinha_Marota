package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public interface Grid {

    /**
     * Initializes the grid
     */
    public void init();

    //public void show();
    //public void hide();

    public void setPicture(Picture picture);

    /**
     * Gets the number of columns in the grid
     *
     * @return the number of columns
     */
    public int getCols();

    /**
     * Gets the number of rows in the grid
     *
     * @return the number of rows
     */
    public int getRows();

    /**
     * Creates a grid position in a specific column and row
     *
     * @param col   the position column
     * @param row   the position row
     * @return the new grid position
     */
    public Position GridPosition(int col, int row);

}

