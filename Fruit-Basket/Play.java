import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starts the game.
 */
public class Play extends Text
{
    /**
     * Constructor of the Play button.
     */
    public Play()
    {
        GreenfootImage playButton = new GreenfootImage(120,60);
        Font adjustedFont = new Font(true,false,26);
        playButton.setFont(adjustedFont);
        playButton.setColor(Color.BLACK);
        playButton.drawString("Play (\"S\")",0,50);
        setImage(playButton);
    }
}
