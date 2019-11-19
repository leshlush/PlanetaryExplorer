import java.util.List;

/**
 * Write a description of class AlienMovementManager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlienMovementManager  
{
    private int markerCount;
    private boolean forwards;
    private PathMarker target;
    private Alien alien;
    private MovementPath path;
    
    public AlienMovementManager(Alien alien, MovementPath path)
    {
        this.alien = alien;
        this.path = path;
        forwards = true;
        markerCount = 0;
    }
    
    public void followPath()
    {
        if(target == null)
        {
            target = path.getMarkers().get(markerCount);
        }
        
        else if(isAtTarget())
        {
            target = getNextTarget();
        }
        
        moveAlienTowardsTarget();
    }
    
    private void moveAlienTowardsTarget()
    {
        alien.turnTowards(target.getX(), target.getY());
        alien.move(alien.getSpeed());
        alien.setRotation(0);
    }
    
    private boolean isAtTarget()
    {
        List<PathMarker> markers = path.getMarkers();
        if(alien.intersects(path.getMarkers().get(markerCount)))
        {
            return true;
        }
        return false;
    }    
        
    private PathMarker getNextTarget()
    {
        if(forwards)
        {
            reachedEnd();
            return getForwardTarget();
        }
        else
        {
            reachedBeginning();
            return getBackwardTarget();
        }
    }
    
    private void reachedEnd()
    {
        if(markerCount == path.getMarkers().size() -2)
        {
            forwards = false;
        }
    }
    
    private void reachedBeginning()
    {
        if(markerCount == 1)
        {
            forwards = true;
        }
    }
    
    private PathMarker getForwardTarget()
    {
        List<PathMarker> markers = path.getMarkers();
        markerCount = markerCount + 1;
        return markers.get(markerCount);
    }
    
    private PathMarker getBackwardTarget()
    {
        List<PathMarker> markers = path.getMarkers();
        markerCount = markerCount - 1;
        return markers.get(markerCount);
    }
    
}
