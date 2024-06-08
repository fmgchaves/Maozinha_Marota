package io.bootcamp.vimtages.Item.Obstacle.Characters;

import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Maggie extends Characters {

    public Maggie(Position position) {
        super(position);
    }

    @Override
    public void draw() {
        String Path = "Item/Meggie_resized.png";
        setPicture(new Picture((getPosition().getCol()*80)+10,(getPosition().getRow()*80)+10,Path));
        getPicture().draw();
    }

    @Override
    public void erase() {
        getPicture().delete();
    }
}
