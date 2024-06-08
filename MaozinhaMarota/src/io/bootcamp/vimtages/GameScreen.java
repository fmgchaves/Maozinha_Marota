package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameScreen {
    private static String backgroundPath = "./resources/defaultImage.jpg";
    Picture picture;
    //Canvas canvas;
    //Shape grid;
    Shape[][] squares;
    int cellSize = 80;
    int padding = 10;
    int rows;
    int cols;
    private int x=padding;
    private int y=padding;
    public GameScreen(int cols, int rows){
        this.cols=cols;
        this.rows = rows;
        this.squares=new Shape[getWidth()/cellSize][getHeight()/cellSize];
    }

    public void init() {
        //this.canvas= Canvas.getInstance();
        //this.grid= new Rectangle(padding,padding,getWidth(),getHeight());
        //canvas.show(grid);

        Picture picture = new Picture(10,10,backgroundPath);
        picture.draw();
        gridSquares();
        //canvas.hide(picture);

    }


    public void setPicture(Picture picture) {
        picture = new Picture(10,10,"./resources/initscreen1.jpg");
        picture.draw();
    }


    //Creates rectangle objects in 2 dimensional array

    public void gridSquares(){
        for (int i = 0; i < cols; i++) {
            Rectangle square= new Rectangle(x+padding,y+padding,cellSize,cellSize);
            square.draw();
            x+=cellSize;



        }
        if(y!=rows*cellSize){
            //System.out.println("here");
            x=0;
            y+=cellSize;
            gridSquares();

        }
        /*
        Position position = new Position(0, 0);
        for (int i = 0; i < squares.length; i++) {
            for (int j = 0; j < squares[i].length; j++) {
                if (squares[i][j] == null) {
                    squares[i][j] = new Rectangle(position.getCol()+padding, position.getRow()+padding, cellSize, cellSize);
                    squares[i][j].draw();
                    position.setPos(position.getCol(),position.getRow()+cellSize);
                    //System.out.println(getWidth()+" " +getHeight());
                }
            }
            position.setPos(position.getCol()+cellSize,0);

        }
        */

    }

    public int getWidth(){
        return rows*this.cellSize;
    }
    public int getHeight(){
        return cols*this.cellSize;
    }

/*
    public int getCols() {
        return this.cols;
    }

    public int getRows() {
        return this.getRows();
    }


    public Position GridPosition(int col, int row) {
        return new Position(col,row);
    }

    public Position makeGridPosition(int col, int row) {
        return new Position(col,row);
    }
*/
}

