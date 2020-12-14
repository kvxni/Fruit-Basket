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
    
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (Greenfoot.isKeyDown("S")) 
            Greenfoot.setWorld(new LevelStart(1,0,10));
        if (Greenfoot.isKeyDown("H")) 
            Greenfoot.setWorld(new InstructionScreen());
        if (Greenfoot.isKeyDown("C")) 
            Greenfoot.setWorld(new CreditScreen());
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
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
        introductions();
    }
    
    /**
     * Introduction of the authors, the course name, the school year,
     * and the professor.
     */
    public void introductions(){
        showText("Alex Nguyen & Kevin Judal",getWidth()/2,400);
        showText("Game Programming 1",getWidth()/2,420);
        showText("Fall 2020",getWidth()/2,440);
        showText("Tassia Araujo",getWidth()/2,460);
    }
}