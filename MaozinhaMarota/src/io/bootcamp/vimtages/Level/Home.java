package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Obstacle.Characters.Maggie;
import io.bootcamp.vimtages.Item.Obstacle.Characters.Marge;
import io.bootcamp.vimtages.Item.Obstacle.Tree;
import io.bootcamp.vimtages.Position;

public class Home extends Level {

    public Home(Hand hand) {
        super(hand);
    }
    
    @Override
    public void makeCenario () {
        placeItem ( new Marge(new Position ( 7,5 )));
        placeItem ( new Maggie(new Position ( 3,8 )));
    }
    
    @Override
    public void runCenario () {
    
    }
}
