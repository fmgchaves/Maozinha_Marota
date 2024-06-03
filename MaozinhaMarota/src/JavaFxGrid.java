import io.bootcamp.vimtages.Grid;
import io.bootcamp.vimtages.Position;
import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;

public class JavaFxGrid implements Grid {
    Canvas canvas;
    Shape grid;
    int cellSize = 15;
    int padding = 10;
    int rows;
    int cols;
    public JavaFxGrid(int cols, int rows){
        this.cols=cols;
        this.rows = rows;
    }
    @Override
    public void init() {
        this.canvas= Canvas.getInstance();
        this.grid= new Rectangle(padding,padding,getWidth(),getHeight());
        canvas.show(grid);

    }
    public int getWidth(){
        return cols*this.cellSize;
    }
    public int getHeight(){
        return rows*this.cellSize;
    }

    @Override
    public int getCols() {
        return this.cols;
    }

    @Override
    public int getRows() {
        return this.getRows();
    }

    @Override
    public Position GridPosition(int col, int row) {
        return new Position(col,row,grid);
    }


    public Position makeGridPosition(int col, int row) {
        return new Position(col,row,grid);
    }
}
