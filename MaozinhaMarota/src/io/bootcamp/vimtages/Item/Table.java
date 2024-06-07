package io.bootcamp.vimtages.Item;

import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Table extends Item{

    public Table(Position position) {
        super(position);
    }

    @Override
    public void draw() {
        String Path = "./resources/item/table.png";
        setPicture(new Picture((getPosition().getCol()*80)+10,(getPosition().getRow()*80)+10,Path));
        getPicture().draw();
    }

    @Override
    public void erase() {
//        getPicture().delete(); // this object can't be erased, but the method had to be overridden
    }
}
