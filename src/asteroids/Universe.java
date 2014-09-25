package asteroids;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Universe implements TickReceiver {
    private static final int NUMBER_OF_ASTEROIDS = 5;

    private final List<Asteroid> asteroids = new ArrayList<>();

    public Iterable<Asteroid> getAsteriods() {
	return asteroids;
    }

    @Override
    public void tick() {
	Random random = new Random();

	for (Asteroid asteroid : asteroids) {
	    asteroid.tick();
	}

	while (asteroids.size() < NUMBER_OF_ASTEROIDS) {
	    addAsteroid(createNewAsteroid(random));
	}
    }

    private Asteroid createNewAsteroid(Random random) {
	return new Asteroid(0.06, random.nextDouble(), 0.05).withVelocity(0.01,
		0);
    }

    private void addAsteroid(Asteroid asteroid) {
	asteroids.add(asteroid);
    }
}
