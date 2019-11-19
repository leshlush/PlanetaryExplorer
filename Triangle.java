import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle extends MovementPath
{
    public void createPath()
    {
        addMarker(+ 0, + 0);
        addMarker(+ 60, + 150);
        addMarker(+ 60, + 120);
        addMarker(+ 60, - 120);
        addMarker(+ 60, - 150);
        addMarker(- 120, + 0);
        addMarker(- 120, + 0);
    }
}
