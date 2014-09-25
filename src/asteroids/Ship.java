package asteroids;

public class Ship {
    private double xCoordinate;
    private double yCoordinate;

    private double xSpeed;
    private double ySpeed;

    public void tick() {
	xCoordinate += xSpeed;
	yCoordinate += ySpeed;
    }

    public double getXCoordinate() {
	return xCoordinate;
    }

    public double getYCoordinate() {
	return yCoordinate;
    }
}
