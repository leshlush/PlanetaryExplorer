import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AlienEntity here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlienEntity extends Actor
{
    private Alien alien;
    private MovementPath path;
    private AlienMovementManager movementManager;
    
    public AlienEntity(Alien alien, MovementPath path)
    {
        this.alien = alien;
        this.path = path;
        getImage().setTransparency(0);
    }
    
    protected void addedToWorld(World world)
    {
        world.addObject(alien, getX(), getY());
        world.addObject(path, getX(), getY());
    }
    
    public void act()
    {
        movementManager.followPath();
        captured();
    }
    
    public void setMovementManager(AlienMovementManager movementManager)
    {
        this.movementManager = movementManager;
    }
    
    public void captured()
    {
        if(alien.getStamina() <= 0)
        {
            World w = getWorld();
            w.addObject(new CageEntity(), alien.getX(), alien.getY());
            w.removeObject(alien);
            w.removeObject(path);
            w.removeObject(this);
        }
    }
    
    public static AlienEntity createPrimus()
    {
        Alien alien = new Primus();
        MovementPath path = new Parabola();
        AlienEntity entity = new AlienEntity(alien, path);
        AlienMovementManager manager = new AlienMovementManager(alien, path);
        entity.setMovementManager(manager);
        
        return entity;
    }
    
    public static AlienEntity createSecundus()
    {
        Alien alien = new Secundus();
        MovementPath path = new Line();
        AlienEntity entity = new AlienEntity(alien, path);
        AlienMovementManager manager = new AlienMovementManager(alien, path);
        entity.setMovementManager(manager);
        
        return entity;
    }
    
    public static AlienEntity createTertius()
    {
        Alien alien = new Tertius();
        MovementPath path = new Diamond();
        AlienEntity entity = new AlienEntity(alien, path);
        AlienMovementManager manager = new AlienMovementManager(alien, path);
        entity.setMovementManager(manager);
        
        return entity;
    }
    
    public static AlienEntity createQuartus()
    {
        Alien alien = new Quartus();
        MovementPath path = new Triangle();
        AlienEntity entity = new AlienEntity(alien, path);
        AlienMovementManager manager = new AlienMovementManager(alien, path);
        entity.setMovementManager(manager);
        
        return entity;
    }
    
    public static AlienEntity createQuintus()
    {
        Alien alien = new Quintus();
        MovementPath path = new ZigZag();
        AlienEntity entity = new AlienEntity(alien, path);
        AlienMovementManager manager = new AlienMovementManager(alien, path);
        entity.setMovementManager(manager);
        
        return entity;
    }
}
