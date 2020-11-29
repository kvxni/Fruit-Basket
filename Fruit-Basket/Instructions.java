import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Buttons
{
    public Instructions()
    {
        GreenfootImage intructionButton = new GreenfootImage(230,60);
        Font adjustedFont = new Font(true,false,40);
        intructionButton.setFont(adjustedFont);
        intructionButton.setColor(Color.BLACK);
        intructionButton.drawString("Instructions",0,50);
        setImage(intructionButton);
    }
    
    public void act() 
    {
        checkMouse();
        checkClick(new InstructionScreen());
    }    
}
