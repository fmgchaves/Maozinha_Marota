package io.bootcamp.vimtages.Item;

import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

//will override and use abstract Items methods
public class Donut extends Item {
    public Donut(Position position, Picture donut) {
        super ( position );
        donut = new Picture(position.getCol(), position.getRow(), "resources/donut.avif"); //convert this position to pixel javaFXGrid getWidth and Height
    }


}
