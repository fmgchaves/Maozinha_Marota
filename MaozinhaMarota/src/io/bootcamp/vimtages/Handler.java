package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Level.Factory;
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
    public Hand hand;
    public Donut donut;


    public Handler() {
        this.hand = new Hand(new Position(10, 11));
        this.donut = new Donut(new Position(10, 2));
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
        switch(keyboardEvent.getKey()){
            case KeyboardEvent.KEY_ENTER:
                if(enterCounter!=1) {
                    GameScreen newGame = new GameScreen(10, 20);
                    newGame.init();
                    Level factory = new Factory(hand);
                    factory.makeCenario();
                    factory.runCenario();
                    hand.initHand();
                    enterCounter++;
                    System.out.println("Here");
                }
                break;
            case KeyboardEvent.KEY_UP:

                break;





        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}
