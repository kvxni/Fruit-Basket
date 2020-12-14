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
    
    /**
     * Move the basket around with the keyboard.
     */
    private void move() {
        int moveSpeed = 4;
        if (Greenfoot.isKeyDown("Shift"))
            moveSpeed = 7;
        if (Greenfoot.isKeyDown("A")) 
            setLocation(getX() - moveSpeed, getY());
        if (Greenfoot.isKeyDown("D")) 
            setLocation(getX() + moveSpeed, getY());
    }
    
    /**
     * Checks for contact with the basket.
     */
    private void checkCollision()
    {
        if (getWorld() instanceof Level1 ) {
            if (isTouching(Apple.class)) {
                Level1 level1 = (Level1)getWorld();
                removeTouching(Apple.class);
                level1.addScore(20);
                Greenfoot.playSound("fruit.wav");
           }
           if (isTouching(BadLemon.class)) {
               Level1 level1 = (Level1)getWorld();
               removeTouching(BadLemon.class);
               level1.loseLife(1);
               Greenfoot.playSound("fruit.wav");
           }
           if (isTouching(Banana.class)) {
                Level1 level1 = (Level1)getWorld();
                removeTouching(Banana.class);
                level1.addScore(15);
                Greenfoot.playSound("fruit.wav");
           }
           if (isTouching(Bomb.class)) {
               Level1 level1 = (Level1)getWorld();
                removeTouching(Bomb.class);
                level1.loseLife(2);
                Greenfoot.playSound("bomb.wav");
            }
           if (isTouching(Cherry.class)) {
               Level1 level1 = (Level1)getWorld();
               removeTouching(Cherry.class);
               level1.addScore(10);
               Greenfoot.playSound("fruit.wav");
            } 
        }
        
        if (getWorld() instanceof Level2 ) {
            if (isTouching(Apple.class)) {
                Level2 level2 = (Level2)getWorld();
                removeTouching(Apple.class);
                level2.addScore(20);
                Greenfoot.playSound("fruit.wav");
           }
           if (isTouching(BadLemon.class)) {
               Level2 level2 = (Level2)getWorld();
               removeTouching(BadLemon.class);
               level2.loseLife(1);
               Greenfoot.playSound("fruit.wav");
           }
           if (isTouching(Banana.class)) {
               Level2 level2 = (Level2)getWorld();
               removeTouching(Banana.class);
               level2.addScore(15);
               Greenfoot.playSound("fruit.wav");
           }
           if (isTouching(Bomb.class)) {
               Level2 level2 = (Level2)getWorld();
               removeTouching(Bomb.class);
               level2.loseLife(2);
               Greenfoot.playSound("bomb.wav");
            }
           if (isTouching(Cherry.class)) {
               Level2 level2 = (Level2)getWorld();
               removeTouching(Cherry.class);
               level2.addScore(10);
               Greenfoot.playSound("fruit.wav");
            } 
        }
        
        if (getWorld() instanceof Level3 ) {
            if (isTouching(Apple.class)) {
                Level3 level3 = (Level3)getWorld();
                removeTouching(Apple.class);
                level3.addScore(20);
                Greenfoot.playSound("fruit.wav");
           }
           if (isTouching(BadLemon.class)) {
               Level3 level3 = (Level3)getWorld();
               removeTouching(BadLemon.class);
               level3.loseLife(1);
               Greenfoot.playSound("fruit.wav");
           }
           if (isTouching(Banana.class)) {
               Level3 level3 = (Level3)getWorld();
               removeTouching(Banana.class);
               level3.addScore(15);
               Greenfoot.playSound("fruit.wav");
           }
           if (isTouching(Bomb.class)) {
               Level3 level3 = (Level3)getWorld();
               removeTouching(Bomb.class);
               level3.loseLife(2);
               Greenfoot.playSound("bomb.wav");
            }
           if (isTouching(Cherry.class)) {
               Level3 level3 = (Level3)getWorld();
               removeTouching(Cherry.class);
               level3.addScore(10);
               Greenfoot.playSound("fruit.wav");
            } 
        }
    }
}

    
