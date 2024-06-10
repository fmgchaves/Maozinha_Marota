package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Item.Beer;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Obstacle.Box;
import io.bootcamp.vimtages.Level.Level;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

//keyboard mechanics
public class Handler implements KeyboardHandler {
    public Keyboard keyboard;
    private static int enterCounter = 0;
    public Hand hand;
    public Donut donut;

    private Game game;
    private ArrayList<Picture> levelArrayList;

    public void getLevelArrayList(ArrayList<Picture> levelArrayList) {
        this.levelArrayList = levelArrayList;
    }

    public Handler(Game game) {
        //this.donut = new Donut(new Position(10, 2));
        keyboard = new Keyboard(this);
        this.game = game;
        createKeyboardEvents();
    }

    public void createKeyboardEvents() {
        KeyboardEvent keyboardEventEnter = new KeyboardEvent();
        keyboardEventEnter.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventEnter.setKey(KeyboardEvent.KEY_ENTER);
        keyboard.addEventListener(keyboardEventEnter);

        KeyboardEvent keyboardEventUp = new KeyboardEvent();
        keyboardEventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventUp.setKey(KeyboardEvent.KEY_UP);
        keyboard.addEventListener(keyboardEventUp);

        KeyboardEvent keyboardEventDown = new KeyboardEvent();
        keyboardEventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventDown.setKey(KeyboardEvent.KEY_DOWN);
        keyboard.addEventListener(keyboardEventDown);

        KeyboardEvent keyboardEventLeft = new KeyboardEvent();
        keyboardEventLeft.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventLeft.setKey(KeyboardEvent.KEY_LEFT);
        keyboard.addEventListener(keyboardEventLeft);

        KeyboardEvent keyboardEventRight = new KeyboardEvent();
        keyboardEventRight.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventRight.setKey(KeyboardEvent.KEY_RIGHT);
        keyboard.addEventListener(keyboardEventRight);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        boosted();
        switch(keyboardEvent.getKey()){
            case KeyboardEvent.KEY_ENTER:
                game.setNextlevel ( true );
                break;
            case KeyboardEvent.KEY_UP:
                
                //System.out.println("Donut Col: "+ donut.getPosition().getCol());
                //System.out.println("Donut Row: " + donut.getPosition().getRow());

                System.out.println("Hand col: " + hand.getHandX()/Game.getCellSize());
                System.out.println("Hand row: " + hand.getHandY()/Game.getCellSize());

             /*   if(donut.getPosition().getCol ()*Game.getCellSize() >= hand.getHandX() && donut.getPosition().getRow ()*Game.getCellSize() >= hand.getHandY()-Game.getCellSize()){
                    System.out.println("Found My Donnut");
                    game.setNextlevel( true );
                }
                
              */
                if(hand.getHandY()>=Game.getCellSize()+10 && isFilled(Direction.UP)) {
                    System.out.println("Move Up");
                    hand.move(Direction.UP);
                    hand.draw();
                    setHand ( hand );
                }
                break;
            case KeyboardEvent.KEY_DOWN:
                //System.out.println("Donut Col: "+ donut.getPosition().getCol());
                //System.out.println("Donut Row: " + donut.getPosition().getRow());

                System.out.println("Hand col: " + hand.getHandX()/Game.getCellSize());
                System.out.println("Hand row: " + hand.getHandY()/Game.getCellSize());
               /*
                if(donut.getPosition().getCol ()*Game.getCellSize() == hand.getHandX() && donut.getPosition().getRow ()*Game.getCellSize() == hand.getHandY()-Game.getCellSize()){
                    System.out.println("Found My Donnut");
                    //game.setNextlevel( true );
                    break;
                }
                
                */
                if(hand.getHandY() < Game.getCols()*Game.getCellSize()-Game.getPadding()&&isFilled(Direction.DOWN)) {
                    System.out.println("Move Down");
                    hand.move(Direction.DOWN);
                    hand.draw();
                    setHand ( hand );
                }
                break;
            case KeyboardEvent.KEY_LEFT:
                //System.out.println("Donut Col: "+ donut.getPosition().getCol());
                //System.out.println("Donut Row: " + donut.getPosition().getRow());

                System.out.println("Hand col: " + hand.getHandX()/Game.getCellSize());
                System.out.println("Hand row: " + hand.getHandY()/Game.getCellSize());
               /*
                if(donut.getPosition().getCol ()*Game.getCellSize() == hand.getHandX() && donut.getPosition().getRow ()*Game.getCellSize() == hand.getHandY()-Game.getCellSize()){
                    System.out.println("Found My Donnut");
                    game.setNextlevel( true );
                }
                
                */
                if(hand.getHandX()>Game.getPadding()&&isFilled(Direction.LEFT)) {
                    System.out.println("Move Left");
                    hand.move(Direction.LEFT);
                    hand.draw();
                    setHand ( hand );
                }
                break;
            case KeyboardEvent.KEY_RIGHT:
               // System.out.println("Donut Col: "+ donut.getPosition().getCol());
                //System.out.println("Donut Row: " + donut.getPosition().getRow());

                System.out.println("Hand col: " + hand.getHandX()/Game.getCellSize());
                System.out.println("Hand row: " + hand.getHandY()/Game.getCellSize());
               /*
                if(donut.getPosition().getCol ()*Game.getCellSize() == hand.getHandX() && donut.getPosition().getRow ()*Game.getCellSize() == hand.getHandY()-Game.getCellSize()){
                    System.out.println("Found My Donnut");
                    game.setNextlevel( true );
                }
                
                */
                if(hand.getHandX()<Game.getRows()*Game.getCellSize()-Game.getCellSize()&&isFilled(Direction.RIGHT)) {
                    System.out.println("Move Right");
                    hand.move(Direction.RIGHT);
                    hand.draw();
                    setHand ( hand );
                }
                break;
        }
    }
    public void setHand (Hand hand) {
        this.hand = hand;
    }
    
