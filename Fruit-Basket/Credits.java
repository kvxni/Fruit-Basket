import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends Buttons
{
    public Credits()
    {
        GreenfootImage creditsButton = new GreenfootImage(140,60);
        Font adjustedFont = new Font(true,false,40);
        creditsButton.setFont(adjustedFont);
        creditsButton.setColor(Color.BLACK);
        creditsButton.drawString("Credits",0,50);
        setImage(creditsButton);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new CreditScreen());
    }       
}