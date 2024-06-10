package io.bootcamp.vimtages.Item;


import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Item extends Picture {

    public Item (Integer x, Integer y,String path) {
        super (x, y, path);
    }

    public int getX () {
        return super.getX();
    }
    
    public int getY () {
        return super.getY();
    }
}
