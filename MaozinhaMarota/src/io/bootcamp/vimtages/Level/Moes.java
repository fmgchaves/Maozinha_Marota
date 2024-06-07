package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Beer;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
import io.bootcamp.vimtages.Item.Obstacle.Box;
import io.bootcamp.vimtages.Position;

import java.util.ArrayList;

public class Moes extends Level {
    
    public Moes (Hand hand) {
        super ( hand );
    }
    
    Donut donut = new Donut ( new Position ( 3, 13 ) );
    Box box1 = new Box ( new Position ( 5, 1 ) );
    Box box2 = new Box ( new Position ( 6, 1 ) );
    Box box3 = new Box ( new Position ( 11, 5 ) );
    Box box4 = new Box ( new Position ( 8, 1 ) );
    Box box5 = new Box ( new Position ( 9, 1 ) );
    Box box6 = new Box ( new Position ( 12, 1 ) );
    Box box7 = new Box ( new Position ( 13, 1 ) );
    Box box8 = new Box ( new Position ( 14, 1 ) );
    Box box9 = new Box ( new Position ( 15, 1 ) );
    Box box10 = new Box ( new Position ( 16, 1 ) );
    Box box11 = new Box ( new Position ( 5, 2 ) );
    Box box12 = new Box ( new Position ( 5, 3 ) );
    Box box13 = new Box ( new Position ( 5, 4 ) );
    Box box14 = new Box ( new Position ( 5, 5 ) );
    Box box15 = new Box ( new Position ( 11, 1 ) );
    Box box16 = new Box ( new Position ( 6, 4 ) );
    Box box17 = new Box ( new Position ( 6, 5 ) );
    Box box18 = new Box ( new Position ( 7, 4 ) );
    Box box19 = new Box ( new Position ( 7, 5 ) );
    Box box20 = new Box ( new Position ( 8, 4 ) );
    Box box21 = new Box ( new Position ( 8, 5 ) );
    Box box22 = new Box ( new Position ( 9, 4 ) );
    Box box23 = new Box ( new Position ( 9, 5 ) );
    Box box24 = new Box ( new Position ( 10, 4 ) );
    Box box25 = new Box ( new Position ( 10, 5 ) );
    Box box26 = new Box ( new Position ( 11, 4 ) );
    Box box27 = new Box ( new Position ( 12, 4 ) );
    Box box28 = new Box ( new Position ( 12, 5 ) );
    Box box29 = new Box ( new Position ( 13, 4 ) );
    Box box30 = new Box ( new Position ( 13, 5 ) );
    Box box31 = new Box ( new Position ( 14, 4 ) );
    Box box32 = new Box ( new Position ( 14, 5 ) );
    Box box33 = new Box ( new Position ( 15, 4 ) );
    Box box34 = new Box ( new Position ( 15, 5 ) );
    Box box35 = new Box ( new Position ( 16, 2 ) );
    Box box36 = new Box ( new Position ( 16, 3 ) );
    Box box37 = new Box ( new Position ( 16, 4 ) );
    Box box38 = new Box ( new Position ( 16, 5 ) );
    Box box39 = new Box ( new Position ( 7, 1 ) );
    Box box40 = new Box ( new Position ( 15, 9 ) );
    Box box41 = new Box ( new Position ( 10, 1 ) );
    Box box42 = new Box ( new Position ( 6, 9 ) );
    Beer beer1 = new Beer ( new Position ( 5, 9 ) );
    Beer beer2 = new Beer ( new Position ( 16, 9 ) );
    
    @Override
    public void makeCenario () {
        
        placeItem ( box1 );
        placeItem ( box2 );
        placeItem ( box3 );
        placeItem ( box4 );
        placeItem ( box5 );
        placeItem ( box6 );
        placeItem ( box7 );
        placeItem ( box8 );
        placeItem ( box9 );
        placeItem ( box10 );
        placeItem ( box11 );
        placeItem ( box12 );
        placeItem ( box13 );
        placeItem ( box14 );
        placeItem ( box15 );
        placeItem ( box16 );
        placeItem ( box17 );
        placeItem ( box18 );
        placeItem ( box19 );
        placeItem ( box20 );
        placeItem ( box21 );
        placeItem ( box22 );
        placeItem ( box23 );
        placeItem ( box24 );
        placeItem ( box25 );
        placeItem ( box26 );
        placeItem ( box27 );
        placeItem ( box28 );
        placeItem ( box29 );
        placeItem ( box30 );
        placeItem ( box31 );
        placeItem ( box32 );
        placeItem ( box33 );
        placeItem ( box34 );
        placeItem ( box35 );
        placeItem ( box36 );
        placeItem ( box37 );
        placeItem ( box38 );
        placeItem ( box39 );
        placeItem ( box40 );
        placeItem ( box41 );
        placeItem ( box42 );
        placeItem ( beer1 );
        placeItem ( beer2 );
        
        for (Integer i = 0; i < 44; i++) {
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

