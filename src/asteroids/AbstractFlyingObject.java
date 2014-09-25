package asteroids;

abstract class AbstractFlyingObject implements TickReceiver {
    private double xCoordinate;
    private double yCoordinate;

    protected double xSpeed;
    protected double ySpeed;

    private final double size;

    public AbstractFlyingObject(double size) {
	this.size = size;
    }

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
