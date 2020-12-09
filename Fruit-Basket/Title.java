import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Title here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Title extends Text
{
    public Title() {
        GreenfootImage creditsButton = new GreenfootImage(400,90);
        Font adjustedFont = new Font(true,false,70);
        creditsButton.setFont(adjustedFont);
        creditsButton.setColor(Color.BLACK);
        creditsButton.drawString("Fruit Basket",0,50);
        setImage(creditsButton);
    }
}
