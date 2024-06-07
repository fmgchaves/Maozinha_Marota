package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;
import org.academiadecodigo.simplegraphics.pictures.Picture;



public class InitScreen {
    private final static int cellSize = 80;
    private int rows;
    private int cols;
    private static Picture picture;
    private static Rectangle initButton;

    public InitScreen(int cols, int rows) {
        this.rows = rows;
        this.cols = cols;
    }

    public static void init(){
        int padding = 10;
        String backGround = "./resources/defaultImage.jpg";
        picture = new Picture(padding, padding, backGround);
        picture.draw();
        int width = picture.getWidth();
        int heigth = picture.getHeight();
        initButton = new Rectangle(width/4,heigth-(heigth/5+100),cellSize*10,cellSize);
        initButton.setColor(Color.YELLOW);
        initButton.fill();
        initButton.draw();

    }

    public static void stop(){
        //picture.delete();
        initButton.delete();
    }
    public int getWidth(){
        return cols* cellSize;
    }
    public int getHeight(){
        return rows* cellSize;
    }
}
