package io.bootcamp.vimtages.Item;

import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Beer extends Item{
	public Beer (Position position) {
		super ( position );
	}

	@Override
	public void draw() {
		String Path = "Item/Cerveja_resized.png ";
		setPicture(new Picture((getPosition().getCol()*80)+10,(getPosition().getRow()*80)+10,Path));
		getPicture().draw();
	}

	@Override
	public void erase() {

	}
}
