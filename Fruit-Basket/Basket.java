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
            Tree tree = (Tree)getWorld();
            removeTouching(Apple.class);
            tree.addScore(20);
        }
        if (isTouching(BadLemon.class)) 
        {
            Tree tree = (Tree)getWorld();
            removeTouching(BadLemon.class);
            tree.loseLife(1);
        }
        if (isTouching(Banana.class)) 
        {
            Tree tree = (Tree)getWorld();
            removeTouching(Banana.class);
            tree.addScore(15);
        }
        if (isTouching(Bomb.class)) 
        {
            Tree tree = (Tree)getWorld();
            removeTouching(Bomb.class);
            tree.loseLife(2);
        }
        if (isTouching(Cherry.class)) 
        {
            Tree tree = (Tree)getWorld();
            removeTouching(Cherry.class);
            tree.addScore(10);
        }
    }
}
    
