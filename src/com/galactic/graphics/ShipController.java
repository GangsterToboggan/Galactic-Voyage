package com.galactic.graphics;

import javax.swing.JPanel;

import com.galactic.ship.Ship;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ShipController extends KeyAdapter {

    private Ship ship;

    public ShipController(Ship ship) {
        this.ship = ship;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP) {
         System.out.println("dub");   
        }

        if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) {
        }

        if (key == KeyEvent.VK_S || key == KeyEvent.VK_DOWN) {
        }

        if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) {
        }
    }
}
