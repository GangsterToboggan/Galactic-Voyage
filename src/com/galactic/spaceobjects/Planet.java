package com.galactic.spaceobjects;

import com.galactic.base.Body;
import com.galactic.math.Vec2;

public class Planet extends Body {
    // fields

    // constructor
    public Planet(Vec2 pos, Vec2 vel, double ang, double angVel, double mass) {
        super(pos, vel, ang, angVel, mass);
    }

    // non-static methods

    public void update(double deltaT) {

    }

    // static methods
}
