import greenfoot.*;

public class PlayerControls  
{
   private Astronaut player;
   private boolean jumpButton;
   
   public PlayerControls(Astronaut player)
   {
       this.player = player;
       jumpButton = false;
   }
   
   public void keyCommands()
   {
       if(Greenfoot.isKeyDown("a"))
       {
           player.walkLeft();
       }
       
       if(Greenfoot.isKeyDown("d"))
       {
           player.walkRight();
       }
       
       if(Greenfoot.isKeyDown("space") && jumpButton == false)
       {
           player.jump();
           jumpButton = true;
       }
       
       else if(!Greenfoot.isKeyDown("space") && jumpButton == true)
       {
           jumpButton = false;
       }
   }
   
   public void mouseCommands()
   {
       greenfoot.MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null && mouse.getButton() == 1)
        {
            player.throwLasso(mouse.getX(), mouse.getY());
        }
   }
}
