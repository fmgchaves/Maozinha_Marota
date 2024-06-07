package io.bootcamp.vimtages.Item.Obstacle;

import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Box extends Obstacle{

    public Box(Position position) {
        super(position);
    }

    @Override
    public void draw() {
        String Path = "./resources/item/box.png";
        setPicture(new Picture((getPosition().getCol()*80)+10,(getPosition().getRow()*80)+10,Path));
        getPicture().draw();
    }

    @Override
    public void erase() {
//        getPicture().delete(); //this object can only be erased with a beer. how do we will implement this?
    }

}
