package asteroids;

public class Ship extends AbstractFlyingObject{


    public void accelerate(double deltaX, double deltaY) {
	    xSpeed += deltaX;
	    ySpeed += deltaY;
    }


}
