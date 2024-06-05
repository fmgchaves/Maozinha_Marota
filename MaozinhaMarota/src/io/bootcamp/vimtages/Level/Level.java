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

    public Level (Donut donut, Hand hand) {
        this.donut = donut;
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
    
    public Donut getDonut() {
        return this.donut;
    }
    
    public Hand getHand() {
        return this.hand;
    }
    
    //Gets Donut position from the level variable in this method
    private Position getDonutPosition () {
        return this.donut.getDonutsposition ();
    }
    
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
    
    public abstract void runCenario();

    public void setWin() {
        this.win=true;
    }
    
    //Criar metodo para obter posições do Item da Array
    
}
