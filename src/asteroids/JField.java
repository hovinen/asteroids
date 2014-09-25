package asteroids;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JComponent;

public class JField extends JComponent implements TickReceiver{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int DIMENSION = 600;
	private Ship ship;

	public JField(Ship ship) {
		super();
		setPreferredSize(new Dimension(DIMENSION, DIMENSION));
		this.ship = ship;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, DIMENSION, DIMENSION);
		g.setColor(Color.BLACK);
		Polygon shipShape = new Polygon();
		shipShape.addPoint((int) (DIMENSION * ship.getXCoordinate()), (int) (DIMENSION * (ship.getYCoordinate() + ship.getSize())));
		shipShape.addPoint((int) (DIMENSION * (ship.getXCoordinate() + ship.getSize())), (int) (DIMENSION * (ship.getYCoordinate())));
		shipShape.addPoint((int) (DIMENSION * (ship.getXCoordinate() - ship.getSize())), (int) (DIMENSION * (ship.getYCoordinate())));
		g.drawPolygon(shipShape);
	}

	@Override
	public void tick() {
		repaint();
		
	}
	
	
}
