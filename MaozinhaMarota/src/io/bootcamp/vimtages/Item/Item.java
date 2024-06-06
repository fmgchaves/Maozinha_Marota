package io.bootcamp.vimtages.Item;

import com.sun.javafx.binding.StringFormatter;
import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class Item {
    
    private Position position;
    private Picture picture;
    
    public Item (Position position) {
        this.position = position;
    }
    
    public Position getPosition () {
        return this.position;
    }
    // items are going to implement
    // abstract methods from item and
    // inherit common item behaviour
    // like position, effect, destructability
    // another interface?
    
    public void setPosition (Position position) {
        this.position = position;
    }

    public Picture getPicture () {
        return this.picture;
    }

     public void setPicture (Picture picture) {
        this.picture = picture;
    }

    public abstract void draw();

    public abstract void erase();

}
