import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bird here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    private GreenfootImage [] image = new GreenfootImage[4];
    private int frame = 10, num = 0, speed = 75;
    private boolean isAtRight;
    
    /**
     * Adds the bird to the World
     */
    public void addedToWorld(World Tree)
    {
        for (int i = 0; i < image.length; i++) {
            image[i] = new GreenfootImage("bird" + i +".png");
        }
        flip();
    }
    
    /**
     * Flips the bird.
     */
    public void flip()
    {
        for (GreenfootImage images : image) {
            images.mirrorHorizontally();
       }
       
    }
    
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isAtEdge() ) { 
            if (getX() >= 639) {
                setLocation(638,getY());
                isAtRight = false;
            } else if (getX() <= 0){
                setLocation(1,getY());
                isAtRight = true;
            }
            flip();
        }
        anims();
        animsR();
    }    
    
    /**
     * Animation of the bird.
     */
    public void anims() {
        if (!isAtRight){
            return;
        }
        if (frame == 0)
            frame=10;
        if (frame == 1) {
            setImage(image[num]);
            num++;
            if (num >= image.length)
                num=0;
            setLocation(getX()+speed, getY());
            if (getX()>getWorld().getWidth()+100)
                setLocation(-100,getY());
        }
        if (frame>0)
            frame--;
    }
    
    /**
     * Animation of the bird.
     */
    public void animsR() {
        if (isAtRight){
            return;
        }
        if (frame == 0)
            frame=10;
        if (frame == 1) {
            setImage(image[num]);
            num++;
            if (num >= image.length)
                num=0;
            setLocation(getX()-speed, getY());
            if (getX()>getWorld().getWidth()+100)
                setLocation(100,getY());
        }
        if (frame>0)
            frame--;
    }
}
