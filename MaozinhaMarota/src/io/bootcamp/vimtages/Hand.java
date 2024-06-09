package io.bootcamp.vimtages;

import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;
//Translate positions to directions -width left, + width right this will be implemented in another class
public class Hand {
    private int numberOfMoves;
    LinkedList<Position> positionLinkedList = new LinkedList<>();


	

    private Picture hand;
    String handPic="Item/Mao.png";

    public Hand (Position initialPositionHand) {
        this.positionLinkedList.add(initialPositionHand);
        (this.positionLinkedList.get(0)).setFilled();
        this.hand = new Picture(9*Game.getCellSize(),9*Game.getCellSize(),handPic);
        //hand.draw();
    }
    public int getHandX(){ return this.hand.getX();}
    public int getHandY(){ return this.hand.getY();}
    public Position currentHandPosition () {
        return this.positionLinkedList.getLast();
    }

    public void addCurrentHandPosition () {
        positionLinkedList.add(currentHandPosition());
    }

    public void move(Direction dir) {
        switch (dir) {
            case UP:
                Position tempUp = this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempUp.setRow (tempUp.getRow() - 1);
                this.positionLinkedList.add(tempUp);
                (this.positionLinkedList.get(this.positionLinkedList.size() - 1)).setFilled();
                ++this.numberOfMoves;
                hand.translate(0,-Game.getCellSize());
                Picture harmUp = new Picture(currentHandPosition().getCol()*Game.getCellSize()-Game.getCellSize(), currentHandPosition().getRow()*Game.getCellSize()-Game.getCellSize()*2,handPic);
                harmUp.draw();
                break;
            case DOWN:
                Position tempDown = this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempDown.setRow(tempDown.getRow() + 1);
                this.positionLinkedList.add(tempDown);
                ++this.numberOfMoves;
                hand.translate(0,Game.getCellSize());
                Picture harmDown = new Picture(currentHandPosition().getCol()*Game.getCellSize()-Game.getCellSize(), currentHandPosition().getRow()*Game.getCellSize()-Game.getCellSize()*2,handPic);
                harmDown.draw();
                break;
            case LEFT:
                Position tempLeft = this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempLeft.setCol (tempLeft.getCol () - 1);
                this.positionLinkedList.add(tempLeft);
                (this.positionLinkedList.get(this.positionLinkedList.size() - 1)).setFilled();
                ++this.numberOfMoves;
                hand.translate(-Game.getCellSize(),0);
                Picture harmLeft = new Picture(currentHandPosition().getCol()*Game.getCellSize()-Game.getCellSize(), currentHandPosition().getRow()*Game.getCellSize()-Game.getCellSize()*2,handPic);
                harmLeft.draw();
                break;
            case RIGHT:
                Position tempRight = this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempRight.setCol(tempRight.getCol() + 1);
                this.positionLinkedList.add(tempRight);
                (this.positionLinkedList.get(this.positionLinkedList.size() - 1)).setFilled();
                ++this.numberOfMoves;
                hand.translate(Game.getCellSize(),0);
                Picture harmRight = new Picture(currentHandPosition().getCol()*Game.getCellSize()-Game.getCellSize(), currentHandPosition().getRow()*Game.getCellSize()-Game.getCellSize()*2,handPic);
                harmRight.draw();
                break;
            default:
                break;
        }

    }

    public Position getNPosition(int index) {
        return this.positionLinkedList.get(index);
    }

    public int getNumberOfMoves() {
        return this.numberOfMoves;
    }

    public void setNumberOfMoves(int numberOfMoves) {
        this.numberOfMoves = numberOfMoves;
    }
    
    public void draw() {
        hand.draw();
    }
    
    //ordem reversa do movimento do braço usando um iterador
}
