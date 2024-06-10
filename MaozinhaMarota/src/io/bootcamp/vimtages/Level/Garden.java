package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Game;
import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Obstacle.Tree;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

public class Garden extends Level {
    private String treeImage = "Item/Arvoreresized.png";

    private boolean levelComplete;

    private static Integer numberofTree = 5;
    
    public Garden (Hand hand) {
        super ( hand );
    }
    
    Tree tree1 = new Tree ( 10, 10,treeImage);
    Tree tree2 = new Tree (  6*Game.getCellSize(), 6*Game.getCellSize(),treeImage);
    Tree tree3 = new Tree (  12*Game.getCellSize(), 7*Game.getCellSize(),treeImage);
    Tree tree4 = new Tree (  15*Game.getCellSize(), 3*Game.getCellSize(),treeImage);
    Tree tree5 = new Tree ( 18*Game.getCellSize(), 5*Game.getCellSize(), treeImage);
    Donut donut = new Donut ( 5*Game.getCellSize()+Game.getPadding (), 5*Game.getCellSize()+Game.getPadding (),"Item/Donutresized.png");
    Picture backscreen = new Picture (10,10,"/Levels/Jardim background.png");
    
    @Override
    public void makeCenario () {
        placeItem ( donut );
        placeItem ( tree1 );
        placeItem ( tree2 );
        placeItem ( tree3 );
        placeItem ( tree4 );
        placeItem ( tree5 );

        ArrayList<Picture> temp = getArray();
        for (Picture item : temp) {
            Picture exp = item;
            System.out.println(item);
            exp.draw();
        }

       
        
    }

    @Override
    public void runScenario () {
        Hand hand = getHand();

        System.out.println("hand X: "+hand.getHandX());
        System.out.println("donut X: "+donut.getX());
        System.out.println("hand Y: "+hand.getHandX());
        System.out.println("donut Y: "+donut.getX());

        if ((hand.getHandX() == donut.getX()) && (hand.getHandY() == donut.getY())) {
            setLevelComplete();
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
