package io.bootcamp.vimtages;

public class Main {
    private static final int cols = 20;
    private static final int rows = 10;
    public static void main(String[] args) throws InterruptedException {
        Game game = new Game(cols,rows);
        game.init ();
    
        //Hand hand = new Hand(new Position(2,3));
        /*
        Factory factory = new Factory(hand);
        factory.makeCenario();
        factory.runScenario();
        */
    }
}
