package com.galactic.base;

import java.math.BigDecimal;

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

    Planet moon = new Planet(new Vec2(new BigDecimal(0.3633 * Math.pow(10, 9)), new BigDecimal(0)),
            new Vec2(new BigDecimal(0), new BigDecimal(1082)), 0, 2 * Math.PI / (27.3217 * 86400),
            0.07346 * Math.pow(10, 24));

    Ship ship = new Ship(null, null, 0, 0, 0);

    Simulation sim = new Simulation(earth, moon, ship);

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Kyle!");
    }
}