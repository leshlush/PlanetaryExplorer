import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CageEntity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CageEntity extends Actor
{
   private Cage cage;
   private Gravitator gravitator;
   
   public CageEntity()
   {
       cage = new Cage();
       gravitator = new Gravitator();
       getImage().setTransparency(0);
   }
   
   protected void addedToWorld(World world)
   {
       world.addObject(cage, getX(), getY());
   }
   
   public void act()
   {
       gravitator.gravitate(cage);
   }
}
