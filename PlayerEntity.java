import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerEntity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerEntity extends Actor
{
    private Astronaut astronaut;
    private Gravitator gravitator;
    private PlayerControls controls;
    private Bar shieldBar;
    private InvulnerabilityManager invuln;
    
    public PlayerEntity()
    {
        getImage().setTransparency(0);
        
        astronaut = new Astronaut();
        gravitator = new Gravitator();
        controls = new PlayerControls(astronaut);
        shieldBar = new Bar("Shield: ", 10, 10);
        invuln = new InvulnerabilityManager(astronaut);
    }
    
    protected void addedToWorld(World world)
    {
        world.addObject(astronaut, getX(), getY());
        world.addObject(shieldBar, 100, 50);
    }
    
    public void act()
    {
        gravitator.gravitate(astronaut);
        controls.keyCommands();
        controls.mouseCommands();
        shieldBar.setValue(astronaut.getShield());
        invuln.manageInvulnerability();
        collideWithAlien();
        gameOver();
    }
    
    public void gameOver()
    {
        if(astronaut.getShield() <= 0)
        {
            getWorld().showText("You Lose", 350, 100);
            getWorld().showText("Try Again", 350, 320);
            Greenfoot.stop();
        }
    }   
    
    public void collideWithAlien()
    {
        Alien alien = (Alien) astronaut.getOneIntersectingObject(Alien.class);
        if(alien != null && !invuln.isInvulnerable())
        {
            astronaut.setShield( astronaut.getShield() - alien.getStrength() );
            invuln.setInvulnerable();
        }
    }
}
