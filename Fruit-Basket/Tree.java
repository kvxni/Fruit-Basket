import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree extends World
{
    private int score;
    private int lives;
    
    /**
     * Constructor for objects of class Tree.
     */
    public Tree()
    {    
        super(640, 480, 1); 
        prepare();
    }
    
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (Greenfoot.getRandomNumber(170) < 1)
            addObject(new Apple(), Greenfoot.getRandomNumber(640), 1);
            
        if (Greenfoot.getRandomNumber(230) < 1)
            addObject(new Cherry(), Greenfoot.getRandomNumber(640), 1);
            
        if (Greenfoot.getRandomNumber(160) < 1)
            addObject(new BadLemon(), Greenfoot.getRandomNumber(640), 1);
            
        if (Greenfoot.getRandomNumber(180) < 1)
            addObject(new Banana(), Greenfoot.getRandomNumber(640), 1);
            
        if (Greenfoot.getRandomNumber(150) < 1)
            addObject(new Bomb(), Greenfoot.getRandomNumber(640), 1);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Basket basket = new Basket();
        addObject(basket,70,400);
    }
}
