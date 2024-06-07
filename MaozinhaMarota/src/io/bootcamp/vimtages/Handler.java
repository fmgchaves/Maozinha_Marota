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

    public Handler() {
        keyboard = new Keyboard(this);
        createKeyboardEvents();
    }
    public int getEnterCounter(){
        return enterCounter;
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
        if(keyboardEvent.getKey() == KeyboardEvent.KEY_ENTER && enterCounter == 0) {
            Game.gameScreenInit();
            Level factory = Game.initFactoryLevel();
            factory.runScenario();
            Hand hand = factory.getHand();
            hand.runScenario(handPosition);
            System.out.println("Here");
            enterCounter++;


        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
