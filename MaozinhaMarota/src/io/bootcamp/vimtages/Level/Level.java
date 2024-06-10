package io.bootcamp.vimtages.Level;

//Lógica do nível
//Instanciar e fazer a lógica toda de cada nível
//Serve para posicionar os objetos e saber o que fazer com eles

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Handler;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Item;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.ArrayList;

public abstract class Level {

    private ArrayList<Picture> array;
    private boolean levelComplete;

    private Donut donut;
    private Hand hand;
    
    private Picture screen;
    private Handler handler;

    public Level(Hand hand) {
        this.hand = hand;
        this.array = new ArrayList<Picture>();
    }

    public ArrayList<Picture> getArray() {
        return this.array;
    }

    //Gets an Item from a given position
    //The reason for this method is to start a given action
    //Given an Item
    //For example hand in the same position of a box or a wall
    //cannot allow a hand to move

    //Gets an Item from an index position
    public Picture getArrayPosIndex(Integer index) {
        return this.array.get(index);
    }

    //removes an Item from a given position
    public void removeItem(Picture item) {
        this.array.remove(item);
    }

    //Places an Item on a given position
    public boolean placeItem(Picture item) {
        return this.array.add(item);
    }

    public Hand getHand() {
        return this.hand;
    }

    public boolean setHand(Hand hand) {
        this.hand = hand;
        return false;
    }

    public void setLevelComplete() {
        this.levelComplete = true;
    }

    public boolean getLevelComplete() {
        return this.levelComplete;
    }

    public void setnewLevel() {
        this.levelComplete = false;
    }

    //Gets Donut position from the level variable in this method

    //Verifies if the Player has won

    public abstract void makeCenario();

    public abstract void runScenario();
    
    public abstract void deleteScenario();
    
    public abstract void giveLevelFinalScreen();

    public abstract void drawScreen();
}