package asteroids;

public class Ship  extends AbstractFlyingObject{
    private double xCoordinate = 0.5;
    private double yCoordinate = 0.5;

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
