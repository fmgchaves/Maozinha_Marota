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

        String handPic = "Item/Mao.png";
        //Criar níveís
        //Guarda níveis num Array
        Hand hand = new Hand(9*cellSize,10*cellSize,handPic);
        this.levelArrayList = gamesInsideArray ( this.levelArrayList,hand );
        


        //Corre nível (Devolve true quando acaba nível)

        for (Level level : levelArrayList) {



            level.drawScreen ();
            //Testgrid testgrid = new Testgrid(cols,rows,cellSize,padding);
            //testgrid.gridSquares();
            //handler.handDraw ();
            //has erase level
            //level.deleteScenario ();
            level.makeCenario ();
            //Quando true dá os resultados
            level.setHand(hand);
            handler = new Handler ( this ,hand);
            handler.setHand (level.getHand());
            hand.draw();
            while (!level.runScenario ()) {
                Thread.sleep ( 5000 ); //Gives delay to the thread and the game waits xxxx milisecons;
                level.giveLevelFinalScreen ();
            }
            
            while (!nextlevel) {
                Thread.sleep((1000));
                //System.out.println ( "Waiting" );
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
    private ArrayList<Level> gamesInsideArray (ArrayList<Level> levelArrayList,Hand hand) {
        levelArrayList.add ( new Garden (hand) );
        levelArrayList.add ( new Factory (hand) );
        levelArrayList.add ( new Moes (hand) );
        levelArrayList.add ( new Home (hand) );
        levelArrayList.add ( new Hell (hand) );
        return levelArrayList;
    }
}
