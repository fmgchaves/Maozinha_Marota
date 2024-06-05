package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Obstacle.Tree;
import io.bootcamp.vimtages.Position;

import java.util.ArrayList;

public class Garden extends Level {
    
    private static Integer numberofCoins = 7;
    private static Integer numberofTree = 5;
    private ArrayList<Position> TreePositions;
    
    public Garden(Hand hand) {
        super(hand);
    }
    
    @Override
    public void makeCenario() {
        placeItem ( new Tree (new Position ( 3,2 )));
        placeItem ( new Tree (new Position ( 6,6 )));
        placeItem ( new Tree (new Position ( 12,7 )));
        placeItem ( new Tree (new Position ( 15,3 )));
        placeItem ( new Tree (new Position (18 ,5 )));
        placeItem (new Donut (new Position (10 ,2 )));
        for (Integer i = 0; i < numberofTree + 1; i++) {
            System.out.println ("Object" + getArrayPosIndex (i));
            System.out.println ("Position Col" + getArrayPosIndex ( i ).getPosition ().getCol (  ));
            System.out.println ("Position Row" + getArrayPosIndex ( i ).getPosition ().getRow (  ));
        }
        
    }
    
    @Override
    public void runCenario() {
    
    }
    
    public void setTreePositions() {
    
    }
}
