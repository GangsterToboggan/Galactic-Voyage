package com.galactic.graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.galactic.base.Simulation;

public class WorldPanel extends JPanel{
	private Simulation sim;
	public WorldPanel(Simulation sim) {
		this.sim = sim;
	}
	@Override
	public void paintComponent(Graphics g_org) {
		super.paintComponent(g_org);
		Graphics2D g = (Graphics2D) g_org;
		
	}
}
