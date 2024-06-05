package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;

public class Game {
    private static int cols;
    private static int rows;
    private static int cellSize;
    private static Shape[][] squares;
    private static Position position;
    public Game (Position position, int cellSize){
        this.cellSize = cellSize;
        this.position = new Position(cols,rows);
        squares=new Shape[position.getRow()*cellSize/cellSize][position.getCol()/cellSize];
    }



    public static int getRows() {
        return position.getRow();
    }

    public void init(){
        JavaFxGrid grid = new JavaFxGrid(position,cellSize);
        gridSquares();

        grid.init();

        //System.out.println("Hei " + grid.getHeight());
        //System.out.println("Width " + grid.getWidth());
    }
    public static void gridSquares(){

            Position position = new Position(0, 0);
            for (int i = 0; i < squares.length; i++) {
                for (int j = 0; j < squares[i].length; j++) {
                    if (squares[i][j] == null) {
                        int padding = 80;
                        squares[i][j] = new Rectangle(position.getCol()+ padding, position.getRow()+ padding, cellSize, cellSize);
                        squares[i][j].draw();
                        position.setPos(position.getCol(),position.getRow()+cellSize);
                    }
                }
                position.setPos(position.getCol()+cellSize,0);

            }
        }



}
