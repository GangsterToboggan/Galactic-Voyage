package com.galactic.base;

import com.galactic.math.AABB;
import com.galactic.math.Vec2;

public class BoundingPolygon {
	private Vec2[] points;
	public BoundingPolygon(Vec2[] points) {
		this.points=points;
	}
	public Vec2[] getPoints(LOD lod) {
		return points;
	}
	public Vec2[] getPointsWithin(AABB bounding, LOD lod) {
		return points;
	}
}

