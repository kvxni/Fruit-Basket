import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends Text
{
    public Credits()
    {
        GreenfootImage creditsButton = new GreenfootImage(120,60);
        Font adjustedFont = new Font(true,false,20);
        creditsButton.setFont(adjustedFont);
        creditsButton.setColor(Color.BLACK);
        creditsButton.drawString("Credits (\"C\")",0,50);
        setImage(creditsButton);
    }
}
