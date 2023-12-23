package it.masterengine;

import java.awt.Color;
import java.awt.Graphics2D;

import it.util.Constants;

public class LevelEditorScene extends Scene{

    public LevelEditorScene(String name) {
        super.Scene(name);
    }

    @Override
    public void init() {
        
    }

    @Override
    public void update(double dt) {
        System.out.println("In Here");
    }

    @Override
    public void draw(Graphics2D g2) {
        g2.setColor(Color.BLUE);
        g2.fillRect(0, 0, Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
    }

}
