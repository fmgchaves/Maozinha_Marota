package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
//Translate positions to directions -width left, + width right this will be implemented in another class
public class Hand extends Picture {

    private int numberOfMoves;
    
    private Picture hand;
    private String handPic = "Item/Mao.png";
    
    public Hand (Integer x, Integer y,String handPic) {
        super(x,y,handPic);
    }

    
    public void Fill (Integer x, Integer y) {
        Rectangle rectangle = new Rectangle (x, y, Game.getCellSize (), Game.getCellSize ());
        rectangle.setColor ( Color.YELLOW );
        rectangle.fill ();
    }
    
    public int getNumberOfMoves () {
        return this.numberOfMoves;
    }
    
    public void move (Direction dir) {
        switch (dir) {
            case UP:
                ++this.numberOfMoves;
                Fill(this.getX (), this.getY());
                this.translate ( 0, -Game.getCellSize () );
                //harmUp.draw();
                break;
            case DOWN:
                ++this.numberOfMoves;
                Fill(this.getX (), this.getY());
                this.translate ( 0, Game.getCellSize () );
                //harmDown.draw();
                break;
            case LEFT:
                ++this.numberOfMoves;
                Fill(this.getX (), this.getY());
                this.translate ( -Game.getCellSize (), 0 );
                //harmLeft.draw();
                break;
            case RIGHT:
                ++this.numberOfMoves;
                Fill(this.getX (), this.getY());
                this.translate ( Game.getCellSize (), 0 );
                //harmRight.draw();
                break;
            default:
                break;
        }
    }
    
    
}