    public Hand getHand() {
        return this.hand;
    }
    
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
    private boolean isFilled(Direction direction){

        switch(direction) {
            case DOWN:
                for (Picture object : levelArrayList) {
                    if(object.getY() == hand.getHandY()+Game.getCellSize() && object.getX()==hand.getHandX()&&!(object.getClass().equals(Donut.class))){
                        return false;
                    }
                    if (object.getX() == hand.getHandX()+Game.getCellSize()&& object.getY()==hand.getHandY()&&(object.getClass().equals(Box.class))&&hand.isBoosted()){
                        return true;
                    }
                }
                break;
            case UP:
                for (Picture object : levelArrayList) {
                    if(object.getY() == hand.getHandY()-Game.getCellSize()&& object.getX()==hand.getHandX()&&!(object.getClass().equals(Donut.class))){
                        return false;
                    }
                    if (object.getX() == hand.getHandX()+Game.getCellSize()&& object.getY()==hand.getHandY()&&(object.getClass().equals(Box.class))&&hand.isBoosted()){
                        return true;
                    }
                }
                break;
            case LEFT:
                for (Picture object : levelArrayList) {
                    if(object.getX() == hand.getHandX()-Game.getCellSize()&& object.getY()==hand.getHandY()&&!(object.getClass().equals(Donut.class))){
                        return false;
                    }
                    if (object.getX() == hand.getHandX()+Game.getCellSize()&& object.getY()==hand.getHandY()&&(object.getClass().equals(Box.class))&&hand.isBoosted()){
                        return true;
                    }
                }
                break;
            case RIGHT:
                for (Picture object : levelArrayList) {
                    if(object.getX() == hand.getHandX()+Game.getCellSize()&& object.getY()==hand.getHandY()&&!(object.getClass().equals(Donut.class))){
                        return false;
                    }
                    if (object.getX() == hand.getHandX()+Game.getCellSize()&& object.getY()==hand.getHandY()&&(object.getClass().equals(Box.class))&&hand.isBoosted()){
                        return true;
                    }
                }
                break;
        }
       return true;
    }
    private void boosted(){
                for (Picture object : levelArrayList) {
                    if(object.getY() == hand.getHandY() && object.getX()==hand.getHandX()
                            && (object.getClass().equals(Beer.class))
                            )
                    {
                        hand.setBoosted(true);
                    }
                }
        }
    }
