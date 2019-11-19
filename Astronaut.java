import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Astronaut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Astronaut extends ScrollingActor implements GravityObject
{
    private int ySpeed;
    private int xSpeed;
    private int shield;
    private int scrollPadding;
    private int absoluteX;
    private boolean facingLeft;
    private GreenfootImage idleLeft;
    private GreenfootImage idleRight;
    private GifImage walkingLeft;
    private GifImage walkingRight;
      
    public Astronaut()
    {
        ySpeed = 0;
        xSpeed = 4;
        shield = 10;
        facingLeft = false;
        scrollPadding = 230;
        idleLeft = new GreenfootImage("IdleAstronautLeft.png");
        idleRight = new GreenfootImage("IdleAstronautRight.png");
        walkingLeft = new GifImage("WalkingAstronautLeft.gif");
        walkingRight = new GifImage("WalkingAstronautRight.gif");
    }
    
    protected void addedToWorld(World world)
    {
        absoluteX = getX();
    }
    
       
    public void moveLeft()
    {
        setLocation(getX() - xSpeed, getY());
        absoluteX = absoluteX - xSpeed;
        facingLeft = true;
    }
    
    public void scrollLeft()
    {
        if(getX() <= scrollPadding)
        {
            Planet p = (Planet) getWorld();
            p.scrollLeft(xSpeed);
        }
    }
    
    public void animateLeft()
    {
        getImage().setTransparency(255);
        GreenfootImage img = walkingLeft.getCurrentImage();
        setImage(img);
    }
    
    public void walkLeft()
    {
        if(absoluteX > 0 + xSpeed)
        {
            moveLeft();
            animateLeft();
            scrollLeft();
        }
    }
    
    public void moveRight()
    {
        setLocation(getX() + xSpeed, getY());
        absoluteX = absoluteX + xSpeed;
        facingLeft = false;
    }
    
    public void scrollRight()
    {
        if(getX() > getWorld().getWidth() - scrollPadding)
        {
            Planet p = (Planet) getWorld();
            p.scrollRight(xSpeed);
        }
    }
    
    public void animateRight()
    {
        getImage().setTransparency(255);
        GreenfootImage img = walkingRight.getCurrentImage();
        setImage(img);
    }
    
    public void walkRight()
    {
        Planet p = (Planet) getWorld();
        if(absoluteX < p.getWorldWidth() + xSpeed)
        {
            moveRight();
            scrollRight();
            animateRight();
        }
    }
    
    public void jump()
    {
        if(ySpeed == 0 && getOneObjectAtOffset(0, getImage().getHeight() / 2, Landable.class) != null)
        {
            ySpeed = 30; 
        }
    }
    
    public void throwLasso(int x, int y)
    {
        List lassos = getWorld().getObjects(Lasso.class);
        if(lassos.isEmpty())
        {
            Lasso lasso = new Lasso();        
            getWorld().addObject(lasso, getX(), getY() - 10);
            lasso.turnTowards(x, y);
        }
    }
    
    @Override
    public Actor getOneIntersectingObject(Class cls)
    {
        return super.getOneIntersectingObject(cls);
    }
    
    @Override
    public Actor getOneObjectAtOffset(int x, int y, Class cls)
    {
        return super.getOneObjectAtOffset(x, y, cls);
    }
    
    @Override
    public int getYSpeed()
    {
        return ySpeed;
    }
    
    @Override
    public void setYSpeed(int ySpeed)
    {
        this.ySpeed = ySpeed;
    }
    
    public int getShield()
    {
        return shield;
    }
    
    public void setShield(int shield)
    {
        this.shield = shield;
    }
}
