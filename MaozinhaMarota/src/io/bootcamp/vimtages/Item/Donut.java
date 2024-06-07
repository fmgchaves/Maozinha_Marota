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
        String Path = "./resources/item/owl_victory_roll_2_80x80_by_moogleymog-d4nz5kd-1954011555.gif";
        setPicture(new Picture((getPosition().getCol()*80)+10,(getPosition().getRow()*80)+10,Path));
        getPicture().draw();
    }
    public void erase() {
        getPicture().delete();
    }
}
