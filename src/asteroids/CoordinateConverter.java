package asteroids;

import java.awt.Point;

public class CoordinateConverter {
	private int size;
	private Point graphicCoordinate;

	public CoordinateConverter(int size) {
		super();
		this.size = size;
	}
	
	public Point toGraphicCoordinate(double x, double y){
		graphicCoordinate = new Point (size - (int)(size * x), size - (int)(size * y));
		return graphicCoordinate;
	}
	
	public int getX(){
		return graphicCoordinate.x;
	}
	
	public int getY(){
		return graphicCoordinate.y;
	}
}
