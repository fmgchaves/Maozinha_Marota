package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Game;
import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Beer;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Flanders;
import io.bootcamp.vimtages.Item.Obstacle.Box;
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

    int box1x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box1y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box2x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box2y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box3x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box3y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box4x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box4y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box5x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box5y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box6x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box6y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box7x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box7y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box8x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box8y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box9x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box9y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box10x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box10y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box11x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box11y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box12x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box12y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box13x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box13y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box14x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box14y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box15x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box15y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box16x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box16y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box17x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box17y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box18x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box18y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box19x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box19y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    int box20x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    int box20y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    //int beer1x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    //int beer1y = 1 + (int)(Math.random() * ((10 - 1) + 1));
    //int beer2x = 1 + (int)(Math.random() * ((20 - 1) + 1));
    //int beer2y = 1 + (int)(Math.random() * ((10 - 1) + 1));



    Box box1 = new Box(box1x* Game.getCellSize()+Game.getPadding(), box1y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box2 = new Box(box2x* Game.getCellSize()+Game.getPadding(), box2y*Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box3 = new Box(box3x* Game.getCellSize()+Game.getPadding(), box3y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box4 = new Box(box4x* Game.getCellSize()+Game.getPadding(), box4y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box5 = new Box(box5x* Game.getCellSize()+Game.getPadding(), box5y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box6 = new Box(box6x* Game.getCellSize()+Game.getPadding(), box6y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box7 = new Box(box7x* Game.getCellSize()+Game.getPadding(), box7y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box8 = new Box(box8x* Game.getCellSize()+Game.getPadding(), box8y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box9 = new Box(box9x* Game.getCellSize()+Game.getPadding(), box9y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box10 = new Box(box10x* Game.getCellSize()+Game.getPadding(), box10y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box11 = new Box(box11x* Game.getCellSize()+Game.getPadding(), box11y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box12 = new Box(box12x* Game.getCellSize()+Game.getPadding(), box12y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box13 = new Box(box13x* Game.getCellSize()+Game.getPadding(), box13y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box14 = new Box(box14x* Game.getCellSize()+Game.getPadding(), box14y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box15 = new Box(box15x* Game.getCellSize()+Game.getPadding(), box15y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box16 = new Box(box16x* Game.getCellSize()+Game.getPadding(), box16y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box17 = new Box(box17x* Game.getCellSize()+Game.getPadding(), box17y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box18 = new Box(box18x* Game.getCellSize()+Game.getPadding(), box18y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box19 = new Box(box19x* Game.getCellSize()+Game.getPadding(), box19y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    Box box20 = new Box(box20x* Game.getCellSize()+Game.getPadding(), box20y* Game.getCellSize()+Game.getPadding(), "Item/Caixabar.png");
    //Beer beer1 = new Beer(beer1x*Game.getCellSize()*Game.getPadding(),beer1y*Game.getCellSize()*Game.getPadding(),"Item/Cerveja_resized.png");
    //Beer beer2 = new Beer(beer2x*Game.getCellSize()*Game.getPadding(),beer2y*Game.getCellSize()*Game.getPadding(),"Item/Cerveja_resized.png");

    @Override
    public void makeCenario () {
        Hand hand = getHand ();
        hand.erase ();
        placeItem (flanders);
        placeItem (donut);
        placeItem (box1);
        placeItem (box2);
        placeItem (box3);
        placeItem (box4);
        placeItem (box5);
        placeItem (box6);
        placeItem (box7);
        placeItem (box8);
        placeItem (box9);
        placeItem (box10);
        placeItem (box11);
        placeItem (box12);
        placeItem (box13);
        placeItem (box14);
        placeItem (box15);
        placeItem (box16);
        placeItem (box17);
        placeItem (box18);
        placeItem (box19);
        placeItem (box20);
        //placeItem(beer1);
        //placeItem(beer2);

        ArrayList<Picture> temp = getArray();
        for (Picture item : temp) {
            if (item.getClass ().equals(donut.getClass ()) || item.getClass().equals(Box.class)) {

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
        int min1 = 30;
        int min2 = 50;
    
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
