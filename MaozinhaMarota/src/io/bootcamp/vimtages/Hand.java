package io.bootcamp.vimtages;

import java.util.LinkedList;

public class Hand {
    private int numberofmoves;
    LinkedList<Position> positionLinkedList = new LinkedList();

    public Hand(Position initialPositionHand) {
        this.positionLinkedList.add(initialPositionHand);
        ((Position)this.positionLinkedList.get(0)).setFilled();
    }

    public void move(Direction dir) {
        switch (dir) {
            case UP:
                Position tempUp = (Position)this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempUp.setRow(tempUp.getRow() - 1);
                this.positionLinkedList.add(tempUp);
                ((Position)this.positionLinkedList.get(this.positionLinkedList.size() - 1)).setFilled();
                ++this.numberofmoves;
                break;
            case DOWN:
                Position tempDown = (Position)this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempDown.setRow(tempDown.getRow() + 1);
                this.positionLinkedList.add(tempDown);
                ++this.numberofmoves;
                break;
            case LEFT:
                Position tempLeft = (Position)this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempLeft.setColumn(tempLeft.getColumn() - 1);
                this.positionLinkedList.add(tempLeft);
                ((Position)this.positionLinkedList.get(this.positionLinkedList.size() - 1)).setFilled();
                ++this.numberofmoves;
                break;
            case RIGHT:
                Position tempRight = (Position)this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempRight.setColumn(tempRight.getColumn() + 1);
                this.positionLinkedList.add(tempRight);
                ((Position)this.positionLinkedList.get(this.positionLinkedList.size() - 1)).setFilled();
                ++this.numberofmoves;
                break;
            default:
                Position tempUpDefault = (Position)this.positionLinkedList.get(this.positionLinkedList.size() - 1);
                tempUpDefault.setRow(tempUpDefault.getRow() - 1);
                this.positionLinkedList.add(tempUpDefault);
                ((Position)this.positionLinkedList.get(this.positionLinkedList.size() - 1)).setFilled();
                ++this.numberofmoves;
        }

    }

    public Position getnPosition(int index) {
        Position position = (Position)this.positionLinkedList.get(index);
        return position;
    }

    public int getNumberofmoves() {
        return this.numberofmoves;
    }

    public void setNumberofmoves(int numberofmoves) {
        this.numberofmoves = numberofmoves;
    }
}
