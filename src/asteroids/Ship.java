package asteroids;

public class Ship implements TickReceiver {
    private double xCoordinate;
    private double yCoordinate;

    private double xSpeed;
    private double ySpeed;

    @Override
    public void tick() {
	xCoordinate = boundCoordinate(xCoordinate + xSpeed);
	yCoordinate = boundCoordinate(yCoordinate + ySpeed);
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
