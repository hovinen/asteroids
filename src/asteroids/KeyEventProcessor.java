package asteroids;

public class KeyEventProcessor implements KeyEventReceiver {
    private static double THRUSTER_STRENGTH = 0.001;

    private final Ship ship;

    public KeyEventProcessor(Ship ship) {
	this.ship = ship;
    }

    @Override
    public void upPressed() {
	ship.accelerate(0, THRUSTER_STRENGTH);
    }

    @Override
    public void downPressed() {
	ship.accelerate(0, -THRUSTER_STRENGTH);
    }

    @Override
    public void leftPressed() {
	ship.accelerate(-THRUSTER_STRENGTH, 0);
    }

    @Override
    public void rightPressed() {
	ship.accelerate(THRUSTER_STRENGTH, 0);
    }

    @Override
    public void spacePressed() {
	// TODO Auto-generated method stub

    }

}
