import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PathMarker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PathMarker extends ScrollingActor
{
    private int x;
    private int y;
    
    
   public PathMarker(int x, int y)
   {
       this.x = x;
       this.y = y;
       getImage().setTransparency(0);
   }
   
   protected void addedToWorld(World world)
   {
       setLocation(x, y);
   }
}
