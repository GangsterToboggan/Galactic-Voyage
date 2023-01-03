package com.galactic.graphics;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelEvent;

import com.galactic.math.AABB;
import com.galactic.math.Vec2;
import com.galactic.ship.Ship;

public class ViewportController extends MouseAdapter{
	private static final double MIN_WIDTH = 1.0;
	private static final double STARTING_WIDTH = 100.0;
	// inversely correlated
	private static final double SCROLL_SENSITIVITY = 100.0;
	private Ship ship;
	private double width;
	private double aspectRatio;
	public ViewportController(Ship ship) {
		this.ship=ship;
		this.width = STARTING_WIDTH;
		this.aspectRatio = 1.;
	}
	public void setAspectRatio(double aspectRatio) {
		this.aspectRatio=aspectRatio;
	}
	public Vec2 getViewportOffset() {
		Vec2 soffset = ship.getPos();
		Vec2 relativeCenterOfMass = ship.getBounds().getCenterOfMass();
		return soffset.add(relativeCenterOfMass).sub(getViewportBounds().scale(0.5));
	}
	public Vec2 getViewportBounds() {
		Vec2 viewportBounds = new Vec2(width, width*aspectRatio);
		return viewportBounds;	
	}
	public AABB getViewportAABB() {
		return new AABB(getViewportOffset(), getViewportBounds());
	}
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		width = width + width*(e.getScrollAmount()/SCROLL_SENSITIVITY);
		double minWidth = MIN_WIDTH;
		if (width<minWidth) {
			this.width=minWidth;
		}
	}
}
