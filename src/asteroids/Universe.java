package asteroids;

import java.util.ArrayList;
import java.util.List;

public class Universe {
    private final List<Asteroid> asteroids = new ArrayList<>();

    public Universe() {
	asteroids
		.add(new Asteroid(0.25, 0.25, 0.05).withVelocity(-0.01, -0.01));
	asteroids
		.add(new Asteroid(0.65, 0.15, 0.07).withVelocity(-0.015, 0.01));
    }

    public Iterable<Asteroid> getAsteriods() {
	return asteroids;
    }

    public void addAsteroid(Asteroid asteroid) {
	asteroids.add(asteroid);
    }
}
