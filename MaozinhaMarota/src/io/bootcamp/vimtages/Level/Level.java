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

    public Donut getDonut() {
        return this.donut;
    }
    public Position getDonutPosition () {
        return this.donut.getDonutsposition();
    }

    public Item getArrayPosIndex (Integer index) {
        return this.array.get(index);
    }
    //abstract
    public void removeItem (Item item) {
        this.array.remove(item);
    }

    //abstract
    public boolean placeItem(Item item) {
        return this.array.add(item);
    }

    //abstract
    public boolean didWin() {
        if (this.hand.currentHandPosition().equals(getDonutPosition())){
            setWin();
            return this.win;
        } else {
            return this.win;
        }
    }

    //abstract
    //public void makeCenario() {
    //}


    public void setWin() {
        this.win=true;
    }
}
