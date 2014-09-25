package asteroids;

abstract class AbstractFlyingObject implements TickReceiver {
    protected double xCoordinate;
    protected double yCoordinate;

    protected double xSpeed;
    protected double ySpeed;

    private final double size;

    private DeathNotifier deathNotifier;

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
	this.deathNotifier.notifyOfDeath(this);
    }

    public void setDeathNotifier(DeathNotifier deathNotifier) {
	this.deathNotifier = deathNotifier;
    }
}
