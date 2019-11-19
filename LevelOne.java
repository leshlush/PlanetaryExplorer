import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOne extends Planet
{
    private PlayerEntity player;
    private AlienEntity secundus;
    private AlienEntity primus;
    private AlienEntity tertius;
    private AlienEntity quartus;
    private AlienEntity quintus;
    private DoorEntity doorEntity;
    private Statue statueOne, statueTwo, statueThree;
    
    public LevelOne()
    {    
       super(700, 500, 1500);
       player = new PlayerEntity();
       addObject(player, 280, 412);       
       
       primus = AlienEntity.createPrimus();
       addObject(primus, 100, 412);
       
       secundus = AlienEntity.createSecundus();
       addObject(secundus, 650, 412);
       
       tertius = AlienEntity.createTertius();
       addObject(tertius, 250, -160);
       
       quartus = AlienEntity.createQuartus();
       addObject(quartus, 800, -70);
       
       quintus = AlienEntity.createQuintus();
       addObject(quintus, 1300, 100);
       
       doorEntity = new DoorEntity();
       addObject(doorEntity, 845, 400);
       
       statueOne = new Statue();
       addObject(statueOne, 135, 44);
       
       statueTwo = new Statue();
       addObject(statueTwo, 1435, 197);
       
       statueThree = new Statue();
       addObject(statueThree, 1231, -207);
       
       addPlatforms();
    }
    
    public void addPlatforms()
    {
        createPlatform(4, 225, 350);
        createPlatform(2, 275, 220);
        createPlatform(5, 50, 100);
        createPlatform(17, 100, -30);
        createPlatform(8, 680, -175);
        createPlatform(17, 725, 100);
        createPlatform(4, 1000, -280);
        createPlatform(6, 1120, -160);
        createPlatform(9, 1190, 250);
    }
    
    public void victory()
    {
        LevelTwo levelTwo = new LevelTwo();
        levelTwo.addObject(player, 280, 412);
        Greenfoot.setWorld(levelTwo);
    }
    
    
   
}
