import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
       if (isAtEdge())
       {
           turn(17);
    }
    move(5);
}
}



