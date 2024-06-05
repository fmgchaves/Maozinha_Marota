package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Obstacle.Tree;
import io.bootcamp.vimtages.Position;

public class Hell extends Level {

    public Hell( Hand hand) {
        super(hand);
    }
    
    @Override
    public void makeCenario () {
        placeItem ( new Tree (new Position ( 3,2 )));
        
    }
    
    @Override
    public void runScenario() {
    
    }
}
