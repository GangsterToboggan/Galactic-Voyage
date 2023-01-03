package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;

import org.junit.Test;

import com.galactic.base.App;
import com.galactic.base.Simulation;
import com.galactic.math.Vec2;
import com.galactic.ship.Ship;
import com.galactic.spaceobjects.Planet;

public class OrbitalForcesTest {
    BigDecimal planetMass = new BigDecimal(Math.pow(10, 6));
    Planet testPlanet = new Planet(new Vec2(0, 0), new Vec2(0, 0), 0, 0, planetMass.doubleValue());
    Ship testShip = new Ship(new Vec2(0, 1000),
            new Vec2(Math.sqrt(App.G.multiply(planetMass).divide(new BigDecimal(1000)).doubleValue()), 0), 0, 0, 1);

    @Test
    public void constantVelocityInCircularOrbit() {
        double magnitude = Math.sqrt(App.G.multiply(planetMass).divide(new BigDecimal(1000)).doubleValue());
        double t = 2 * Math.PI * 1000 / magnitude;
        double deltaT = t / 1000;
        Simulation sim = new Simulation(testPlanet, testShip);
        for (double i = 0; i < t; i += deltaT) {
            sim.update(deltaT);
            assertTrue((testShip.getVel().magnitude().doubleValue() - magnitude) < 1
                    && (testShip.getVel().magnitude().doubleValue() - magnitude) > -1);
        }
    }

    @Test
    public void movedHalfwayAroundCircle() {
        double magnitude = Math.sqrt(App.G.multiply(planetMass).divide(new BigDecimal(1000)).doubleValue());
        double t = 2 * Math.PI * 1000 / (magnitude * 2);
        double deltaT = t / 1000;
        Simulation sim = new Simulation(testPlanet, testShip);
        for (double i = 0; i < t; i += deltaT) {
            sim.update(deltaT);
        }
        assertTrue(testShip.getPos().x.intValue() < 100 && testShip.getPos().y.intValue() > -100);
        assertTrue(testShip.getPos().y.intValue() == -1000);
    }
}
