package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.pictures.Picture;



public class InitAndFinalScreen {
    private final int cellSize = 80;
    private int rows;
    private int cols;
    
    private int padding;

    public InitAndFinalScreen (int cols, int rows) {
        this.rows = rows;
        this.cols = cols;
        this.padding = 10;
    }

    public void init(){
        String backGround = "Levels/InitialScreen.png";
        Picture picture = new Picture(padding, padding, backGround);
        picture.draw();
    }
    
    public void finalScreen() {
        String backGround = "Levels/FinalScreen.png";
        Picture picture = new Picture (padding, padding, backGround);
        picture.draw();
    }
    public int getWidth(){
        return cols*this.cellSize;
    }
    public int getHeight(){
        return rows*this.cellSize;
    }
}
