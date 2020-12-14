import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A deadly bomb. Avoid if you want to live.
 * @author Alex & Kevin 
 * @version v1.0
 */
public class Bomb extends Actor
{
    private int speed = 7;
    
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (getWorld() instanceof Level1) {
            setLocation(getX(), getY() + speed);
            if (getY() == 479) {
                Level1 level1 = (Level1)getWorld();
                level1.removeObject(this);
            }
        }
        
        if (getWorld() instanceof Level2) {
            setLocation(getX(), getY() + speed+5);
            if (getY() == 479) {
                Level2 level2 = (Level2)getWorld();
                level2.removeObject(this);
            }
        }
        
        if (getWorld() instanceof Level3) {
            setLocation(getX(), getY() + speed+10);
            if (getY() == 479) {
                Level3 level3 = (Level3)getWorld();
                level3.removeObject(this);
            }
        }
    }    
        
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
