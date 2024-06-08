package io.bootcamp.vimtages.Item.Obstacle;

import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

//this class will override behaviour from abstract class Obstacle
public class Radioactive extends Obstacle {

    public Radioactive(Position position) {
        super(position);
    }

    @Override
    public void draw() {
        String Path = "Item/Pepita horizontal_resized.png";
        setPicture(new Picture((getPosition().getCol()*80)+10,(getPosition().getRow()*80)+10,Path));
        getPicture().draw();
    }

    @Override
    public void draw(String string) {
        String Path = "Item/Pepita Vertical.png";
        setPicture(new Picture((getPosition().getCol()*80)+10,(getPosition().getRow()*80)+10,Path));
        getPicture().draw();
    }

    @Override
    public void erase() {
        getPicture().delete();
    }


}
