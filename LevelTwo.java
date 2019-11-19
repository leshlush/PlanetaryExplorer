import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelTwo extends Planet
{
    private PlayerEntity player;
    private Statue statueOne, statueTwo, statueThree;
    private AlienEntity primus, secundus, tertius, quartus, quintus;
    private DoorEntity door;
    
    public LevelTwo()
    {
        super(700, 500, 1500);
        player = new PlayerEntity();
        addObject(player, 280, 412);
        
        statueOne = new Statue();
        addObject(statueOne, 40, -146);
        
        statueTwo = new Statue();
        addObject(statueTwo, 1400, 422);
        
        statueThree = new Statue();
        addObject(statueThree, 900, - 266);
        
        door = new DoorEntity();
        addObject(door, 60, 405);
        
        primus = AlienEntity.createPrimus();
        addObject(primus, 550, 400);
        
        secundus = AlienEntity.createSecundus();
        addObject(secundus, 1000, 230);
        
        tertius = AlienEntity.createTertius();
        addObject(tertius, 250, -100);
        
        quartus = AlienEntity.createQuartus();
        addObject(quartus, 720, -200);
        
        quintus = AlienEntity.createQuintus();
        addObject(quintus, 1100, -400);
        
        addPlatforms();
    }
    
    public void victory()
    {
        showText("You Win!", 350, 200);
        showText("The Planet Has Been Explored", 350, 320);
        Greenfoot.stop();
    }
    
    public void addPlatforms()
    {
        createPlatform(16, 0, 50);
        createPlatform(6, 690, 400);
        createPlatform(3, 850, 290);
        createPlatform(3, 930, 150);
        createPlatform(8, 1070, 280);
        createPlatform(2, 1200, 140);
        createPlatform(1, 930, 150);
        createPlatform(3, 1300, 70);
        createPlatform(4, 1320, -40);
        createPlatform(8, 1100, -140);
        createPlatform(5, 860, -210);
        createPlatform(4, 650, -60);
        createPlatform(4, 0, -90);
    }
}
