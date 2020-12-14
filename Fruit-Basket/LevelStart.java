import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelStart extends World
{
    private int level;
    private int score;
    private int lives;
    
    /**
     * Constructor for objects of class Level1Start.
     * 
     */
    public LevelStart(int level, int score, int lives)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1);
        this.level = level;
        this.score = score;
        this.lives = lives;
        intro();
    }
    
    public void act() {
        Greenfoot.delay(200);
        if (level == 1) {
            Greenfoot.setWorld(new Level1());
        } else if (level == 2) {
            Greenfoot.setWorld(new Level2(score,lives));
        } else if (level == 3) {
            Greenfoot.setWorld(new Level3(score,lives));
        }
    }
    
    public void intro() {
        int minScore = 0;
        switch (level) {
            case 1: minScore = 500;
            break;
            case 2: minScore = 1000;
            break;
        }
        showText("Level " + level, getWidth()/2, getHeight()/2);
        showText("Earn " + minScore + " points to move to the next level.", getWidth()/2, getHeight()/2+20);
        showText("Avoid the lemon and the bomb.",getWidth()/2, getHeight()/2+40);
    }
}

