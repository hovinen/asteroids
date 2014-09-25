package asteroids;

public class Ship implements TickReceiver {
    private double xCoordinate;
    private double yCoordinate;

    private double xSpeed;
    private double ySpeed;

    @Override
    public void tick() {
	xCoordinate += xSpeed;
	yCoordinate += ySpeed;
    }

    public void accelerate(double deltaX, double deltaY) {
	xSpeed += deltaX;
	ySpeed += deltaY;
    }

    public double getXCoordinate() {
	return xCoordinate;
    }

    public double getYCoordinate() {
	return yCoordinate;
    }
}
