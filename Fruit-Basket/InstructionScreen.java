import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instruction Screen.
 */
public class InstructionScreen extends World
{
    /**
     * Constructor for objects of class InstructionScreen.
     * 
     */
    public InstructionScreen()
    {    
        super(640, 480, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        showText("How to play:", 64, 16);
        showText("- Move with the \"A\" and \"D\" keys.", 180, 44);
        showText("- Hold Shift to speed up.", 137, 74);
        showText("- Get as much points as possible.", 180, 104);
        showText("- Avoid the bombs and the rotten lemons.", 216, 134);
        showText("- Have fun.", 75, 164);
        showText("Back (\"B\")", 56, 450);
    }
    
    /**
     * Act - do whatever the Tree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (Greenfoot.isKeyDown("B"))
            Greenfoot.setWorld(new StartScreen());
    }
}
