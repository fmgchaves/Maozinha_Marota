package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
//Translate positions to directions -width left, + width right this will be implemented in another class
public class Hand {
    private int numberOfMoves = 0;
    
    private Picture hand;
    private String handPic = "Item/Mao.png";
    private boolean boosted;

    public boolean isBoosted() {
        return boosted;
    }

    public void setBoosted(boolean boosted) {
        this.boosted = boosted;
    }

    public Hand (Integer x, Integer y) {
        this.hand = new Picture ( x + Game.getPadding (), y + Game.getPadding (), handPic );
    }
    
    public int getHandX () {
        return this.hand.getX ();
    }
    
    public int getHandY () {
        return this.hand.getY ();
    }
    
    public void draw () {
        hand.draw ();
    }
    
    public void Fill (Integer x, Integer y) {
        Rectangle rectangle = new Rectangle (x+Game.getPadding()*2,y+Game.getPadding()-5, Game.getCellSize (), Game.getCellSize ());
        rectangle.setColor ( Color.YELLOW );
        rectangle.fill ();
    }
    
    public int getNumberOfMoves () {
        return this.numberOfMoves;
    }

    public void setNumberOfMoves () {
        this.numberOfMoves = 0;
    }
    
    public void move (Direction dir) {
        switch (dir) {
            case UP:
                ++this.numberOfMoves;
                Fill(hand.getX (), hand.getY());
                hand.translate ( 0, -Game.getCellSize () );
                //harmUp.draw();
                break;
            case DOWN:
                ++this.numberOfMoves;
                Fill(hand.getX (), hand.getY());
                hand.translate ( 0, Game.getCellSize () );
                //harmDown.draw();
                break;
            case LEFT:
                ++this.numberOfMoves;
                Fill(hand.getX (), hand.getY());
                hand.translate ( -Game.getCellSize (), 0 );
                //harmLeft.draw();
                break;
            case RIGHT:
                ++this.numberOfMoves;
                Fill(hand.getX (), hand.getY());
                hand.translate ( Game.getCellSize (), 0 );
                //harmRight.draw();
                break;
            default:
                break;
        }
    }

}
