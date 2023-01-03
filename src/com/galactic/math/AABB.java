package com.galactic.math;
/// Axis aligned bounding box
public class AABB {
	public Vec2 offset;
	public Vec2 dimensions;
	public AABB(int x, int y, int w, int h) {
		this(new Vec2(x,y), new Vec2(w,h));
	}
	public AABB(double x, double y, double w, double h) {
		this(new Vec2(x,y), new Vec2(w,y));
	}
	public AABB(Vec2 offset, Vec2 dimensions) {
		this.offset=offset;
		this.dimensions=dimensions;
	}

}
