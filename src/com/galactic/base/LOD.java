package com.galactic.base;
/// Level of Detail. Useful for rendering and pruning the bounding polygon
public enum LOD {
	FULL(1.0,1.0), 
	HIGH(0.8,1.0), 
	MED(0.3,0.5), 
	LOW(0.1,0.2);
	// This specifies how many points we should look through to determine which points are inside the bounding box
	public final double examPercentage;
	// This specifies how many points we should return from those we are looking through
	public final double returnPercentage;
	private LOD(double exam,double ret) {
		this.examPercentage=exam;
		this.returnPercentage=ret;
	}
}
