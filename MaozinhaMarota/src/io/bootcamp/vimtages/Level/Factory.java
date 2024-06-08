package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
import io.bootcamp.vimtages.Item.Obstacle.Radioactive;
import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

public class Factory extends Level {

    private static Integer numberofWall = 27;
    Donut donut = new Donut (new Position (6,5));
    Radioactive Radio1 = new Radioactive(new Position ( 5,4 ));
    Radioactive Radio2 = new Radioactive(new Position ( 5,5 ));
    Radioactive Radio3 = new Radioactive(new Position ( 6,4 ));
    Radioactive Radio4 = new Radioactive(new Position ( 6,6 ));
    Radioactive Radio5 = new Radioactive(new Position ( 7,4 ));
    Radioactive Radio6 = new Radioactive(new Position ( 7,6 ));
    Radioactive Radio7 = new Radioactive(new Position ( 8,2 ));
    Radioactive Radio8 = new Radioactive(new Position ( 8,3 ));
    Radioactive Radio9 = new Radioactive(new Position ( 8,4 ));
    Radioactive Radio10 = new Radioactive(new Position ( 9,2 ));
    Radioactive Radio11 = new Radioactive(new Position ( 9,6 ));
    Radioactive Radio12 = new Radioactive(new Position ( 10,2 ));
    Radioactive Radio13 = new Radioactive(new Position ( 10,4 ));
    Radioactive Radio14 = new Radioactive(new Position ( 10,5 ));
    Radioactive Radio15 = new Radioactive(new Position ( 10,6 ));
    Radioactive Radio16 = new Radioactive(new Position ( 11,2 ));
    Radioactive Radio17 = new Radioactive(new Position ( 11,4 ));
    Radioactive Radio18 = new Radioactive(new Position ( 12,2 ));
    Radioactive Radio19 = new Radioactive(new Position ( 12,4 ));
    Radioactive Radio20 = new Radioactive(new Position ( 13,2 ));
    Radioactive Radio21 = new Radioactive(new Position ( 13,4 ));
    Radioactive Radio22 = new Radioactive(new Position ( 13,5 ));
    Radioactive Radio23 = new Radioactive(new Position ( 14,2 ));
    Radioactive Radio24 = new Radioactive(new Position ( 15,2 ));
    Radioactive Radio25 = new Radioactive(new Position ( 15,3 ));
    Radioactive Radio26 = new Radioactive(new Position ( 15,4 ));
    Radioactive Radio27 = new Radioactive(new Position ( 15,5 ));
    Radioactive Radio28 = new Radioactive(new Position ( 5,6 ));
    Radioactive Radio29 = new Radioactive(new Position ( 8,6 ));

    public Factory(Hand hand) {
        super(hand);
    }

    @Override
    public void makeCenario () {

        placeItem (donut);
        placeItem (Radio1);
        placeItem (Radio2);
        placeItem (Radio3);
        placeItem (Radio4);
        placeItem (Radio5);
        placeItem (Radio6);
        placeItem (Radio7);
        placeItem (Radio8);
        placeItem (Radio9);
        placeItem (Radio10);
        placeItem (Radio11);
        placeItem (Radio12);
        placeItem (Radio13);
        placeItem (Radio14);
        placeItem (Radio15);
        placeItem (Radio16);
        placeItem (Radio17);
        placeItem (Radio18);
        placeItem (Radio19);
        placeItem (Radio20);
        placeItem (Radio21);
        placeItem (Radio22);
        placeItem (Radio23);
        placeItem (Radio24);
        placeItem (Radio25);
        placeItem (Radio26);
        placeItem (Radio27);
        placeItem (Radio28);
        placeItem (Radio29);

        
        for (Integer i = 0; i < numberofWall; i++) {
            System.out.println ("Object" + getArrayPosIndex (i));
            System.out.println ("Position Col" + getArrayPosIndex ( i ).getPosition ().getCol (  ));
            System.out.println ("Position Row" + getArrayPosIndex ( i ).getPosition ().getRow (  ));
        }
    }
    
    @Override
    public boolean runScenario() {
        ArrayList<Item> temp = getArray();
        for (Item item : temp) {
            Item exp = item;
            if (exp.equals(Radio1)) {
                exp.draw("a");
            }
            exp.draw();
        }

       // Item exp = getArrayPosIndex(0);
       // exp.draw();
        //exp.erase();
        
        
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
    
    }
}
