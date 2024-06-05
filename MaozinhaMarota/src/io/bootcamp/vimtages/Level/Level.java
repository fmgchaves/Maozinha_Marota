package io.bootcamp.vimtages.Level;

//Lógica do nível
//Instanciar e fazer a lógica toda de cada nível
//Serve para posicionar os objetos e saber o que fazer com eles

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
import io.bootcamp.vimtages.Position;

import java.util.ArrayList;

public abstract class Level {

    private ArrayList<Item> array;
    private boolean win;
    private Donut donut;
    private Hand hand;

    public Level (Hand hand) {
        this.hand = hand;
        this.array = new ArrayList<Item>();
    }
    
    //Gets an Item from a given position
    //The reason for this method is to start a given action
    //Given an Item
    //For example hand in the same position of a box or a wall
    //cannot allow a hand to move
    public Item getItemFromPosition (Position position) {
        int tempindex;
        if (this.array.contains ( position )) {
            tempindex = this.array.indexOf ( position );
            return getArrayPosIndex ( tempindex );
        } else {
            return null;
        }
    }
    
    //Gets an Item from an index position
    public Item getArrayPosIndex (Integer index) {
        return this.array.get(index);
    }
    
    //removes an Item from a given position
    public void removeItem (Item item) {
        this.array.remove(item);
    }
    
    //Placas an Item on a given position
    public boolean placeItem(Item item) {
        return this.array.add(item);
    }
    
    public Hand getHand() {
        return this.hand;
    }
    
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    
    public Position getDonutPosition() {
        return this.donut.getPosition ();
    }
    
    public void setDonutPosition(Position position) {
        this.donut.setPosition ( position );
    }
    
    //Gets Donut position from the level variable in this method
    
    //Verifies if the Player has won
    public boolean didWin() {
        if (this.hand.currentHandPosition().equals(getDonutPosition())){
            setWin();
            return this.win;
        } else {
            return this.win;
        }
    }
    
    public abstract void makeCenario();
    
    public void runScenario() {

        while (!didWin()) {
            //keyboard listener
            hand.move(); //pass user given direction as an argument
            if (!setWin()){
                hand.addCurrentHandPosition();
                hand.setNumberOfMoves(hand.getNumberOfMoves() + 1);

            } else {
                //implement the reverse iterator from the exercise (class 05/06/2024).
                    //this will give us the previous position to give to JavaFxItem
                for(int j = 0; j < array.size(); j++){ //clean array list in Level class
                    array.remove(0);

                }
                setWin();
                //move to the next level
            }

        }

    }

    public boolean setWin() {
        return this.win=true;
    }
}
