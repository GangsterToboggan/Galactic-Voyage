public class Ship implements Body {
    // fields

    private Vec2 pos;

    private Vec2 vel;

    private double ang;

    private double angVel;

    private double mass;

    // constructors
    // non-static methods

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

    // static methods

}
