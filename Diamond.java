import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond extends MovementPath
{
   public void createPath()
    {
        addMarker(+ 0, + 0);
        addMarker(+60, +60);
        addMarker(+60, +60);
        addMarker(+60, -60);
        addMarker(+60, -60);
        addMarker(-60, -60);
        addMarker(-60, -60);
        addMarker(-60, +60);
        addMarker(-60, +60);
    }
}
