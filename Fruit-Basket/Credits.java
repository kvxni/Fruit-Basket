import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Credits screen.
 */
public class Credits extends Text
{
    /**
     * Constructor of the Credit screen.
     */
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
