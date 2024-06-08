package io.bootcamp.vimtages;

import io.bootcamp.vimtages.Level.*;

import java.util.ArrayList;

public class Game {
    private static int cols;
    private static int rows;
    private InitScreen initScreen;
    
    private ArrayList <Level> levelArrayList;
    
    private Boolean nextlevel;
    
    private static Position initHandPosition;
    
    private Handler handler;
    public Game (int cols, int rows){
        this.cols=cols;
        this.rows=rows;
        initHandPosition = new Position(10,10);
        this.initScreen = new InitScreen ( this.cols, this.rows);
        levelArrayList = new ArrayList<> ();
        this.nextlevel = false;
    }
    
    public void init() {
        //Desenha
        //Qual o método para desenhar????......
        initScreen.init ();
        Testgrid testgrid = new Testgrid(cols,rows,80,10);
        testgrid.gridSquares();
        //Criar níveís
        //Guarda níveis num Array
        this.levelArrayList = gamesInsideArray ( this.levelArrayList );
        handler = new Handler(this);
        //Corre nível (Devolve true quando acaba nível)
        
            
            for (Level level : levelArrayList) {
                //has erase level
                //level.deleteScenario ();
                level.makeCenario ();
                //Quando true dá os resultados
                if (level.runScenario ()) {
                    //Corre método de retornar resultado
                }
                
                while (!nextlevel) {
                    //System.out.println ("Estou aqui");
                }
                
                setNextlevel ( false );
                
                //Próximo nível
            }
    }
    
    public void setNextlevel (Boolean yesOrno)  {
            this.nextlevel = yesOrno;
    }
    
    //Garden in position 0
    //Factory in position 1
    //Moes in position 2
    //Home in position 3
    //Hell in position 4
    private ArrayList<Level> gamesInsideArray (ArrayList<Level> levelArrayList) {
        levelArrayList.add(new Garden (new Hand(initHandPosition)));
        levelArrayList.add(new Factory (new Hand(initHandPosition)));
        levelArrayList.add(new Moes (new Hand(initHandPosition)));
        levelArrayList.add(new Home (new Hand(initHandPosition)));
        levelArrayList.add(new Hell (new Hand(initHandPosition)));
        return levelArrayList;
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