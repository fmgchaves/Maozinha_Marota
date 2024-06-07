package io.bootcamp.vimtages.Item;

import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

//will override and use abstract Items methods
public class Donut extends Item {
    public Donut(Position position) {
        super ( position );
    }

    @Override
    public void draw() {
        String Path = "./resources/item/samplehand.gif";
        setPicture(new Picture(getPosition().getCol(),getPosition().getRow(),Path));
        getPicture().draw();
    }
    public void erase() {
        getPicture().delete();
    }
}
