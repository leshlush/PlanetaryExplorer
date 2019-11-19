import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends ScrollingActor
{
    protected int speed;
    protected int stamina;
    protected int strength;
    protected GifImage animation;
    
    public void act()
    {
        setImage(animation.getCurrentImage());
    }
       
    @Override
    public boolean intersects(Actor actor)
    {
        return super.intersects(actor);
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public int getStamina()
    {
        return stamina;
    }
    
    public void setStamina(int stamina)
    {
        this.stamina = stamina;
    }
    
    public int getStrength()
    {
        return strength;
    }
}
