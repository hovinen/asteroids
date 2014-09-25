package asteroids;


/**
 * Created by MGM\dspirov on 9/25/14.
 */
public class Asteroid extends AbstractFlyingObject {

    public Asteroid(double xCoordinate, double yCoordinate, double size) {
	super(xCoordinate, yCoordinate, size);
    }

    public Asteroid withVelocity(double x, double y) {
	xSpeed = x;
	ySpeed = y;
	return this;
    }
}
