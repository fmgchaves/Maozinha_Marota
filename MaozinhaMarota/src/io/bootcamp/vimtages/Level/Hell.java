package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
import io.bootcamp.vimtages.Item.Obstacle.Tree;
import io.bootcamp.vimtages.Position;

import java.util.ArrayList;

public class Hell extends Level {

    public Hell( Hand hand) {
        super(hand);
    }

    Donut donut = new Donut (new Position (10,3));
    
    @Override
    public void makeCenario () {
        placeItem (donut);

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
