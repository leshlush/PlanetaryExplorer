import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Statue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Statue extends ScrollingActor
{
    private boolean activated;
    private GreenfootImage activeImage;
    
    public Statue()
    {
        activated = false;
        activeImage = new GreenfootImage("ActivatedStatue.png");
    }
    
    
    public void act() 
    {
        activate();
    } 
    
    public void activate()
    {
        if(activated == false && isTouching(Astronaut.class))
        {
            activated = true;
            setImage(activeImage);
        }
    }
    
    public boolean isActivated()
    {
        return activated;
    }
}
