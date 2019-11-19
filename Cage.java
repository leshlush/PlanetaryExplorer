import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cage extends ScrollingActor implements Landable, GravityObject
{
    private int ySpeed;
    
    public Cage()
    {
        ySpeed = 0;
    }
    
    @Override
    public Actor getOneObjectAtOffset(int x, int y, Class cls)
    {
        return super.getOneObjectAtOffset(x, y, cls);
    }
    
    @Override
    public int getYSpeed()
    {
        return ySpeed;
    }
    
    @Override
    public void setYSpeed(int ySpeed)
    {
        this.ySpeed = ySpeed;
    }
}
