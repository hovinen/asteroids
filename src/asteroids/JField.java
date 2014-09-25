package asteroids;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

import javax.swing.JComponent;

public class JField extends JComponent implements TickReceiver{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int DIMENSION = 600;
	private Ship ship;
	private Universe universe;
	
	private final CoordinateConverter converter = new CoordinateConverter(DIMENSION);

	public JField(Ship ship, Universe universe) {
		super();
		setFocusable(true);
		setPreferredSize(new Dimension(DIMENSION, DIMENSION));
		this.ship = ship;
		this.universe = universe;
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, DIMENSION, DIMENSION);
		g.setColor(Color.BLACK);
		Polygon shipShape = new Polygon();
		final double x = ship.getXCoordinate();
		final double y = ship.getYCoordinate();
		final double size = ship.getSize();
		converter.toGraphicCoordinate(x, y + size/2);
		shipShape.addPoint(converter.getX(), converter.getY());
		converter.toGraphicCoordinate(x + size/2, y - size/2);
		shipShape.addPoint(converter.getX(), converter.getY());
		converter.toGraphicCoordinate(x - size/2, y - size/2);
		shipShape.addPoint(converter.getX(), converter.getY());
		g.drawPolygon(shipShape);
		
		g.setColor(Color.BLUE);
		for(Asteroid asteroid : universe.getAsteriods()){
			Point asteroidCoordinate = converter.toGraphicCoordinate(asteroid.getXCoordinate(), asteroid.getYCoordinate());
			final int asteroidGraphicSize = (int) (asteroid.getSize() * DIMENSION);
			g.drawOval(asteroidCoordinate.x, asteroidCoordinate.y, asteroidGraphicSize, asteroidGraphicSize);
		}
			
	}

	@Override
	public void tick() {
		repaint();
		
	}
	
	
}
