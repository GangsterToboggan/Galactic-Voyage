package com.galactic.base;

import com.galactic.math.AABB;
import com.galactic.math.Vec2;

public class BoundingPolygon {
	private Vec2[] points;
	private Vec2 centerOfMass;
	public BoundingPolygon(Vec2[] points) {
		this.points=points;
	}
	public Vec2[] getPoints(LOD lod) {
		return points;
	}
	public Vec2[] getPointsWithin(AABB bounding, LOD lod) {
		return points;
	}
	// UNTESTED
	public Vec2 getCenterOfMass() {
		double cx = 0;
        double cy = 0;
        double area = 0;
        int numPoints = points.length;

        for (int i = 0; i < numPoints; i++) {
            Vec2 p1 = points[i];
            Vec2 p2 = points[(i + 1) % numPoints];

            double t = p1.xDub() * p2.yDub() - p2.xDub() * p1.yDub();
            cx += (p1.xDub() + p2.xDub()) * t;
            cy += (p1.yDub() + p2.yDub()) * t;
            area += t;
        }

        area /= 2;
        cx /= (6 * area);
        cy /= (6 * area);

        return new Vec2(cx,cy);
	}
}

