import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Basket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Basket extends Actor
{
    /**
     * Act - do whatever the Basket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        checkCollision();
    }    
    
    private void move() {
        int moveSpeed = 4;
        if (Greenfoot.isKeyDown("Shift"))
            moveSpeed = 7;
        if (Greenfoot.isKeyDown("A")) 
            setLocation(getX() - moveSpeed, getY());
        if (Greenfoot.isKeyDown("D")) 
            setLocation(getX() + moveSpeed, getY());
    }
    
    private void checkCollision()
    {
        if (isTouching(Apple.class)) 
        {
            removeTouching(Apple.class);
        }
        if (isTouching(BadLemon.class)) 
        {
            removeTouching(BadLemon.class);
        }
        if (isTouching(Banana.class)) 
        {
            removeTouching(Banana.class);
        }
        if (isTouching(Bomb.class)) 
        {
            removeTouching(Bomb.class);
        }
        if (isTouching(Cherry.class)) 
        {
            removeTouching(Cherry.class);
        }
    }
}
    
