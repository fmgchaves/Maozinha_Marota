package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Level.Level;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class HandHandler implements KeyboardHandler {
    public Keyboard keyboard;
    //public Player player;
    private static int enterCounter = 0;
    public Hand hand;
    public Donut donut;


    public HandHandler() {
        keyboard = new Keyboard(this);
        createKeyboardEvents();
    }

    public void createKeyboardEvents() {
        KeyboardEvent keyboardEventEnter = new KeyboardEvent();
        keyboardEventEnter.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventEnter.setKey(KeyboardEvent.KEY_ENTER);
        keyboard.addEventListener(keyboardEventEnter);
    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        Position handPosition = new Position(10,9);
        switch(keyboardEvent.getKey()){
            case KeyboardEvent.KEY_ENTER:
                if(enterCounter==0) {

                    Game.gameScreenInit();
                    Level factory = Game.initFactoryLevel();
                    factory.runScenario();
                    Hand hand = factory.getHand();
                    hand.runScenario(handPosition);
                    hand.removeHand();
                    System.out.println("Here");
                    enterCounter++;

                }
                break;
            case KeyboardEvent.KEY_UP:
                System.out.println("here");
                hand.move(Direction.UP);
                hand.runScenario(hand.currentHandPosition());

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}
