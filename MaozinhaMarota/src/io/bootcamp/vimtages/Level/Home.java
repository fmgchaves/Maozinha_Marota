package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Game;
import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
import io.bootcamp.vimtages.Item.Maggie;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

public class Home extends Level {

    public Home(Hand hand) {
        super(hand);
    }
    Picture backscreen = new Picture(Game.getPadding(),Game.getPadding(),"Levels/defaultImage.jpg");
    Maggie maggie = new Maggie(3*Game.getCellSize(),7*Game.getCellSize(),"Item/Meggie_resized.png");
    Donut donut = new Donut (3*Game.getCellSize(),7*Game.getCellSize(),"Item/Donutresized.png");

    @Override
    public void makeCenario () {
        placeItem ( donut );
        placeItem (maggie);
    }

    @Override
    public void runScenario () {
        Hand hand = getHand();

        ArrayList<Picture> temp = getArray();
        for (Picture item : temp) {
            Picture exp = item;
            // if (exp.equals(Radio1)) {
            //   exp.draw("a");
            //}
            exp.draw();
        }

        System.out.println ("donut Col: "+donut.getX ());
        System.out.println ("donut Row: "+donut.getY());
        System.out.println ("hand Col: "+hand.getHandX ()/ Game.getCellSize ());
        System.out.println ("hand Row: "+hand.getHandY ()/Game.getCellSize ());

        if (hand.getHandX() == donut.getX() && hand.getHandY() == donut.getY()) {
            setLevelComplete();
        }
    }

    @Override
    public void deleteScenario () {
        Hand hand = getHand();
        ArrayList<Picture> temp = getArray ();
        for (Picture item : temp) {
            Picture exp = item;
            exp.delete ();
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
        Picture homescreen = new Picture (10,10,"/Levels/Jardim background.png");
        homescreen.draw();
    }
    
    /*
    private class Star extends Item{
        
        private Picture picture;
        
        private Star(Position position){
            super(position);
            String Path = "./resources/item/star.png";
            setPicture(new Picture(getPosition().getCol(),getPosition().getRow(),Path));
            getPicture().draw();
        }
    }
    
    private class PressSpace extends Item{
        
        private Picture picture;
        
        public PressSpace(Position position) {
            super(position);
            String Path = "./resources/item/pressSpace.png";
            setPicture(new Picture (getPosition().getCol(),getPosition().getRow(),Path));
            getPicture().draw();
        }
        
        @Override
        public void draw() {
        
        }
        
        @Override
        public void erase() {
        
        }
    }
    
     */
}


