package com.galactic.base;

import java.util.ArrayList;

import com.galactic.spaceobjects.Planet;

public class BodyManager {
    // fields
    private Body[] bodies;
    // constructors

    public BodyManager(Body... bodies) {
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

    // static methods
}