package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;



public class InitScreen {
    private final int cellSize = 80;
    private int rows;
    private int cols;

    public InitScreen(int cols, int rows) {
        this.rows = rows;
        this.cols = cols;
    }

    public void init(){
        int padding = 10;
        String backGround = "./resources/defaultImage.jpg";
        Picture picture = new Picture(padding, padding, backGround);
        picture.draw();
        int width = picture.getWidth();
        int heigth = picture.getHeight();
        Rectangle initButton = new Rectangle(width/4,heigth-(heigth/5+100),cellSize*10,cellSize);
        initButton.setColor(Color.YELLOW);
        initButton.fill();
        initButton.draw();


    }
    public int getWidth(){
        return cols*this.cellSize;
    }
    public int getHeight(){
        return rows*this.cellSize;
    }
}
