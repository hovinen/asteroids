package asteroids;

abstract class AbstractFlyingObject implements TickReceiver {
    protected double xCoordinate;
    protected double yCoordinate;

    protected double xSpeed;
    protected double ySpeed;

    private final double size;

    public AbstractFlyingObject(double xCoordinate, double yCoordinate,
	    double size) {
	this.xCoordinate = xCoordinate;
	this.yCoordinate = yCoordinate;
	this.size = size;
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

    protected void die() {
	System.out.println("I'm dead");
    }
}
