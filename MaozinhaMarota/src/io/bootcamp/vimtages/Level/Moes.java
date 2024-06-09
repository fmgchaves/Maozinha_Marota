package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Game;
import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Beer;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
import io.bootcamp.vimtages.Item.Obstacle.Box;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

public class Moes extends Level {
    
    public Moes (Hand hand) {
        super ( hand );
    }
    Picture backscreen = new Picture(Game.getCellSize(),Game.getCellSize(),"Levels/Bar background.png");
    String boxImage = "Item/Caixabar.png";
    Donut donut = new Donut ( 3* Game.getCellSize(), 13* Game.getCellSize() , "Item/Donutresized.png");
    Box box1 = new Box (  5* Game.getCellSize(), Game.getCellSize(),boxImage);
    Box box2 = new Box (  6* Game.getCellSize(), Game.getCellSize(),boxImage);
    Box box3 = new Box (  11* Game.getCellSize(), 5 * Game.getCellSize() ,boxImage);
    Box box4 = new Box ( 8* Game.getCellSize(), Game.getCellSize(),boxImage);
    Box box5 = new Box ( 9* Game.getCellSize(), Game.getCellSize(),boxImage );
    Box box6 = new Box (  12* Game.getCellSize(), 1 * Game.getCellSize(),boxImage);
    Box box7 = new Box (   13* Game.getCellSize(), 1 * Game.getCellSize(),boxImage);
    Box box8 = new Box (   14* Game.getCellSize(), 1* Game.getCellSize() ,boxImage);
    Box box9 = new Box (  15* Game.getCellSize(),  Game.getCellSize() ,boxImage);
    Box box10 = new Box (  16* Game.getCellSize(),  Game.getCellSize() ,boxImage);
    Box box11 = new Box (  5* Game.getCellSize(), 2 * Game.getCellSize(),boxImage);
    Box box12 = new Box (   5* Game.getCellSize(), 3 * Game.getCellSize(),boxImage);
    Box box13 = new Box (   5* Game.getCellSize(), 4 * Game.getCellSize() ,boxImage);
    Box box14 = new Box (   5* Game.getCellSize(), 5 * Game.getCellSize() ,boxImage);
    Box box15 = new Box (   11* Game.getCellSize(), 1* Game.getCellSize()  ,boxImage);
    Box box16 = new Box (   6* Game.getCellSize(), 4* Game.getCellSize()  ,boxImage);
    Box box17 = new Box (   6* Game.getCellSize(), 5* Game.getCellSize() ,boxImage);
    Box box18 = new Box (   7* Game.getCellSize(), 4 * Game.getCellSize() ,boxImage);
    Box box19 = new Box (   7* Game.getCellSize(), 5 * Game.getCellSize() ,boxImage);
    Box box20 = new Box (   8* Game.getCellSize(), 4 * Game.getCellSize() ,boxImage);
    Box box21 = new Box (   8* Game.getCellSize(), 5 * Game.getCellSize() ,boxImage);
    Box box22 = new Box (   9* Game.getCellSize(), 4 * Game.getCellSize() ,boxImage);
    Box box23 = new Box (   9* Game.getCellSize(), 5 * Game.getCellSize(),boxImage);
    Box box24 = new Box (   10* Game.getCellSize(), 4 * Game.getCellSize() ,boxImage);
    Box box25 = new Box (   10* Game.getCellSize(), 5 * Game.getCellSize() ,boxImage);
    Box box26 = new Box (   11* Game.getCellSize(), 4 * Game.getCellSize() ,boxImage);
    Box box27 = new Box (   12* Game.getCellSize(), 4 * Game.getCellSize() ,boxImage);
    Box box28 = new Box (   12* Game.getCellSize(), 5  * Game.getCellSize(),boxImage);
    Box box29 = new Box (   13* Game.getCellSize(), 4  * Game.getCellSize(),boxImage);
    Box box30 = new Box (   13* Game.getCellSize(), 5  * Game.getCellSize(),boxImage);
    Box box31 = new Box (   14* Game.getCellSize(), 4  * Game.getCellSize(),boxImage);
    Box box32 = new Box (   14* Game.getCellSize(), 5  * Game.getCellSize(),boxImage);
    Box box33 = new Box (   15* Game.getCellSize(), 4* Game.getCellSize()  ,boxImage);
    Box box34 = new Box (   15* Game.getCellSize(), 5  * Game.getCellSize(),boxImage);
    Box box35 = new Box (   16* Game.getCellSize(), 2  * Game.getCellSize(),boxImage);
    Box box36 = new Box (   16* Game.getCellSize(), 3  * Game.getCellSize(),boxImage);
    Box box37 = new Box (   16* Game.getCellSize(), 4  * Game.getCellSize(),boxImage);
    Box box38 = new Box (   16* Game.getCellSize(), 5  * Game.getCellSize(),boxImage);
    Box box39 = new Box (   7* Game.getCellSize(), 1* Game.getCellSize()  ,boxImage);
    Box box40 = new Box (  15* Game.getCellSize(), 9 * Game.getCellSize() ,boxImage);
    Box box41 = new Box (  10* Game.getCellSize(), 1 * Game.getCellSize(),boxImage);
    Box box42 = new Box (   6* Game.getCellSize(), 9 * Game.getCellSize(),boxImage);
    Beer beer1 = new Beer (   5* Game.getCellSize(), 9* Game.getCellSize()  ,boxImage);
    Beer beer2 = new Beer (   16* Game.getCellSize(), 9 * Game.getCellSize() ,boxImage);
    
    @Override
    public void makeCenario () {
        
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
        
        for (Integer i = 0; i < 44; i++) {
            System.out.println ( "Object" + getArrayPosIndex ( i ) );
            System.out.println ( "Position Col" + getArrayPosIndex ( i ).getY() );
            System.out.println ( "Position Row" + getArrayPosIndex ( i ).getX() );
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
        Picture homescreen = new Picture (10,10,"/Levels/Bar background.png");
        homescreen.draw();
    }
}

