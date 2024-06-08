package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
import io.bootcamp.vimtages.Item.Obstacle.Tree;
import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

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
    Donut donut = new Donut ( new Position ( 0, 0) );
    Picture backscreen = new Picture (10,10,"/Levels/Jardim background.png");
    
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
        //drawScreen ();
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
        backscreen.delete ();
    }
    
    @Override
    public void giveLevelFinalScreen () {
        int min1 = 20;
        int min2 = 40;
    
        Hand hand = getHand ();
        Picture star1 = new Picture (608,400, "Item/star.png");
        Picture star2 = new Picture (808,400, "Item/star.png");
        Picture star3 = new Picture (1010,400, "Item/star.png");
    
        if(hand.getNumberOfMoves() <= min1) {
            star1.draw();
            star2.draw();
            star3.draw();
        } else if (min1 < hand.getNumberOfMoves() && hand.getNumberOfMoves() <= min2){
            star1.draw();
            star3.draw();
        } else {
            star2.draw();
        }
    }
    
    @Override
    public void drawScreen () {
        backscreen.draw();
    }
}
