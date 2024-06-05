package io.bootcamp.vimtages.Item;

import io.bootcamp.vimtages.Position;

//will override and use abstract Items methods
public class Donut extends Item {
    private Position donutsposition;

    public Donut(Position position) {
        super(position);
        //this.donutsposition.setFilled();
    }
    
    public Position getDonutsposition() {
        return this.donutsposition;
    }

    public void setDonutsposition(Position newdonutsposition) {
        this.donutsposition.notFilled();
        this.donutsposition = newdonutsposition;
        this.donutsposition.setFilled();
    }
}
