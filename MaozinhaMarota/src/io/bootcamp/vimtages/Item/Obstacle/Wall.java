package io.bootcamp.vimtages.Item.Obstacle;

import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

//this class will override behaviour from abstract class Obstacle
public class Wall extends Obstacle {

    public Wall(Position position) {
        super(position);
    }

    @Override
    public void draw() {
        String Path = "./resources/item/box.png";
        setPicture(new Picture(getPosition().getCol(),getPosition().getRow(),Path));
        getPicture().draw();
    }

    @Override
    public void erase() {
        getPicture().delete();
    }


}
