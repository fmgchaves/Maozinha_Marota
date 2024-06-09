package io.bootcamp.vimtages.Level;

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

    Maggie maggie = new Maggie(new Position(3,7));
    Donut donut = new Donut (new Position (3,7));

    @Override
    public void makeCenario () {
        placeItem ( donut );
        placeItem (maggie);
    }
    
    @Override
    public boolean runScenario() {
        drawScreen ();
        ArrayList<Item> temp = getArray();
        for (Item item : temp) {
            Item exp = item;
            exp.draw();
        }
      //  Hand hand =
      //  if ()
        return true;
    }
    
    @Override
    public void deleteScenario () {
        ArrayList<Item> temp = getArray();
        for (Item item : temp) {
            Item exp = item;
            exp.erase();
        }
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


