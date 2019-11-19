import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Planet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Planet extends World
{
    private int worldWidth;
    private Block anchor;
        
    public Planet(int windowWidth, int windowHeight, int worldWidth)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(windowWidth, windowHeight, 1, false); 
        this.worldWidth = worldWidth;
        setPaintOrder(Bar.class, Astronaut.class, Alien.class, Block.class);
        
        addFloor();
        addWalls();
    } 
    
    public int getWorldWidth()
    {
        return worldWidth;
    }
    
    
     public void addFloor()
    {
        anchor = new Block();
        addObject(anchor, 0, getHeight() - 20);
        
        int blockWidth = new Block().getImage().getWidth();
        for(int i = 0; i <= getWorldWidth() + blockWidth; i = i + blockWidth)
        {
            addObject(new Block(), i, 480);
        }
    }
    
    public void addWalls()
    {
        addObject(new Wall(), -120, getHeight());
        addObject(new Wall(), worldWidth + 120, getHeight());
    }
    
    public void scrollLeft(int speed)
    {
        List<ScrollingActor> scrollers = (List<ScrollingActor>) getObjects(ScrollingActor.class);
        for(ScrollingActor scroller : scrollers)
        {
            scroller.setLocation(scroller.getX() + speed, scroller.getY());
        }
    }
    
    public void scrollRight(int speed)
    {
        List<ScrollingActor> scrollers = (List<ScrollingActor>) getObjects(ScrollingActor.class);
        for(ScrollingActor scroller : scrollers)
        {
            scroller.setLocation(scroller.getX() - speed, scroller.getY());
        }
    }
    
    public void scrollUp(int speed)
    {
        List<ScrollingActor> scrollers = (List<ScrollingActor>) getObjects(ScrollingActor.class);
        for(ScrollingActor scroller : scrollers)
        {
            scroller.setLocation(scroller.getX() , scroller.getY() + speed);
        }
    }
    
    public void scrollDown(int speed)
    {
        if(anchor.getY() > getHeight() - 20)
        {
        
            List<ScrollingActor> scrollers = (List<ScrollingActor>) getObjects(ScrollingActor.class);
            for(ScrollingActor scroller : scrollers)
            {
                scroller.setLocation(scroller.getX() , scroller.getY() - speed);
            }
        }
    }
    
    protected void createPlatform(int length, int x, int y)
    {
        Platform p = new Platform(length);
        addObject(p, x, y);
    }
    
    public void victory()
    {
        //override in subclasses
    }
}
