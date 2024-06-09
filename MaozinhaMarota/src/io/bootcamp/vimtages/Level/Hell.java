package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Game;
import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

public class Hell extends Level {

    public Hell( Hand hand) {
        super(hand);
    }
    String donutImage = "Item/Donutresized.png";
    Donut donut = new Donut (10* Game.getCellSize(),3*Game.getCellSize(),donutImage);
    Picture backscreen = new Picture (10,10,"/Levels/Hell background.png");
    
    @Override
    public void makeCenario () {
        placeItem (donut);
    
        for (Integer i = 0; i < 1; i++) {
            System.out.println ("Object" + getArrayPosIndex (i));
            System.out.println ("Position Col" + getArrayPosIndex ( i ).getY());
            System.out.println ("Position Row" + getArrayPosIndex ( i ).getX());
        }

    }
    
    @Override
    public boolean runScenario() {
        Hand hand = getHand ();

        ArrayList<Picture> temp = getArray();
        for (Picture item : temp) {
            Picture exp = item;
            exp.draw();
        }

        if (hand.getX()>= donut.getX() && hand.getY() >= donut.getY()) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public void deleteScenario () {
        ArrayList<Picture> temp = getArray();
        for (Picture item : temp) {
            Picture exp = item;
            exp.delete();
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
