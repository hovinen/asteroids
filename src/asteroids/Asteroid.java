package asteroids;


/**
 * Created by MGM\dspirov on 9/25/14.
 */
public class Asteroid extends AbstractFlyingObject {

    public Asteroid(double xCoordinate, double yCoordinate, double size) {
	super(xCoordinate, yCoordinate, size);
    }

    @Override
    public void tick() {
	xCoordinate += xSpeed;
	yCoordinate += ySpeed;

	if (xCoordinate < 0 || xCoordinate > 1) {
	    die();
	}
	if (yCoordinate < 0 || yCoordinate > 1) {
	    die();
	}
    }

    public Asteroid withVelocity(double x, double y) {
	xSpeed = x;
	ySpeed = y;
	return this;
    }
}
