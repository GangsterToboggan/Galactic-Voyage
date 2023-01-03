package com.galactic.math;

import java.math.BigDecimal;

public class Shapes {
	public static Vec2[] circle(int num_points, BigDecimal radius) {
		Vec2[] points = new Vec2[num_points];
		for(int i = 0; i < num_points; i++) {
			double angle = (2*Math.PI*i)/num_points;
			points[i] = new Vec2(radius.multiply(new BigDecimal(Math.cos(angle))), radius.multiply(new BigDecimal(Math.sin(angle))));
		}
		return points;
	}
	public static Vec2[] circle(int num_points, double radius) {
		return Shapes.circle(num_points, new BigDecimal(radius));
	}
	
	public static Vec2[] square(BigDecimal side_length) {
		Vec2[] points = new Vec2[4];
		points[0] = new Vec2(side_length.divide(new BigDecimal(2)), side_length.divide(new BigDecimal(2)));
		points[1] = new Vec2(side_length.divide(new BigDecimal(2)), side_length.divide(new BigDecimal(-2)));
		points[2] = new Vec2(side_length.divide(new BigDecimal(-2)), side_length.divide(new BigDecimal(-2)));
		points[3] = new Vec2(side_length.divide(new BigDecimal(-2)), side_length.divide(new BigDecimal(2)));
		return points;
	}
	
	public static Vec2[] triangle(BigDecimal side_length) {
		Vec2[] points = new Vec2[3];
		points[0] = new Vec2(side_length.divide(new BigDecimal(2)), side_length.divide(new BigDecimal(2)));
		points[1] = new Vec2(side_length.divide(new BigDecimal(2)), side_length.divide(new BigDecimal(-2)));
		points[2] = new Vec2(side_length.divide(new BigDecimal(-2)), side_length.divide(new BigDecimal(0)));
		return points;
	}
}