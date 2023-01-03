package com.galactic.graphics;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.galactic.base.Simulation;
import com.galactic.ship.Ship;

public class MainWindow {
	public static void start(Simulation sim, Ship ship) {
		JFrame frame = new JFrame();
		frame.setSize(1000,1000);
		frame.setName("Galactic Voyage");
		frame.setTitle("Galactic Voyage");
		ViewportController viewportController = new ViewportController(ship);
		ShipController shipController = new ShipController(ship);
		frame.add(new WorldPanel(sim));
		frame.addMouseListener(viewportController);
		frame.addKeyListener(shipController);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        long prevtime = System.currentTimeMillis();
        while (true) {
        	long ctime = System.currentTimeMillis();
        	//update 
        }
	}
}
