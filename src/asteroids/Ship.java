package asteroids;

public class Ship implements TickReceiver {
    private double xCoordinate;
    private double yCoordinate;

    private double xSpeed;
    private double ySpeed;
    
    final private double size = 0.1;

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

	public double getSize() {
		return size;
	}
}
