
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree here.
 * 
 * @author Alex & Kevin 
 * @version v1.0
 */
public class Level2 extends World
{
    private int score;
    private int lives;
    
    
    /**
     * Constructor for objects of class Tree.
     */
    public Level2(int score, int lives)
    {    
        super(640, 480, 1); 
        prepare();
        this.score = score;
        this.lives = lives;
        showScore();
        showLives();
        addObject(new Bird(),60,60);
        setPaintOrder(Leaves.class, Grass.class);
    }
    
    /**
     * Act - do whatever the Tree wants to do. This method is called whenever
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
        
        if (score >= 1000) 
            Greenfoot.setWorld(new LevelStart(3,score,lives));
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Basket basket = new Basket();
        addObject(basket,70,400);
        Grass grass = new Grass();
        addObject(grass,320,440);
        Leaves leaves = new Leaves();
        addObject(leaves,320,20);
        addObject(new Bird(),60,60);
        showText("Level 2",600, 14);
    }
    
    /**
     * Adds points to the score.
     * @params points The amount of points.
     */
    public void addScore(int points) {
        score += points;
        showScore();
    }
    
    /**
     * Substracts life to the lives 
     * @params life The amount of lives lost.
     */
    public void loseLife(int life) {
        lives -= life;
        showLives();
        if (lives <= 0) {
            Greenfoot.stop();
            showText("Game Over.", 320, 240);
        }
    }
    
    /**
     * Displays the score.
     */
    private void showScore()
    {
        showText("Score: " + score, 44, 14);
    }
    
    /**
     * Displays the lives.
     */
    private void showLives()
    {
        showText("Lives: " + lives, 46, 34);
    }

    public int getScore() {
        return score;
    }
}
