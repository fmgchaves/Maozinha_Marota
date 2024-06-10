package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Game;
import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Maggie;
import io.bootcamp.vimtages.Item.Obstacle.Box;
import io.bootcamp.vimtages.Sound;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.io.IOException;
import java.util.ArrayList;

public class Home extends Level {
    
    Sound sound = new Sound ();

    public Home(Hand hand) {
        super(hand);
    }
    
    private String backscreenpath = "Levels/Casa background.png";
    private String maggiepath = "Item/Meggie_resized.png";
    private String donutpath = "Item/Donutresized.png";

    private String boxImage = "Item/Caixabar.png";
    Picture backscreen = new Picture(Game.getPadding(),Game.getPadding(),backscreenpath);
    Maggie maggie = new Maggie(3*Game.getCellSize(),7*Game.getCellSize(),maggiepath);
    Donut donut = new Donut (3*Game.getCellSize()+Game.getPadding (),7*Game.getCellSize()+Game.getPadding (),donutpath);

    Box box1 = new Box(10*Game.getCellSize()+Game.getPadding (), 9*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box2 = new Box(9*Game.getCellSize()+Game.getPadding (), 9*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box3 = new Box(10*Game.getCellSize()+Game.getPadding (), 8*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box4 = new Box(9*Game.getCellSize()+Game.getPadding (), 8*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box5 = new Box(10*Game.getCellSize()+Game.getPadding (), 7*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box6 = new Box(9*Game.getCellSize()+Game.getPadding (), 7*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box7 = new Box(8*Game.getCellSize()+Game.getPadding (), 7*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box8 = new Box(9*Game.getCellSize()+Game.getPadding (), 6*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box9 = new Box(8*Game.getCellSize()+Game.getPadding (), 6*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box10 = new Box(9*Game.getCellSize()+Game.getPadding (), 5*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box11 = new Box(8*Game.getCellSize()+Game.getPadding (), 5*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box12 = new Box(9*Game.getCellSize()+Game.getPadding (), 4*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box13 = new Box(8*Game.getCellSize()+Game.getPadding (), 4*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box14 = new Box(9*Game.getCellSize()+Game.getPadding (), 3*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box15 = new Box(8*Game.getCellSize()+Game.getPadding (), 3*Game.getCellSize()+Game.getPadding (),boxImage);
    Box box16 = new Box(8*Game.getCellSize()+Game.getPadding (), 2*Game.getCellSize()+Game.getPadding (),boxImage);


    @Override
    public void makeCenario () {
        sound.playSound ( "MaozinhaMarota/resources/Sound/Simpsons1.wav" );
        placeItem (maggie);
        placeItem ( donut );
        placeItem(box1);
        placeItem(box2);
        placeItem(box3);
        placeItem(box4);
        placeItem(box5);
        placeItem(box6);
        placeItem(box7);
        placeItem(box8);
        placeItem(box9);
        placeItem(box10);
        placeItem(box11);
        placeItem(box12);
        placeItem(box13);
        placeItem(box14);
        placeItem(box15);
        placeItem(box16);

        Hand hand = getHand();
        hand.erase ();
        ArrayList<Picture> temp = getArray();
        for (Picture item : temp) {
            if (item.getClass ().equals(donut.getClass ()) || item.getClass().equals(Box.class)) {
                continue;
            } else {
               item.draw();
            }


        }
    
        hand.draw ();
        
    }

    @Override
    public void runScenario () throws IOException {
        Hand hand = getHand();

    
        System.out.println("hand X: "+hand.getHandX());
        System.out.println("donut X: "+donut.getX());
        System.out.println("hand Y: "+hand.getHandX());
        System.out.println("donut Y: "+donut.getX());

        if (hand.getHandX() == donut.getX() && hand.getHandY() == donut.getY()) {
            sound.stopSound ();
            donut.draw();
            setLevelComplete();
            sound.playSound ( "MaozinhaMarota/resources/Sound/Simpsons1.wav" );
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
        int dx = hand.getHandX();
        int dy = hand.getHandY();

        hand.translateInitialPosition(10*80+10 - dx, 7*80+10 - dy);


       setHand(hand);
    }
    
    @Override
    public void giveLevelFinalScreen () {
        int min1 = 40;
        int min2 = 60;
        
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


