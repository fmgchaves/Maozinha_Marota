package io.bootcamp.vimtages.Item.Obstacle;

import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Box extends Obstacle{
    public Box(Position position) {
        super(position);
    }

    @Override
    public void draw() {
        String Path = "./resources/item/mona80-3955503419.jpeg";
        setPicture(new Picture((getPosition().getCol()*80)+10,(getPosition().getRow()*80)+10,Path));
        getPicture().draw();
    }

    @Override
    public void erase() {

    }
}
