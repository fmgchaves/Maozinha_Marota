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


    public Handler() {
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

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_ENTER) {
           GameScreen newGame = new GameScreen(10,20);
           newGame.init();
           Hand hand = new Hand (new Position ( 50,100 ));
           Donut donut = new Donut (new Position ( 10,2 ));
           Level factory = new Factory(hand);
           factory.makeCenario ();
           factory.runCenario();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }


}
