import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DoorEntity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoorEntity extends Actor
{
    private Door door;
    private Label label;
    
    public DoorEntity()
    {
        door = new Door();
        getImage().setTransparency(0);
    }
    
    protected void addedToWorld(World world)
    {
        world.addObject(door, getX(), getY());
        label = new Label(door.getNumberOfStatues(), 40);
        world.addObject(label, getX(), getY() - 90);
    }
    
    public void act()
    {
        label.setValue(door.getNumberOfStatues());
        label.setLocation(door.getX(), door.getY() - 90);
    }
    
}
