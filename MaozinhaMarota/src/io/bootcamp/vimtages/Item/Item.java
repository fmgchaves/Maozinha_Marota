package io.bootcamp.vimtages.Item;

import io.bootcamp.vimtages.Position;

public abstract class Item {
    
    private Position position;
    
    public Item (Position position) {
        this.position = position;
    }
    
    public Position getPosition () {
        return this.position;
    }
    // items are going to implement
    // abstract methods from item and
    // inherit common item behaviour
    // like position, effect, destructability
    // another interface?
    
}
