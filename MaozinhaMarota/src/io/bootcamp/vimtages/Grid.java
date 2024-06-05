package io.bootcamp.vimtages;

public interface Grid extends GridPosition {

    /**
     * Initializes the grid
     */
    public void init();

    /**
     * Creates a grid position in a specific column and row
     *
     * @param col   the position column
     * @param row   the position row
     * @return the new grid position
     */
    public int getWidth();
    public int getHeigth();

    Position GridPosition(int col, int row);
}

