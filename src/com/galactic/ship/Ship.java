package com.galactic.ship;

import java.math.BigDecimal;

import com.galactic.base.Body;
import com.galactic.base.BoundingPolygon;
import com.galactic.math.Shapes;
import com.galactic.math.Vec2;

public class Ship extends Body {
    // fields
    // constructors
    public Ship(Vec2 pos, Vec2 vel, double ang, double angVel, double mass) {
        super(pos, vel, ang, angVel, mass, new BoundingPolygon(Shapes.square(new BigDecimal(10.0))));
    }

    // non-static methods
    public void updateThrusts() {

    }
    // static methods

}
