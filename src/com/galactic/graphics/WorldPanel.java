package com.galactic.graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class WorldPanel extends JPanel{
	@Override
	public void paintComponent(Graphics g_org) {
		super.paintComponent(g_org);
		Graphics2D g = (Graphics2D) g_org;
		
	}
}
