package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Game;
import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Beer;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Obstacle.Box;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

public class Moes extends Level {

    private boolean levelComplete;

    public Moes (Hand hand) {
        super ( hand );
    }
    Picture backscreen = new Picture(10,10,"Levels/Bar background.png");
    private String boxImage = "Item/Caixabar.png";
    private String beerImage= "Item/Cerveja_resized.png";
    
    Donut donut = new Donut ( 13* Game.getCellSize()+Game.getPadding(), 2* Game.getCellSize()+Game.getPadding() , "Item/Donutresized.png");
    Box box1 = new Box (  5* Game.getCellSize()+Game.getPadding(), Game.getCellSize()+Game.getPadding(),boxImage);
    Box box2 = new Box (  6* Game.getCellSize()+Game.getPadding(), Game.getCellSize()+Game.getPadding(),boxImage);
    Box box3 = new Box (  11* Game.getCellSize()+Game.getPadding(), 5 * Game.getCellSize()+Game.getPadding() ,boxImage);
    Box box4 = new Box ( 8* Game.getCellSize()+Game.getPadding(), Game.getCellSize()+Game.getPadding(),boxImage);
    Box box5 = new Box ( 9* Game.getCellSize()+Game.getPadding(), Game.getCellSize()+Game.getPadding(),boxImage );
    Box box6 = new Box (  12* Game.getCellSize()+Game.getPadding(), Game.getCellSize()+Game.getPadding(),boxImage);
    Box box7 = new Box (   13* Game.getCellSize()+Game.getPadding(), Game.getCellSize()+Game.getPadding(),boxImage);
    Box box8 = new Box (   14* Game.getCellSize()+Game.getPadding(), Game.getCellSize() +Game.getPadding(),boxImage);
    Box box9 = new Box (  15* Game.getCellSize()+Game.getPadding(),  Game.getCellSize() +Game.getPadding(),boxImage);
    Box box10 = new Box (  16* Game.getCellSize()+Game.getPadding(),  Game.getCellSize() +Game.getPadding(),boxImage);
    Box box11 = new Box (  5* Game.getCellSize()+Game.getPadding(), 2 * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box12 = new Box (   5* Game.getCellSize()+Game.getPadding(), 3 * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box13 = new Box (   5* Game.getCellSize()+Game.getPadding(), 4 * Game.getCellSize() +Game.getPadding(),boxImage);
    Box box14 = new Box (   5* Game.getCellSize()+Game.getPadding(), 5 * Game.getCellSize()+Game.getPadding() ,boxImage);
    Box box15 = new Box (   11* Game.getCellSize()+Game.getPadding(), Game.getCellSize() +Game.getPadding() ,boxImage);
    Box box16 = new Box (   6* Game.getCellSize()+Game.getPadding(), 4* Game.getCellSize()+Game.getPadding()  ,boxImage);
    Box box17 = new Box (   6* Game.getCellSize()+Game.getPadding(), 5* Game.getCellSize() +Game.getPadding(),boxImage);
    Box box18 = new Box (   7* Game.getCellSize()+Game.getPadding(), 4 * Game.getCellSize()+Game.getPadding() ,boxImage);
    Box box19 = new Box (   7* Game.getCellSize()+Game.getPadding(), 5 * Game.getCellSize()+Game.getPadding() ,boxImage);
    Box box20 = new Box (   8* Game.getCellSize()+Game.getPadding(), 4 * Game.getCellSize() +Game.getPadding(),boxImage);
    Box box21 = new Box (   8* Game.getCellSize()+Game.getPadding(), 5 * Game.getCellSize()+Game.getPadding() ,boxImage);
    Box box22 = new Box (   9* Game.getCellSize()+Game.getPadding(), 4 * Game.getCellSize() +Game.getPadding(),boxImage);
    Box box23 = new Box (   9* Game.getCellSize()+Game.getPadding(), 5 * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box24 = new Box (   10* Game.getCellSize()+Game.getPadding(), 4 * Game.getCellSize()+Game.getPadding() ,boxImage);
    Box box25 = new Box (   10* Game.getCellSize()+Game.getPadding(), 5 * Game.getCellSize() +Game.getPadding(),boxImage);
    Box box26 = new Box (   11* Game.getCellSize()+Game.getPadding(), 4 * Game.getCellSize()+Game.getPadding() ,boxImage);
    Box box27 = new Box (   12* Game.getCellSize()+Game.getPadding(), 4 * Game.getCellSize() +Game.getPadding(),boxImage);
    Box box28 = new Box (   12* Game.getCellSize()+Game.getPadding(), 5  * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box29 = new Box (   13* Game.getCellSize()+Game.getPadding(), 4  * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box30 = new Box (   13* Game.getCellSize()+Game.getPadding(), 5  * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box31 = new Box (   14* Game.getCellSize()+Game.getPadding(), 4  * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box32 = new Box (   14* Game.getCellSize()+Game.getPadding(), 5  * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box33 = new Box (   15* Game.getCellSize()+Game.getPadding(), 4* Game.getCellSize() +Game.getPadding() ,boxImage);
    Box box34 = new Box (   15* Game.getCellSize()+Game.getPadding(), 5  * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box35 = new Box (   16* Game.getCellSize()+Game.getPadding(), 2  * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box36 = new Box (   16* Game.getCellSize()+Game.getPadding(), 3  * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box37 = new Box (   16* Game.getCellSize()+Game.getPadding(), 4  * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box38 = new Box (   16* Game.getCellSize()+Game.getPadding(), 5  * Game.getCellSize()+Game.getPadding(),boxImage);
    Box box39 = new Box (   7* Game.getCellSize()+Game.getPadding(), Game.getCellSize() +Game.getPadding() ,boxImage);
    Box box40 = new Box (  15* Game.getCellSize()+Game.getPadding(), 9 * Game.getCellSize() +Game.getPadding(),boxImage);
    Box box41 = new Box (  10* Game.getCellSize()+Game.getPadding(),  Game.getCellSize()+Game.getPadding(),boxImage);
    Box box42 = new Box (   6* Game.getCellSize()+Game.getPadding(), 9 * Game.getCellSize()+Game.getPadding(),boxImage);
    Beer beer1 = new Beer (   5* Game.getCellSize()+Game.getPadding(), 9* Game.getCellSize()  +Game.getPadding(),beerImage);
    Beer beer2 = new Beer (   16* Game.getCellSize()+Game.getPadding(), 9 * Game.getCellSize() +Game.getPadding(),beerImage);
    
    @Override
    public void makeCenario () {
        Hand hand = getHand();
        hand.erase ();
        
        placeItem ( donut );
        placeItem ( box1 );
        placeItem ( box2 );
        placeItem ( box3 );
        placeItem ( box4 );
        placeItem ( box5 );
        placeItem ( box6 );
        placeItem ( box7 );
        placeItem ( box8 );
        placeItem ( box9 );
        placeItem ( box10 );
        placeItem ( box11 );
        placeItem ( box12 );
        placeItem ( box13 );
        placeItem ( box14 );
        placeItem ( box15 );
        placeItem ( box16 );
        placeItem ( box17 );
        placeItem ( box18 );
        placeItem ( box19 );
        placeItem ( box20 );
        placeItem ( box21 );
        placeItem ( box22 );
        placeItem ( box23 );
        placeItem ( box24 );
        placeItem ( box25 );
        placeItem ( box26 );
        placeItem ( box27 );
        placeItem ( box28 );
        placeItem ( box29 );
        placeItem ( box30 );
        placeItem ( box31 );
        placeItem ( box32 );
        placeItem ( box33 );
        placeItem ( box34 );
        placeItem ( box35 );
        placeItem ( box36 );
        placeItem ( box37 );
        placeItem ( box38 );
        placeItem ( box39 );
        placeItem ( box40 );
        placeItem ( box41 );
        placeItem ( box42 );
        placeItem ( beer1 );
        placeItem ( beer2 );
    
        ArrayList<Picture> temp = getArray();
        for (Picture item : temp) {
            Picture exp = item;
            System.out.println(item);
            exp.draw();
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
        System.out.println(getLevelComplete());

        if ((hand.getHandX() == donut.getX()) && (hand.getHandY() == donut.getY())) {
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
        hand.translateInitialPosition(19*80+10 - dx, 9*80+10 - dy);

       setHand(hand);
    }
    
    @Override
    public void giveLevelFinalScreen () {
        int min1 = 50;
        int min2 = 70;
    
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

