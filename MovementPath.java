import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class MovementPath here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MovementPath extends Actor
{
   private ArrayList<PathMarker> markers;
   protected int startingX;
   protected int startingY;
   
   
   public MovementPath()
   {
       markers = new ArrayList();
       getImage().setTransparency(0);
   }
   
   protected void addedToWorld(World world)
   {
       startingX = getX();
       startingY = getY();
       createPath();
       for(PathMarker marker : markers)
       {
           world.addObject(marker, startingX, startingY);
       }
   }
   
   public void addMarker(int x, int y)
   {
       startingX = startingX + x;
       startingY = startingY + y;
       PathMarker marker = new PathMarker(startingX,startingY);
       markers.add(marker);
   }
   
   public ArrayList<PathMarker> getMarkers()
   {
       return markers;
   }
   
   protected void createPath()
   {
       //override this method in your subclasses
   }
}
