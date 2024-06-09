package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Game;
import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
import io.bootcamp.vimtages.Item.Obstacle.Tree;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

public class Garden extends Level {
    String treeImage="Item/Arvoreresized.png";
    //Instanciar a mão
    private static Integer numberofTree = 5;
    private ArrayList<Picture> TreePositions;
    
    public Garden (Hand hand) {
        super ( hand );
    }
    
    Tree tree1 = new Tree ( 3*Game.getCellSize(), 2*Game.getCellSize(),treeImage );
    Tree tree2 = new Tree (  6*Game.getCellSize(), 6*Game.getCellSize(),treeImage);
    Tree tree3 = new Tree (  12*Game.getCellSize(), 7*Game.getCellSize(),treeImage);
    Tree tree4 = new Tree (  15*Game.getCellSize(), 3*Game.getCellSize(),treeImage);
    Tree tree5 = new Tree ( 18*Game.getCellSize(), 5*Game.getCellSize(), treeImage);
    Donut donut = new Donut ( 0, 0,treeImage);
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
            System.out.println ( "Position Col" + getArrayPosIndex ( i ).getY() );
            System.out.println ( "Position Row" + getArrayPosIndex ( i ).getX() );
        }
        
    }
    
    @Override
    public boolean runScenario () {
        Hand hand = getHand ();
    
        ArrayList<Picture> temp = getArray();
        for (Picture item : temp) {
            Picture exp = item;
           // if (exp.equals(Radio1)) {
             //   exp.draw("a");
            //}
            exp.draw();
        }
    
        System.out.println ("donut Col: "+donut.getY ());
        System.out.println ("donut Row: "+donut.getX());
        System.out.println ("hand Col: "+hand.getHandX ()/ Game.getCellSize ());
        System.out.println ("hand Row: "+hand.getHandY ()/Game.getCellSize ());
        
        
        if (hand.getHandX()>= donut.getX() && hand.getHandY() >= donut.getY()) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public void deleteScenario () {
        ArrayList<Picture> temp = getArray ();
        for (Picture item : temp) {
            Picture exp = item;
            exp.delete ();
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
