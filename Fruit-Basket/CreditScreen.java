import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CreditScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreditScreen extends World
{

    /**
     * Constructor for objects of class CreditScreen.
     * 
     */
    public CreditScreen()
    {    
        // Create a new world with 640x480 cells with a cell size of 1x1 pixels.
        super(640, 480, 1);
        prepare();
    }
    
    private void prepare() {
        showText("Credits:", 48, 16);
        showText("Back (\"B\")",56,450);
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("B"))
            Greenfoot.setWorld(new StartScreen());
    }
}
