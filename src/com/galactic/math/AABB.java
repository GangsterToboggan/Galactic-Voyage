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
	public boolean contains(Vec2 point) {
		 var x = point.xDub();
		 var y = point.yDub();
		 var xmin = offset.xDub();
		 var ymin = offset.yDub();
		 var xmax = offset.xDub()+dimensions.xDub();
		 var ymax = offset.yDub() + dimensions.yDub();
		 if (x < xmin || x > xmax) return false;
		 if (y < ymin || y > ymax) return false;
		 return true;
	}
	/// Takes a point that is midway into the prev AABB
	/// and creates a new one that is midway into this AABB.
	public Vec2 scaleInto(Vec2 point, AABB prev) {
		double percentX = (point.xDub() - prev.offset.xDub() )/prev.dimensions.xDub();
		double percentY = (point.yDub() - prev.offset.yDub() )/prev.dimensions.yDub();
		return new Vec2(offset.xDub() + percentX*dimensions.xDub(), offset.yDub()+percentY*dimensions.yDub());
		
	}
}
