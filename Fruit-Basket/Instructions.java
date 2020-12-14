import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instruction screen.
 */
public class Instructions extends Text
{
    /**
     * Constructor of the Introduction Screen.
     */
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
