import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lasso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lasso extends ScrollingActor
{
    private int speed;
    private GifImage img;
        
    public Lasso()
    {
        speed = 8;
        img = new GifImage("Lasso.gif");
    }
    
    public void act()
    {
        move(speed);
        setImage(img.getCurrentImage());
        disappear();
        if(getWorld() != null)
        {
            hitAlien();
        }
    }
    
    public void disappear()
    {
        if(isAtEdge() || isTouching(Block.class))
        {
            getWorld().removeObject(this);
        }
    }
    
    public void hitAlien()
    {
        Alien alien = (Alien) getOneIntersectingObject(Alien.class);
        if(alien != null)
        {
            alien.setStamina(alien.getStamina() - 1);
            getWorld().removeObject(this);
        }
    }
    
   
    
    
}
