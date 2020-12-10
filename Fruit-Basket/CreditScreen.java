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
        showText("Fruit Basket is a game for a project in Game Programming.", 312, 40);
        showText("Made by Alex Nguyen & Kevin Judal.", 214, 70);
        showText("For information about the assets, check the README file.", 306, 100);
        showText("Back (\"B\")",56,450);
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("B"))
            Greenfoot.setWorld(new StartScreen());
    }
}
