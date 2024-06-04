package io.bootcamp.vimtages;

import java.util.LinkedList;

public class Hand {
    private int numberofmoves;
    LinkedList<Position> positionLinkedList = new LinkedList<>();

    public Hand (Position initialPositionHand) {
        this.positionLinkedList.add(initialPositionHand);
        (this.positionLinkedList.get(0)).setFilled();
    }

    public void move(Direction dir) {
        switch (dir) {
            case UP:
                Position tempUp = this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempUp.setRow (tempUp.getRow() - 1);
                this.positionLinkedList.add(tempUp);
                (this.positionLinkedList.get(this.positionLinkedList.size() - 1)).setFilled();
                ++this.numberofmoves;
                break;
            case DOWN:
                Position tempDown = this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempDown.setRow(tempDown.getRow() + 1);
                this.positionLinkedList.add(tempDown);
                ++this.numberofmoves;
                break;
            case LEFT:
                Position tempLeft = this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempLeft.setCol (tempLeft.getCol () - 1);
                this.positionLinkedList.add(tempLeft);
                (this.positionLinkedList.get(this.positionLinkedList.size() - 1)).setFilled();
                ++this.numberofmoves;
                break;
            case RIGHT:
                Position tempRight = this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempRight.setCol(tempRight.getCol() + 1);
                this.positionLinkedList.add(tempRight);
                (this.positionLinkedList.get(this.positionLinkedList.size() - 1)).setFilled();
                ++this.numberofmoves;
                break;
            default:
                break;
        }

    }

    public Position getnPosition(int index) {
        return this.positionLinkedList.get(index);
    }

    public int getNumberofmoves() {
        return this.numberofmoves;
    }

    public void setNumberofmoves(int numberofmoves) {
        this.numberofmoves = numberofmoves;
    }
}
