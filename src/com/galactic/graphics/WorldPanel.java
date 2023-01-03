package com.galactic.graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.galactic.base.Simulation;
import com.galactic.ship.Ship;

public class WorldPanel extends JPanel{
	private Simulation sim;
	private ViewportController viewport;
	public WorldPanel(Simulation sim, Ship ship) {
		ViewportController viewportController = new ViewportController(ship);
		this.addMouseListener(viewportController);
		this.viewport=viewportController;
		this.sim = sim;
	}
	@Override
	public void paintComponent(Graphics g_org) {
		super.paintComponent(g_org);
		Graphics2D g = (Graphics2D) g_org;
		sim.paint(g, AABB );
	}
}
