import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A rotten lemon. Does not make good lemonade.
 * @author Alex & Kevin 
 * @version v1.0
 */
public class BadLemon extends Actor
{
    private int speed = 3;
    
    /**
     * Act - do whatever the BadLemon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + speed);
        difficultySpike();
        if (getY() == 479) {
            Tree tree = (Tree)getWorld();
            tree.removeObject(this);
        }
    }    
        
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    private void difficultySpike() {
        int i = 200;
        
        Tree tree = (Tree)getWorld();
        if (tree.getScore() / 100 >= i) {      
            speed += 2;
            i += 200;
        }
    }
}
