package asteroids;

import java.util.List;

public class Universe {
    private List<Asteroid> asteroids;

    public Iterable<Asteroid> getAsteriods() {
	return asteroids;
    }

    public void addAsteroid(Asteroid asteroid) {
	asteroids.add(asteroid);
    }
}
