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
        this.hand = new Picture(9*80,9*80,handPic);
        hand.draw();
    }

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
                hand.translate(0,-80);
                Picture harmUp = new Picture(currentHandPosition().getCol()*80-80, currentHandPosition().getRow()*80-160,handPic);
                harmUp.draw();
                break;
            case DOWN:
                Position tempDown = this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempDown.setRow(tempDown.getRow() + 1);
                this.positionLinkedList.add(tempDown);
                ++this.numberOfMoves;
                hand.translate(0,80);
                Picture harmRight = new Picture(currentHandPosition().getCol()*80-80, currentHandPosition().getRow()*80-160,handPic);
                harmRight.draw();
                break;
            case LEFT:
                Position tempLeft = this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempLeft.setCol (tempLeft.getCol () - 1);
                this.positionLinkedList.add(tempLeft);
                (this.positionLinkedList.get(this.positionLinkedList.size() - 1)).setFilled();
                ++this.numberOfMoves;
                hand.translate(-80,0);
                Picture harmLeft = new Picture(currentHandPosition().getCol()*80-80, currentHandPosition().getRow()*80-160,handPic);
                harmLeft.draw();
                break;
            case RIGHT:
                Position tempRight = this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempRight.setCol(tempRight.getCol() + 1);
                this.positionLinkedList.add(tempRight);
                (this.positionLinkedList.get(this.positionLinkedList.size() - 1)).setFilled();
                ++this.numberOfMoves;
                hand.translate(80,0);
                Picture harmDown = new Picture(currentHandPosition().getCol()*80-80, currentHandPosition().getRow()*80-160,handPic);
                harmDown.draw();
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
    
    //ordem reversa do movimento do braço usando um iterador
}
