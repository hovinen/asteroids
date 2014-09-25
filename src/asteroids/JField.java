package asteroids;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class JField extends JComponent{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int DIMENSION = 600;
	private Ship ship = null;

	public JField() {
		super();
		setPreferredSize(new Dimension(DIMENSION, DIMENSION));
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, DIMENSION, DIMENSION);
	}
	
	
}
