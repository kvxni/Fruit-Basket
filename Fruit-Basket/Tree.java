
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author Alex & Kevin 
 * @version v1.0
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
        score = 0;
        lives = 10;
        showScore();
        showLives();
    }
    
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.getRandomNumber(150) < 1)
            addObject(new Apple(), Greenfoot.getRandomNumber(640), 1);
            
        if (Greenfoot.getRandomNumber(200) < 1)
            addObject(new Cherry(), Greenfoot.getRandomNumber(640), 1);
            
        if (Greenfoot.getRandomNumber(140) < 1)
            addObject(new BadLemon(), Greenfoot.getRandomNumber(640), 1);
            
        if (Greenfoot.getRandomNumber(150) < 1)
            addObject(new Banana(), Greenfoot.getRandomNumber(640), 1);
            
        if (Greenfoot.getRandomNumber(120) < 1)
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
    
    public void addScore(int points) {
        score += points;
        showScore();
    }
    
    public void loseLife(int life) {
        lives -= life;
        showLives();
        if (lives <= 0) {
            Greenfoot.stop();
            showText("Game Over.", 320, 240);
        }
    }
    
    private void showScore()
    {
        showText("Score: " + score, 44, 14);
    }
    
    private void showLives()
    {
        showText("Lives: " + lives, 46, 34);
    }
    
    public int getScore() {
        return score;
    }
}
