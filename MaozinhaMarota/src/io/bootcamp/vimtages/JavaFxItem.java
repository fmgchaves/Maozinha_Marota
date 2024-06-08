package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.pictures.Picture;

// we will use this class to implement the Items' graphic logic
public class JavaFxItem{
    private Picture donnut;

    public JavaFxItem(Picture donnut) {
        this.donnut =  new Picture(40, 40,"/Item/donut_resized.png" );
        this.donnut.draw();
    }





}
