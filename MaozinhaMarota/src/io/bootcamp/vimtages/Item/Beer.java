package io.bootcamp.vimtages.Item;

import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Beer extends Item{
	public Beer (Position position) {
		super ( position );
	}

	@Override
	public void draw() {
		String Path = "Item/owl_victory_roll_2_80x80_by_moogleymog-d4nz5kd-1954011555.gif";
		setPicture(new Picture((getPosition().getCol()*80)+10,(getPosition().getRow()*80)+10,Path));
		getPicture().draw();
	}

	@Override
	public void erase() {

	}
}
