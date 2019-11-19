import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Parabola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parabola extends MovementPath
{
    public void createPath()
    {
        addMarker(+ 0, - 0);
        addMarker(+ 15, - 60);
        addMarker(+ 30, - 60);
        addMarker(+ 60, - 60);
        addMarker(+ 60, - 30);
        addMarker(+ 60, - 0);
        addMarker( + 60, + 30);
        addMarker( + 60, + 60);
        addMarker( + 30, + 60);
        addMarker( + 15, + 60);
    }
}
