import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
import java.util.List;

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Animal
{
    private int speed = 2;
    private Random generator = new Random();
    
    public Lobster()
    {
        turn(45 * generator.nextInt(10));
    }
    /**
     * This method looks to see if the crab is within a certain
     * distances and if so turns in that direction.  If not within
     * range the lobster makes a move in a random direction.
     * If the lobster touches the crab, the game ends.
     */
    public void act()
    {
        // Add your action code here.
        move(speed);
        
        if(atWorldEdge())
        {
            turn(180);
        }
        
        // if at right edge 
        //if(atWorldEdge())
        {
           // setLocation(30, getY() );
                
        }
        
        // if at bottom edge
        //if (atWorldEdge())
        
        {
            //setLocation(getX(), 30);
        }
        
        if ( eat(Crab.class) == true)
        {
            Greenfoot.playSound("au.wav");
        }
    }
    
}
