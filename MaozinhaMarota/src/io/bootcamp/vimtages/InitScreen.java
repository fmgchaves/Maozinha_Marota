package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;



public class InitScreen {
    int cellSize = 80;
    int pading = 10;
    int rows;
    int cols;
    private Picture picture;
    private String backGround= "MaozinhaMarota/resources/defaultImage.jpg";

    public InitScreen(int cols, int rows) {
        this.rows = rows;
        this.cols = cols;
    }

    public void init(){
        picture = new Picture(pading,pading,backGround);
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
