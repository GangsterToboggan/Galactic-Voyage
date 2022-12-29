public interface Body {

    public Vec2 getPos();

    public void setPos(Vec2 position);

    public Vec2 getVel();

    public void setVel(Vec2 velocity);

    public double getAng();

    public void setAng(double angle);

    public double getAngVel();

    public void setAngVel(double angularVelocity);

    public double getMass();

    public void setMass(double mass);
}