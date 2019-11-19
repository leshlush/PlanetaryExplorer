import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    private Block[] blocks;
    
    public Platform(int length)
    {
        blocks = new Block[length];
        
        for(int i = 0; i < length; i = i + 1)
        {
            blocks[i] = new Block();
        }
        
        getImage().setTransparency(0);
    }
    
    public void addedToWorld(World world)
    {
        for(int i = 0; i < blocks.length; i = i + 1)
        {
           Block b = blocks[i];
           int width = b.getImage().getWidth();
           world.addObject(b, getX() + (i * width), getY());
        }
    }
    
     
}
