package io.bootcamp.vimtages.Item;


import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Item extends Picture{
    
    private Picture item;
    
    public Item (Integer x, Integer y, String path) {
        this.item = new Picture (x, y, path);
    }
    public int getX () {
        return this.item.getX ();
    }
    
    public int getY () {
        return this.item.getY ();
    }
}
