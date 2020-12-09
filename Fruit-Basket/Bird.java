import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    private GreenfootImage [] images = new GreenfootImage[4];
    private int frame = 10, num = 0, speed = 75;
    
    public void addedToWorld(World Tree)
    {
       for (int i = 0; i < images.length; i++) {
            images[i] = new GreenfootImage("bird" + i +".png");
       }
        setImage(images[0]);
    }
    
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        anims();
    }    
    
    /**
     * Animation of the bird.
     */
    public void anims() {
        if (frame == 0)
            frame=10;
        if (frame == 1) {
            setImage(images[num]);
            num++;
            if (num >= images.length)
                num=0;
            setLocation(getX()+speed, getY());
            if (getX()>getWorld().getWidth()+100)
                setLocation(-100,getY());
        }
        if (frame>0)
            frame--;
    }
}
