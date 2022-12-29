package com.galactic.ship;

import com.galactic.base.Body;
import com.galactic.math.Vec2;

public class Ship extends Body {
    // fields
    // constructors
    public Ship(Vec2 pos, Vec2 vel, double ang, double angVel, double mass) {
        super(pos, vel, ang, angVel, mass);
    }
    // non-static methods

    public void update(double deltaT) {
        updatePosOverTime(deltaT);
        updateAngOverTime(deltaT);
        updateForces();
        updateVelocities(deltaT);
    }

    public void updateForces() {
        updateGravity();
    }

    public void updateVelocities(double deltaT) {

    }
    // static methods

}
