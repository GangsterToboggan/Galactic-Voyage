package com.galactic.base;

import java.math.BigDecimal;
import java.util.ArrayList;

import com.galactic.math.Vec2;
import com.galactic.ship.Ship;
import com.galactic.spaceobjects.Planet;

public class Simulation {
    // fields
    private Body[] bodies;
    public final BigDecimal G = new BigDecimal(6.6743 * Math.pow(10, -11));
    // constructors

    public Simulation(Body... bodies) {
        this.bodies = bodies;
    }

    // non-static methods
    public Body[] getBodies() {
        return this.bodies;
    }

    public void setBodies(Body[] bodies) {
        this.bodies = bodies;
    }

    public Planet[] getPlanets() {
        ArrayList<Planet> planets = new ArrayList<Planet>();
        for (Body body : bodies) {
            if (body instanceof Planet) {
                planets.add((Planet) body);
            }
        }
        return (Planet[]) planets.toArray();
    }

    public Ship[] getShips() {
        ArrayList<Ship> ships = new ArrayList<Ship>();
        for (Body body : bodies) {
            if (body instanceof Planet) {
                ships.add((Ship) body);
            }
        }
        return (Ship[]) ships.toArray();
    }

    public void update(double deltaT) {
        updatePositions(deltaT);
        updateForces();
        updateVelocities(deltaT);
    }

    public void updatePositions(double deltaT) {
        for (Body body : bodies) {
            body.updatePosOverTime(deltaT);
            body.updateAngOverTime(deltaT);
        }
    }

    public void updateForces() {
        clearForces();
        updateGravity();
        updateCollisions();
    }

    public void clearForces() {
        for (Body body : bodies) {
            body.sumOfForces = new Vec2(0, 0);
        }
    }

    public void updateGravity() {
        for (Body otherBody : bodies) {
            for (Body body : bodies) {
                if (!body.equals(otherBody)) {
                    Vec2 r = otherBody.getPos().sub(body.getPos());
                    double sinR = r.y.doubleValue() / r.magnitude().doubleValue();
                    double cosR = r.x.doubleValue() / (r.magnitude().doubleValue());
                    double magnitude = (G.doubleValue() * (body.getMass() * otherBody.getMass()))
                            / (r.magnitudeSquared().doubleValue());
                    Vec2 forceOfGravity = new Vec2(magnitude * (cosR),
                            magnitude * (sinR));
                    // Vec2 forceOfGravity = Vec2.Unit();
                    body.sumOfForces.add(forceOfGravity);
                }
            }
        }
    }

    public void updateCollisions() {

    }

    public void updateVelocities(double deltaT) {
        for (Body body : bodies) {
            body.setVel(body.sumOfForces.scale(1 / body.getMass()).scale(deltaT).add(body.getVel()));
        }
    }

    // static methods
}