package com.galactic.base;

import java.math.BigDecimal;

import com.galactic.graphics.MainWindow;
import com.galactic.math.Vec2;
import com.galactic.ship.Ship;
import com.galactic.spaceobjects.Planet;

public class App {

    /*
     * Units
     * Distance: meters
     * Time: Seconds
     * Mass: Kg
     * Velocity: Meters / Second
     * Angles: Radians (defined like the unit circle, x axis is 0 and positive
     * direction is counter clock-wise)
     * Angular Velocity: Radians / Second
     * Time format: 24h
     * Temperature: Kelvin
     */

    Planet earth = new Planet(new Vec2(0, 0), new Vec2(0, 0), 0, 2 * Math.PI / 86400, 5.972 * Math.pow(10, 24));

    Planet moon = new Planet(new Vec2(0.3633 * Math.pow(10, 9), 0.),
            new Vec2(0.,1082.), 0, 2 * Math.PI / (27.3217 * 86400),
            0.07346 * Math.pow(10, 24));

    Ship ship = new Ship(new Vec2(0.2*Math.pow(10,9),0.), new Vec2(0,0), 0, 0, 0);

    public static final BigDecimal G = new BigDecimal(6.6743 * Math.pow(10, -11));

    Simulation sim = new Simulation(earth, moon, ship);

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Kyle!");
        BigDecimal planetMass = new BigDecimal(Math.pow(10, 6));
        Planet testPlanet = new Planet(new Vec2(0, 0), new Vec2(0, 0), 0, 0, planetMass.doubleValue());
        Ship testShip = new Ship(new Vec2(0, 1000),
                new Vec2(Math.sqrt(App.G.multiply(planetMass).divide(new BigDecimal(1000)).doubleValue()), 0), 0, 0, 1);
        double magnitude = Math.sqrt(App.G.multiply(planetMass).divide(new BigDecimal(1000)).doubleValue());
        double t = 2 * Math.PI * 1000 / (magnitude * 2);
        double deltaT = t / 1000;
        Simulation sim = new Simulation(testPlanet, testShip);
        for (double i = 0; i < t; i += deltaT) {
            sim.update(deltaT);
            System.out.println("Expected:" + magnitude + " actual:" + testShip.getVel().magnitude() + " dif"
                    + (magnitude - testShip.getVel().magnitude().doubleValue()) + " t = " + i + "/" + t);
        }
        System.out.println(testShip.getPos().x + " ," + testShip.getPos().y);
        MainWindow.start(sim);
    }
}