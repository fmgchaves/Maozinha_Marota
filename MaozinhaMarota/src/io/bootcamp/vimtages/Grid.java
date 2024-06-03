package io.bootcamp.vimtages;

public interface Grid {

    /**
     * Initializes the grid
     */
    public void init();

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

