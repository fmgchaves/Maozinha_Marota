package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Item.Donut;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

//keyboard mechanics
public class Handler implements KeyboardHandler {
    public Keyboard keyboard;
    private static int enterCounter = 0;
    public Hand hand;
    public Donut donut;

    private Game game;

    public Handler(Game game,Hand hand) {
        //this.donut = new Donut(new Position(10, 2));
        keyboard = new Keyboard(this);
        this.game = game;
        this.hand = hand;
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
        switch(keyboardEvent.getKey()){
            case KeyboardEvent.KEY_ENTER:
                game.setNextlevel ( true );
                break;
            case KeyboardEvent.KEY_UP:
                System.out.println(hand.getY());
                if(hand.getY()>0) {
                    System.out.println("Move Up");
                    hand.move(Direction.UP);
                    hand.draw();
                }
                break;
            case KeyboardEvent.KEY_DOWN:
                System.out.println(hand.getY());
                if(hand.getY() < 800) {
                    System.out.println("Move Down");
                    hand.move(Direction.DOWN);
                    hand.draw();

                }
                break;
                //1800X900
            case KeyboardEvent.KEY_LEFT:

                System.out.println(hand.getX());
                System.out.println(hand.getY());
                if(hand.getX()>0) {
                    System.out.println("Move Left");
                    hand.move(Direction.LEFT);
                    hand.draw();

                }
                break;
            case KeyboardEvent.KEY_RIGHT:

                System.out.println(hand.getX());
                if(hand.getX()<1700) {
                    System.out.println("Move Right");
                    hand.move(Direction.RIGHT);
                    hand.draw();

                }
                break;
        }
    }
    public void setHand (Hand hand) {
        this.hand = hand;
    }

    
    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
}
