import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class InstructionScreen extends World
{

    /**
     * Constructor for objects of class InstructionScreen.
     * 
     */
    public InstructionScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1);
        prepare();
    }
    
    private void prepare() {
        showText("How to play:", 64, 16);
        showText("- Move with the \"A\" and \"D\" keys.", 180, 44);
        showText("- Hold Shift to speed up.", 137, 74);
        showText("- Get as much points as possible.", 180, 104);
        showText("- Avoid the bombs and the rotten lemons.", 216, 134);
        showText("- Have fun.", 75, 164);
        showText("Back (\"B\")", 56, 450);
    }
    
    public void act() {
        if (Greenfoot.isKeyDown("B"))
            Greenfoot.setWorld(new StartScreen());
    }
}
