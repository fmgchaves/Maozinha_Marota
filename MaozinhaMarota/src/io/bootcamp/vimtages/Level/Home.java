package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
import io.bootcamp.vimtages.Item.Obstacle.Characters.Maggie;
import io.bootcamp.vimtages.Item.Obstacle.Tree;
import io.bootcamp.vimtages.Position;

import java.util.ArrayList;

public class Home extends Level {

    public Home(Hand hand) {
        super(hand);
    }

    Maggie maggie = new Maggie(new Position(3,7));
    Donut donut = new Donut (new Position (3,7));

    @Override
    public void makeCenario () {
        placeItem ( donut );
        placeItem (maggie);
    }
    
    @Override
    public void runScenario() {
        ArrayList<Item> temp = getArray();
        for (Item item : temp) {
            Item exp = item;
            exp.draw();
        }
    }
}
