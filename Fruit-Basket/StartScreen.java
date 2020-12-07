import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{
    
    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        // Create a new world with 640x480 cells with a cell size of 1x1 pixels.
        super(640, 480, 1);
        prepare();
        Greenfoot.start();
        
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("S")) 
            Greenfoot.setWorld(new Tree());
        if (Greenfoot.isKeyDown("H")) 
            Greenfoot.setWorld(new InstructionScreen());
        if (Greenfoot.isKeyDown("C")) 
            Greenfoot.setWorld(new CreditScreen());
    }
    
    private void prepare()
    {
        Title title = new Title();
        addObject(title, 320, 160);
        Play play = new Play();
        addObject(play,320,240);
        Instructions intructions = new Instructions();
        addObject(intructions,320,280);
        Credits credits = new Credits();
        addObject(credits,320,320);
    }
}