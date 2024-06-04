package io.bootcamp.vimtages.Item;

import io.bootcamp.vimtages.Position;

public class Donut implements Item {
    private Position donutsposition;

    public Donut(Position donutsposition) {
        this.donutsposition = donutsposition;
        this.donutsposition.setFilled();
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
