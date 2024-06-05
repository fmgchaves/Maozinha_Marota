package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Obstacle.Wall;
import io.bootcamp.vimtages.Position;

public class Moes extends Level {

    public Moes(Hand hand) {
        super(hand);
    }
    
    @Override
    public void makeCenario () {
        placeItem ( new Wall (new Position ( 3,2 )));
    }
    
    @Override
    public void runCenario () {
    
    }
}
