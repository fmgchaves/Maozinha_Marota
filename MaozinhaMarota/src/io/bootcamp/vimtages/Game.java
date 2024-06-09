package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Level.*;

import java.util.ArrayList;

public class Game {
    private static int cellSize;
    private static int padding;
    private static int cols;
    private static int rows;
    private InitAndFinalScreen initAndFinalScreen;
    
    private ArrayList<Level> levelArrayList;
    
    private Boolean nextlevel;
    
    private Handler handler;
    
    public Game (int cols, int rows, int cellSize, int padding) {
        this.cols = cols;
        this.rows = rows;
        this.cellSize = cellSize;
        this.padding = padding;
        this.initAndFinalScreen = new InitAndFinalScreen ( this.cols, this.rows );
        levelArrayList = new ArrayList<> ();
        this.nextlevel = false;
    }
    
    public static int getRows () {
        return rows;
    }
    
    public static int getCellSize () {
        return cellSize;
    }
    
    public static int getPadding () {
        return padding;
    }
    
    public static int getCols () {
        return cols;
    }
    
    public void init () throws InterruptedException {
        
        initAndFinalScreen.init ();
        Thread.sleep ( 2000 );
        
        
        //Criar níveís
        //Guarda níveis num Array
        this.levelArrayList = gamesInsideArray ( this.levelArrayList );
        
        handler = new Handler ( this );
        //Corre nível (Devolve true quando acaba nível)
        
        for (Level level : levelArrayList) {
            handler.setHand ();
            
            level.drawScreen ();
            //Testgrid testgrid = new Testgrid(cols,rows,cellSize,padding);
            //testgrid.gridSquares();
            //handler.handDraw ();
            //has erase level
            //level.deleteScenario ();
            level.makeCenario ();
            //Quando true dá os resultados
            
            while (!level.runScenario ()) {
                Thread.sleep ( 5000 ); //Gives delay to the thread and the game waits xxxx milisecons;
                level.giveLevelFinalScreen ();
            }
            
            while (!nextlevel) {
                System.out.println ( "Waiting" );
            }
            
            level.deleteScenario ();
            setNextlevel ( false );
            
            //Próximo nível
        }
        initAndFinalScreen.finalScreen ();
    }
    
    public void setNextlevel (Boolean yesOrno) {
        this.nextlevel = yesOrno;
    }
    
    //Garden in position 0
    //Factory in position 1
    //Moes in position 2
    //Home in position 3
    //Hell in position 4
    private ArrayList<Level> gamesInsideArray (ArrayList<Level> levelArrayList) {
        levelArrayList.add ( new Garden () );
        levelArrayList.add ( new Factory () );
        levelArrayList.add ( new Moes () );
        levelArrayList.add ( new Home () );
        levelArrayList.add ( new Hell () );
        return levelArrayList;
    }
}
