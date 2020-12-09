import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Text
{
    public Instructions()
    {
        GreenfootImage intructionButton = new GreenfootImage(170,60);
        Font adjustedFont = new Font(true,false,20);
        intructionButton.setFont(adjustedFont);
        intructionButton.setColor(Color.BLACK);
        intructionButton.drawString("Instructions (\"H\")",0,50);
        setImage(intructionButton);
    }
}
