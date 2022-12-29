package com.galactic.base;

import com.galactic.math.Vec2;

public abstract class Body {

    // fields

    private Vec2 pos;

    private Vec2 vel;

    public Vec2 sumOfForces = new Vec2(0, 0);

    private Vec2 sumOfAngularForces = new Vec2(0, 0);

    private double ang;

    private double angVel;

    private double mass;

    // constructor
    public Body(Vec2 pos, Vec2 vel, double ang, double angVel, double mass) {
        this.pos = pos;
        this.vel = vel;
        this.ang = ang;
        this.angVel = angVel;
        this.mass = mass;
    }

    // methods

    public Vec2 getPos() {
        return this.pos;
    }

    public void setPos(Vec2 position) {
        this.pos = position;
    }

    public Vec2 getVel() {
        return this.vel;
    }

    public void setVel(Vec2 velocity) {
        this.vel = velocity;
    }

    public double getAng() {
        return this.ang;
    }

    public void setAng(double angle) {
        this.ang = angle;
    }

    public double getAngVel() {
        return this.angVel;
    }

    public void setAngVel(double angularVelocity) {
        this.angVel = angularVelocity;
    }

    public double getMass() {
        return this.mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void updatePosOverTime(double deltaT) {
        this.pos = this.pos.add(this.vel.scale(deltaT));
    }

    public void updateAngOverTime(double deltaT) {
        this.ang += this.angVel * deltaT;
    }
}