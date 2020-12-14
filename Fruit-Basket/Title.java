import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Fruit Basket
 * 
 * @author (Kevin Judal & Alex Nguyen) 
 * @version (20201214)
 */
public class Title extends Text
{
    /**
     * Constructor of the title.
     */
    public Title() {
        GreenfootImage creditsButton = new GreenfootImage(400,90);
        Font adjustedFont = new Font(true,false,70);
        creditsButton.setFont(adjustedFont);
        creditsButton.setColor(Color.BLACK);
        creditsButton.drawString("Fruit Basket",0,50);
        setImage(creditsButton);
    }
}
