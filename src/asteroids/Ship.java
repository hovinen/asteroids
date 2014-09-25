package asteroids;

public class Ship extends AbstractFlyingObject {
    private static final double SHIP_SIZE = 0.05;

    private final Universe universe;

    public Ship(Universe universe) {
	super(0.5, 0.5, SHIP_SIZE);
	this.universe = universe;
    }

    @Override
    public void tick() {
	xCoordinate = boundCoordinate(xCoordinate + xSpeed);
	yCoordinate = boundCoordinate(yCoordinate + ySpeed);
	checkCollisions();
    }

    private double boundCoordinate(double coordinate) {
	if (coordinate > 1) {
	    coordinate -= Math.floor(coordinate);
	}

	if (coordinate < 0) {
	    coordinate -= Math.floor(coordinate);
	}

	return coordinate;
    }

    private void checkCollisions() {
	for (Asteroid asteroid : universe.getAsteriods()) {
	    if (collidesWith(asteroid)) {
		die();
	    }
	}
    }

    private boolean collidesWith(Asteroid asteroid) {
	return distanceSquared(xCoordinate, yCoordinate,
		asteroid.getXCoordinate(), asteroid.getYCoordinate()) < Math
		.pow(getSize() + asteroid.getSize(), 2);
    }

    private double distanceSquared(double x1, double y1, double x2, double y2) {
	return Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
    }

    public void accelerate(double deltaX, double deltaY) {
	xSpeed += deltaX;
	ySpeed += deltaY;
    }
}
