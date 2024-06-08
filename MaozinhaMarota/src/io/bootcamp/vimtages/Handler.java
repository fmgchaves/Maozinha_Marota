package io.bootcamp.vimtages;


import io.bootcamp.vimtages.Level.Level;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;


//keyboard mechanics
public class Handler implements KeyboardHandler {
    public Keyboard keyboard;
    //public Player player;
    private static int enterCounter = 0;
    private Hand hand;
    public Handler(Hand hand) {
        keyboard = new Keyboard(this);
        createKeyboardEvents();
        this.hand=hand;
    }
    public int getEnterCounter(){
        return enterCounter;
    }
    public void createKeyboardEvents() {
        KeyboardEvent keyboardEventEnter = new KeyboardEvent();
        keyboardEventEnter.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventEnter.setKey(KeyboardEvent.KEY_ENTER);
        keyboard.addEventListener(keyboardEventEnter);

        KeyboardEvent keyboardEventUp = new KeyboardEvent();
        keyboardEventUp.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventEnter.setKey(KeyboardEvent.KEY_UP);
        keyboard.addEventListener(keyboardEventEnter);

        KeyboardEvent keyboardEventDown = new KeyboardEvent();
        keyboardEventDown.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventEnter.setKey(KeyboardEvent.KEY_DOWN);
        keyboard.addEventListener(keyboardEventEnter);

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
        Position handPosition = new Position(10,9);
         switch (keyboardEvent.getKey()){
             case KeyboardEvent.KEY_ENTER:
                if(enterCounter == 0) {
                    Game.gameScreenInit();
                    System.out.println("Here");
                    enterCounter++;
                }
                break;
             case KeyboardEvent.KEY_UP:
                 hand.move(Direction.UP);
                 hand.runScenario(hand.currentHandPosition());
                 break;

                 case KeyboardEvent.KEY_UP:
                 hand.move(Direction.UP);
                 hand.runScenario(hand.currentHandPosition());


        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
