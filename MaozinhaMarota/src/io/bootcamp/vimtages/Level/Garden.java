package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Obstacle.Wall;
import io.bootcamp.vimtages.Position;

public class Garden extends Level {
    public Garden(Donut donut, Hand hand) {
        super(donut, hand);
    }

    public void makeCenario() {
        placeItem(getDonut());
        System.out.println(getArrayPosIndex(0).getPosition().getCol());
        System.out.println(getArrayPosIndex(0).getPosition().getRow());
    }
}
