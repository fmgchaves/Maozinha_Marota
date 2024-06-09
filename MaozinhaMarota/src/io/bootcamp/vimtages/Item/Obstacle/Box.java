package io.bootcamp.vimtages.Item.Obstacle;

public class Box extends Obstacle{

    private boolean canBreak;

    public Box (Integer x, Integer y, String path) {
        super (x, y, path);
    }

    public boolean canBreak(){
        return canBreak;
    }

    public void setCanBreak(boolean newCanBreak){
        this.canBreak = newCanBreak;
    }

}
