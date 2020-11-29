import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A crunchy apple. Très deliceuse!
 * @author Alex & Kevin
 * @version v1.0
 */
public class Apple extends Actor
{
    private int speed = 5;
    
    public void act() 
    {
        setLocation(getX(), getY() + speed);
        difficultySpike();
        if (getY() == 479) {
            Tree tree = (Tree)getWorld();
            tree.removeObject(this);
        }
    }    
    
    private void difficultySpike() {
        int i = 100;
        Tree tree = (Tree)getWorld();
        if (tree.getScore() / 100 >= i) {      
            speed += 10;
            i += 100;
        }
    }
}
