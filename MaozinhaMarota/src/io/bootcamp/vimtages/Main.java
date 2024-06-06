package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Level.Factory;
import io.bootcamp.vimtages.Level.Garden;
import io.bootcamp.vimtages.Level.Level;

public class Main {
    private static final int cols = 20;
    private static final int rows = 10;
    public static void main(String[] args) {
        Game game = new Game(cols,rows);
        game.initInitialScreen();
        new Handler();

    
        Hand hand = new Hand (new Position ( 50,100 ));
        Donut donut = new Donut (new Position ( 10,2 ));
        
        //Level factory = new Factory (hand);
        //factory.makeCenario ();
        //factory.runCenario();
        Level garden = new Garden (hand);
        garden.makeCenario();
    }
}