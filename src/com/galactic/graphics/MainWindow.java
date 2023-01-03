package com.galactic.graphics;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import com.galactic.base.Simulation;

public class MainWindow {
	public static void start(Simulation sim) {
		JFrame frame = new JFrame();
		frame.setSize(1000,1000);
		frame.setName("Galactic Voyage");
		frame.setTitle("Galactic Voyage");
		frame.add(new WorldPanel(sim));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        long prevtime = System.currentTimeMillis();
        while (true) {
        	long ctime = System.currentTimeMillis();
        	//update 
        }
	}
}
