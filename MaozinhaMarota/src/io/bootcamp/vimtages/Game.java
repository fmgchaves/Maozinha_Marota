package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Level.Factory;
import io.bootcamp.vimtages.Level.Garden;
import io.bootcamp.vimtages.Level.Level;
import io.bootcamp.vimtages.Level.Moes;
import org.academiadecodigo.simplegraphics.graphics.Shape;

public class Game {
    private static int cols;
    private static int rows;
    private static Position initHandPosition;
    public Game (int cols, int rows){
        this.cols=cols;
        this.rows=rows;
        initHandPosition = new Position(10,10);

    }

    public static int getRows() {
        return rows;
    }

    public static InitScreen startScreen(){
        InitScreen initScreen = new InitScreen(rows,cols);
        initScreen.init();
        //JavaFxGrid grid = new JavaFxGrid(cols,rows);
        //grid.init();
        //System.out.println("Hei " + grid.getHeight());
        //System.out.println("Width " + grid.getWidth());
        return initScreen;
    }

    public static void gameScreenInit(){
        GameScreen gameScreen = new GameScreen(rows,cols);
        gameScreen.init();
    }
  public static Level initFactoryLevel(){
        Level factory = new Factory(new Hand(initHandPosition));
        factory.makeCenario();
        return factory;

  }

  public static void initGardenLevel(){
        Level garden = new Garden(new Hand((initHandPosition)));
        garden.makeCenario();
        garden.runScenario();


  }

    public static void initMoes(){
        Level moes = new Moes(new Hand((initHandPosition)));
        moes.makeCenario();
        moes.runScenario();


    }
    public static void initHell(){
        Level moes = new Moes(new Hand(initHandPosition));
        moes.makeCenario();
        moes.runScenario();
    }

}
