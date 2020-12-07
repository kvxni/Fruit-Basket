import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Text
{
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
