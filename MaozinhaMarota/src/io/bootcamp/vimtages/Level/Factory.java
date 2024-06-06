package io.bootcamp.vimtages.Level;

import io.bootcamp.vimtages.Hand;
import io.bootcamp.vimtages.Item.Donut;
import io.bootcamp.vimtages.Item.Obstacle.Radioactive;
import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Factory extends Level {
    
    private static Integer numberofWall = 29;
    public Factory(Hand hand) {
        super(hand);
    }
    
    @Override
    public void makeCenario () {
        
        placeItem ( new Donut (new Position (6,5)));
        placeItem ( new Radioactive (new Position ( 5,4 )));
        placeItem ( new Radioactive (new Position ( 5,5 )));
        placeItem ( new Radioactive (new Position ( 5,6 )));
        placeItem ( new Radioactive (new Position ( 6,4 )));
        placeItem ( new Radioactive (new Position ( 6,6 )));
        placeItem ( new Radioactive (new Position ( 7,4 )));
        placeItem ( new Radioactive (new Position ( 7,6 )));
        placeItem ( new Radioactive (new Position ( 8,2 )));
        placeItem ( new Radioactive (new Position ( 8,3 )));
        placeItem ( new Radioactive (new Position ( 8,4 )));
        placeItem ( new Radioactive (new Position ( 8,6 )));
        placeItem ( new Radioactive (new Position ( 9,2 )));
        placeItem ( new Radioactive (new Position ( 9,6 )));
        placeItem ( new Radioactive (new Position ( 10,2 )));
        placeItem ( new Radioactive (new Position ( 10,4 )));
        placeItem ( new Radioactive (new Position ( 10,5 )));
        placeItem ( new Radioactive (new Position ( 10,6 )));
        placeItem ( new Radioactive (new Position ( 11,2 )));
        placeItem ( new Radioactive (new Position ( 11,4 )));
        placeItem ( new Radioactive (new Position ( 12,2 )));
        placeItem ( new Radioactive (new Position ( 12,4 )));
        placeItem ( new Radioactive (new Position ( 13,2 )));
        placeItem ( new Radioactive (new Position ( 13,4 )));
        placeItem ( new Radioactive (new Position ( 13,5 )));
        placeItem ( new Radioactive (new Position ( 14,2 )));
        placeItem ( new Radioactive (new Position ( 15,2 )));
        placeItem ( new Radioactive (new Position ( 15,3 )));
        placeItem ( new Radioactive (new Position ( 15,4 )));
        placeItem ( new Radioactive (new Position ( 15,5 )));
        
        for (Integer i = 0; i < numberofWall + 1; i++) {
            System.out.println ("Object" + getArrayPosIndex (i));
            System.out.println ("Position Col" + getArrayPosIndex ( i ).getPosition ().getCol (  ));
            System.out.println ("Position Row" + getArrayPosIndex ( i ).getPosition ().getRow (  ));
        }
    }
    
    @Override
    public void runCenario () {
        for (Integer i = 0; i < numberofWall + 1; i++){
            Rectangle rectangle = new Rectangle(getArrayPosIndex(i).getPosition().getCol()*80+10,getArrayPosIndex(i).getPosition().getRow()*80+10,50,50);
            rectangle.setColor(Color.WHITE);
            rectangle.draw();
        }
    }
}

