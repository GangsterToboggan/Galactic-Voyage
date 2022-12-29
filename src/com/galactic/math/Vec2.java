package com.galactic.math;
import java.math.BigDecimal;
import java.math.MathContext;

public class Vec2 {
    private static final MathContext MATHCONTEXT = MathContext.DECIMAL128;
    private static final double EQ_TOLERANCE = 0.001;
    // fields
    public BigDecimal x, y;

    // constructors
    public Vec2(BigDecimal x, BigDecimal y) {
        this.x = x;
        this.y = y;
    }

    public Vec2(double x, double y) {
        this(new BigDecimal(x, MATHCONTEXT), new BigDecimal(y, MATHCONTEXT));
    }

    public Vec2(int x, int y) {
        this(new BigDecimal(x, MATHCONTEXT), new BigDecimal(y, MATHCONTEXT));
    }

    // non-static methods
    public Vec2 clone() {
        return new Vec2(x, y);
    }

    public double xDub() {
        return x.doubleValue();
    }

    public double yDub() {
        return y.doubleValue();
    }

    public Vec2 add(Vec2 other) {
        return new Vec2(
                x.add(other.x),
                y.add(other.y));
    }

    public Vec2 sub(Vec2 other) {
        return new Vec2(
                x.subtract(other.x),
                y.subtract(other.y));
    }

    public BigDecimal dot(Vec2 other) {
        return x.multiply(other.x).add(y.multiply(other.y));
    }

    public BigDecimal magnitudeSquared() {
        return x.multiply(x).add(y.multiply(y));
    }

    public BigDecimal magnitude() {
        return this.magnitudeSquared().sqrt(MATHCONTEXT);
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Vec2)) {
            return false;
        }
        Vec2 other_n = (Vec2) other;
        if (x.subtract(other_n.x).doubleValue() < EQ_TOLERANCE &&
                y.subtract(other_n.y).doubleValue() < EQ_TOLERANCE) {
            return true;
        }
        return false;
    }

    // static methods
    public Vec2 Unit() {
        return new Vec2(1, 1);
    }

    public Vec2 Zero() {
        return new Vec2(0, 0);
    }

    public Vec2 scale(double coefficient) {
        return this.scale(new BigDecimal(coefficient, MATHCONTEXT));
    }

    public Vec2 scale(BigDecimal coefficient) {
        return new Vec2(this.x.multiply(coefficient), this.y.multiply(coefficient));
    }

}