package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
import io.bootcamp.vimtages.Item.Obstacle.Tree;
import io.bootcamp.vimtages.Position;

import java.util.ArrayList;

public class Garden extends Level {
    
    private static Integer numberofTree = 5;
    private ArrayList<Position> TreePositions;
    
    public Garden (Hand hand) {
        super ( hand );
    }
    
    Tree tree1 = new Tree ( new Position ( 3, 2 ) );
    Tree tree2 = new Tree ( new Position ( 6, 6 ) );
    Tree tree3 = new Tree ( new Position ( 12, 7 ) );
    Tree tree4 = new Tree ( new Position ( 15, 3 ) );
    Tree tree5 = new Tree ( new Position ( 18, 5 ) );
    Donut donut = new Donut ( new Position ( 10, 2 ) );
    
    @Override
    public void makeCenario () {
        placeItem ( donut );
        placeItem ( tree1 );
        placeItem ( tree2 );
        placeItem ( tree3 );
        placeItem ( tree4 );
        placeItem ( tree5 );
        for (Integer i = 0; i < numberofTree + 1; i++) {
            System.out.println ( "Object" + getArrayPosIndex ( i ) );
            System.out.println ( "Position Col" + getArrayPosIndex ( i ).getPosition ().getCol () );
            System.out.println ( "Position Row" + getArrayPosIndex ( i ).getPosition ().getRow () );
        }
        
    }
    
    @Override
    public boolean runScenario () {
        ArrayList<Item> temp = getArray ();
        for (Item item : temp) {
            Item exp = item;
            exp.draw ();
        }
        return true;
    }
    
    @Override
    public void deleteScenario () {
        ArrayList<Item> temp = getArray ();
        for (Item item : temp) {
            Item exp = item;
            exp.erase ();
        }
    }
}
