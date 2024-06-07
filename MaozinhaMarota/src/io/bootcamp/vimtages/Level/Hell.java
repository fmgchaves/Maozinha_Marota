package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
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
    
        for (Integer i = 0; i < 1; i++) {
            System.out.println ("Object" + getArrayPosIndex (i));
            System.out.println ("Position Col" + getArrayPosIndex ( i ).getPosition ().getCol (  ));
            System.out.println ("Position Row" + getArrayPosIndex ( i ).getPosition ().getRow (  ));
        }

    }
    
    @Override
    public boolean runScenario() {
        ArrayList<Item> temp = getArray();
        for (Item item : temp) {
            Item exp = item;
            exp.draw();
        }
        return true;
    }
    
    @Override
    public void deleteScenario () {
        ArrayList<Item> temp = getArray();
        for (Item item : temp) {
            Item exp = item;
            exp.erase();
        }
    }
}
