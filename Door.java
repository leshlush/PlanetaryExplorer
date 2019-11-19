import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door extends ScrollingActor
{
    private boolean activated;
    private GreenfootImage activeImage;
    
    public Door()
    {
        activated = false;
        activeImage = new GreenfootImage("ActivatedDoor.png");
    }
    
    public void act()
    {
        activate();
        exit();
    }
    
    public int getNumberOfStatues()
    {
        List<Statue> statues = (List<Statue>) getWorld().getObjects(Statue.class);
        int x = 0;
        for(Statue statue : statues)
        {
            if(!statue.isActivated())
            {
                x++;
            }
        }
        return x;
    }
    
    public void activate()
    {
        if(getNumberOfStatues() == 0)
        {
            activated = true;
            setImage(activeImage);
        }
    }
    
    public void exit()
    {
        if(isTouching(Astronaut.class) && getNumberOfStatues() == 0)
        {
            Planet p = (Planet) getWorld();
            p.victory();
        }
    }
    
}
