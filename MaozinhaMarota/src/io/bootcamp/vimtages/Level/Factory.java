package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Game;
import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Obstacle.Radioactive;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

public class Factory extends Level {
    Picture backscreen = new Picture (10,10,"Levels/Factory background.png");
    String radioactiveImage = "Item/Pepita Vertical.png";
    String donnutImage = "Item/Donutresized.png";
    private static Integer numberofWall = 27;
    Donut donut = new Donut (6*Game.getCellSize()+Game.getPadding(),5*Game.getCellSize()+Game.getPadding(),donnutImage);
    Radioactive Radio1 = new Radioactive(5*Game.getCellSize()+Game.getPadding(),4*Game.getCellSize()+Game.getPadding(),radioactiveImage );
    Radioactive Radio2 = new Radioactive( 5*Game.getCellSize()+Game.getPadding(),5*Game.getCellSize()+Game.getPadding(),radioactiveImage );
    Radioactive Radio3 = new Radioactive(6*Game.getCellSize()+Game.getPadding(),4*Game.getCellSize()+Game.getPadding(),radioactiveImage );
    Radioactive Radio4 = new Radioactive(6*Game.getCellSize()+Game.getPadding(),6*Game.getCellSize()+Game.getPadding() ,radioactiveImage);
    Radioactive Radio5 = new Radioactive(7*Game.getCellSize()+Game.getPadding(),4*Game.getCellSize()+Game.getPadding(),radioactiveImage );
    Radioactive Radio6 = new Radioactive( 7*Game.getCellSize()+Game.getPadding(),6 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio7 = new Radioactive( 8*Game.getCellSize()+Game.getPadding(),2 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio8 = new Radioactive( 8*Game.getCellSize()+Game.getPadding(),3*Game.getCellSize()+Game.getPadding() ,radioactiveImage);
    Radioactive Radio9 = new Radioactive( 8*Game.getCellSize()+Game.getPadding(),4 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio10 = new Radioactive( 9*Game.getCellSize()+Game.getPadding(),2 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio11 = new Radioactive( 9*Game.getCellSize()+Game.getPadding(),6 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio12 = new Radioactive( 10*Game.getCellSize()+Game.getPadding(),2*Game.getCellSize()+Game.getPadding() ,radioactiveImage);
    Radioactive Radio13 = new Radioactive( 10*Game.getCellSize()+Game.getPadding(),4 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio14 = new Radioactive( 10*Game.getCellSize()+Game.getPadding(),5 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio15 = new Radioactive( 10*Game.getCellSize()+Game.getPadding(),6 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio16 = new Radioactive( 11*Game.getCellSize()+Game.getPadding(),2 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio17 = new Radioactive( 11*Game.getCellSize()+Game.getPadding(),4*Game.getCellSize() +Game.getPadding(),radioactiveImage);
    Radioactive Radio18 = new Radioactive( 12*Game.getCellSize()+Game.getPadding(),2 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio19 = new Radioactive( 12*Game.getCellSize()+Game.getPadding(),4*Game.getCellSize() +Game.getPadding(),radioactiveImage);
    Radioactive Radio20 = new Radioactive( 13*Game.getCellSize()+Game.getPadding(),2*Game.getCellSize()+Game.getPadding() ,radioactiveImage);
    Radioactive Radio21 = new Radioactive( 13*Game.getCellSize()+Game.getPadding(),4*Game.getCellSize() +Game.getPadding(),radioactiveImage);
    Radioactive Radio22 = new Radioactive( 13*Game.getCellSize()+Game.getPadding(),5*Game.getCellSize() +Game.getPadding(),radioactiveImage);
    Radioactive Radio23 = new Radioactive( 14*Game.getCellSize()+Game.getPadding(),2*Game.getCellSize() +Game.getPadding(),radioactiveImage);
    Radioactive Radio24 = new Radioactive( 15*Game.getCellSize()+Game.getPadding(),2 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio25 = new Radioactive( 15*Game.getCellSize()+Game.getPadding(),3*Game.getCellSize() +Game.getPadding(),radioactiveImage);
    Radioactive Radio26 = new Radioactive( 15*Game.getCellSize()+Game.getPadding(),4 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio27 = new Radioactive( 15*Game.getCellSize()+Game.getPadding(),5*Game.getCellSize() +Game.getPadding(),radioactiveImage);
    Radioactive Radio28 = new Radioactive( 5*Game.getCellSize()+Game.getPadding(),6 *Game.getCellSize()+Game.getPadding(),radioactiveImage);
    Radioactive Radio29 = new Radioactive( 8*Game.getCellSize()+Game.getPadding(),6 *Game.getCellSize()+Game.getPadding(),radioactiveImage);

    public Factory(Hand hand) {
        super(hand);
    }

    @Override
    public void makeCenario () {
        Hand hand = getHand();
        hand.erase ();
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

        ArrayList<Picture> temp = getArray();
        for (Picture item : temp) {
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
            setLevelComplete();
        }
    }

    @Override
    public void deleteScenario () {
        Hand hand = getHand();
        hand.changePic("Item/HandLeft.png");
        ArrayList<Picture> temp = getArray ();
        for (Picture item : temp) {
            item.delete ();
        }
        backscreen.delete ();

        hand.erase();
        setHand(hand);
        int dx = hand.getHandX();
        int dy = hand.getHandY();


        hand.translateInitialPosition(10*80+10 - dx, 9*80+10 - dy);

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
