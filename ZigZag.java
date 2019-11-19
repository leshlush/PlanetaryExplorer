import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ZigZag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZigZag extends MovementPath
{
    public void createPath()
    {
        addMarker(+ 0, + 0);
        addMarker(- 240, + 30);
        addMarker(+ 90, + 30);
        addMarker(- 90, + 60);
        addMarker(+ 210, + 60);
        addMarker(+ 30, + 60);
        
    }
}
