public interface Body {

    public Vec2 getPos();

    public Vec2 setPos(Vec2 position);

    public Vec2 getVel();

    public Vec2 setVel(Vec2 velocity);

    public double getAng();

    public double setAng(double angle);

    public double getAngVel();

    public double setAngVel(double angularVelocity);

    public double getMass();

    public double setMass(double mass);
}