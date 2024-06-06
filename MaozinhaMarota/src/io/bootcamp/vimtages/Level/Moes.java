package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Beer;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Obstacle.Balcony;

import io.bootcamp.vimtages.Item.Obstacle.Box;
import io.bootcamp.vimtages.Item.Obstacle.Chairs.Chair;
import io.bootcamp.vimtages.Position;

public class Moes extends Level {

    public Moes(Hand hand) {
        super(hand);
    }
    
    @Override
    public void makeCenario () {
        placeItem(new Donut(new Position(3,13)));
        placeItem ( new Box (new Position ( 5,1 )));
        placeItem ( new Box (new Position ( 6,1 )));
        placeItem ( new Box (new Position ( 7,1 )));
        placeItem ( new Box (new Position ( 8,1 )));
        placeItem ( new Box (new Position ( 9,1 )));
        placeItem ( new Box (new Position ( 10,1 )));
        placeItem ( new Box (new Position ( 11,1 )));
        placeItem ( new Box (new Position ( 12,1 )));
        placeItem ( new Box (new Position ( 13,1 )));
        placeItem ( new Box (new Position ( 14,1 )));
        placeItem ( new Box (new Position ( 15,1 )));
        placeItem ( new Box (new Position ( 16,1 )));
        placeItem ( new Box(new Position ( 5,2 )));
        placeItem ( new Box(new Position ( 5,3 )));
        placeItem ( new Box(new Position ( 5,4 )));
        placeItem ( new Box(new Position ( 5,5 )));
        placeItem ( new Box(new Position ( 5,6 )));
        placeItem ( new Box(new Position ( 6,4 )));
        placeItem ( new Box(new Position ( 6,5 )));
        placeItem ( new Box(new Position ( 7,4 )));
        placeItem ( new Box(new Position ( 7,5 )));
        placeItem ( new Box(new Position ( 8,4 )));
        placeItem ( new Box(new Position ( 8,5 )));
        placeItem ( new Box(new Position ( 9,4 )));
        placeItem ( new Box(new Position ( 9,5 )));
        placeItem ( new Box(new Position ( 10,4 )));
        placeItem ( new Box(new Position ( 10,5 )));
        placeItem ( new Box(new Position ( 11,4 )));
        placeItem ( new Box(new Position ( 11,5 )));
        placeItem ( new Box(new Position ( 12,4 )));
        placeItem ( new Box(new Position ( 12,5 )));
        placeItem ( new Box(new Position ( 13,4 )));
        placeItem ( new Box(new Position ( 13,5 )));
        placeItem ( new Box(new Position ( 14,4 )));
        placeItem ( new Box(new Position ( 14,5 )));
        placeItem ( new Box(new Position ( 15,4 )));
        placeItem ( new Box(new Position ( 15,5 )));
        placeItem ( new Box(new Position ( 16,2 )));
        placeItem ( new Box(new Position ( 16,3 )));
        placeItem ( new Box(new Position ( 16,4 )));
        placeItem ( new Box(new Position ( 16,5 )));
        placeItem ( new Beer(new Position ( 5,9 )));
        placeItem ( new Beer(new Position ( 15,9 )));
        placeItem ( new Chair(new Position ( 6,9 )));
        placeItem ( new Chair(new Position ( 14,9 )));
        placeItem ( new Beer(new Position ( 5,9 )));
        placeItem ( new Beer(new Position ( 16,9 )));
        placeItem ( new Balcony (new Position (4,10)));
        placeItem ( new Balcony (new Position (5,10)));
        placeItem ( new Balcony (new Position (6,10)));
        placeItem ( new Balcony (new Position (7,10)));
        placeItem ( new Balcony (new Position (8,10)));
        placeItem ( new Balcony (new Position (9,10)));
        placeItem ( new Balcony (new Position (10,10)));
        placeItem ( new Balcony (new Position (11,10)));
        placeItem ( new Balcony (new Position (12,10)));
        placeItem ( new Balcony (new Position (13,10)));
        placeItem ( new Balcony (new Position (14,10)));
        placeItem ( new Balcony (new Position (15,10)));
    }
    
    @Override
    public void runScenario() {
    
    }
}
