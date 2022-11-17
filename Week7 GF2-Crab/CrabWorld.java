import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CrabWorld extends World
{
    public static final int MAXN_WORMS = 20;
    public static final int MAXN_LOBSTERS = 20;
    
    private Crab crab;
    private Lobster lobster;
    
    private Worm[] worms;
    private int wormSize = 30;
    private int remainingWorms = MAXN_WORMS;
    
    private Random generator = new Random();
    private Counter score;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public CrabWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        crab = new Crab();
        addObject(crab, 200, 200);
        
        lobster = new Lobster();
        addObject(lobster, 600, 400);
        
        worms = new Worm[MAXN_WORMS];
        addWorms();
        
        setupScore();
    }
    
    /**
     * Add MAXN_WORMS to the world in random positions
     */
    public void addWorms()
    {
        for(int i = 0; i < MAXN_WORMS; i++)
        {
            createWorm();
        }
        
        for(int i = 0; i < MAXN_LOBSTERS; i++)
        {
            createLobster();
        }

    }
    
    /**
     * This method creates & adds a single worm to a random position in
     * the world that is not too near the edge of the screen
     */
    private void createWorm()
    {
        Worm worm = new Worm();
        
        int x = generator.nextInt(getWidth());
        int y = generator.nextInt(getHeight());
        
        addObject(worm, x, y);
    }
    private void createLobster()
    {
        Lobster lobster = new Lobster();
        
        int x;
        int y;
        do
        {
            
            x = generator.nextInt(getWidth());
            y = generator.nextInt(getHeight());
        }
        while(x < 50 || y< 50 || x> getWidth() - 50 || y > getHeight() - 50);
        addObject(lobster, x, y);
    }
    public void score()
    {
    }
    
    private void setupScore()
    {
        score = new Counter("Score: ");
        addObject (score, 60, 30);
    }
    
    public void endGame()
    {
        showText("Game Over: You have Lost!", 400, 300);
    }
}
