import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Credit screen.
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        showText("Credits:", 48, 16);
        showText("Fruit Basket is a game for a project in Game Programming.", 312, 40);
        showText("Made by Alex Nguyen & Kevin Judal.", 214, 70);
        showText("For information about the assets, check the README file.", 306, 100);
        showText("Back (\"B\")",56,450);
    }
    
    /**
     * Act - do whatever the Tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (Greenfoot.isKeyDown("B"))
            Greenfoot.setWorld(new StartScreen());
    }
}
