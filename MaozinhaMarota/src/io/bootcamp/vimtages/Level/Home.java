package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Obstacle.Tree;
import io.bootcamp.vimtages.Position;

public class Home extends Level {

    public Home(Donut donut, Hand hand) {
        super(donut, hand);
    }
    
    @Override
    public void makeCenario () {
        placeItem ( new Tree (new Position ( 3,2 )));
        
    }
    
    @Override
    public void runCenario () {
    
    }
}
