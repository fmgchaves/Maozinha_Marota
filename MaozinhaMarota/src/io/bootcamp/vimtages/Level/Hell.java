package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Game;
import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Flanders;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

public class Hell extends Level {

    public Hell( Hand hand) {
        super(hand);
    }
    private String donutImage = "Item/Donutresized.png";
    private String flandersImage = "Item/Devil_Flanders.png";
    private Donut donut = new Donut (13* Game.getCellSize()+Game.getPadding(),2*Game.getCellSize()+Game.getPadding(),donutImage);
    private Flanders flanders = new Flanders (13* Game.getCellSize()-25, 3* Game.getCellSize()-30, "Item/Devil_Flanders.png");
    private Picture backscreen = new Picture (10,10,"Levels/Hell background.png");
    
    @Override
    public void makeCenario () {
        Hand hand = getHand ();
        hand.erase ();
        placeItem (flanders);
        placeItem (donut);
    
        ArrayList<Picture> temp = getArray();
        for (Picture item : temp) {
            if (item.getClass ().equals(donut.getClass ())) {
                continue;
            }
            item.draw();
        }
        
        hand.draw ();
    }
    
    @Override
    public void runScenario () {
        Hand hand = getHand();

        System.out.println("hand X: "+hand.getHandX());
        System.out.println("donut X: "+donut.getX());
        System.out.println("hand Y: "+hand.getHandX());
        System.out.println("donut Y: "+donut.getX());
        
        if ((hand.getHandX() == donut.getX()) && (hand.getHandY() == donut.getY())) {
            donut.draw();
            setLevelComplete();
        }
    }
    
    @Override
    public void deleteScenario () {
            Hand hand = getHand();
            ArrayList<Picture> temp = getArray ();
            for (Picture item : temp) {
                item.delete ();
            }
            backscreen.delete ();


            int dx = hand.getHandX();
            int dy = hand.getHandY();
            hand.translateInitialPosition(10 - dx, 10 - dy);

           setHand(hand);
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
