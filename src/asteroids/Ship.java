package asteroids;

public class Ship extends AbstractFlyingObject {
    private static final double SHIP_SIZE = 0.05;

    public Ship() {
	super(SHIP_SIZE);
    }

    public void accelerate(double deltaX, double deltaY) {
	xSpeed += deltaX;
	ySpeed += deltaY;
    }
}
